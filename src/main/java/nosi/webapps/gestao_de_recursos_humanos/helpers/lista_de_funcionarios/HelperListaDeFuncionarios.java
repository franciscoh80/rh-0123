package nosi.webapps.gestao_de_recursos_humanos.helpers.lista_de_funcionarios;

import static nosi.core.i18n.Translator.gt;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import nosi.core.webapp.Core;
import nosi.webapps.gestao_de_recursos_humanos.dao.TDepartments;
import nosi.webapps.gestao_de_recursos_humanos.dao.TEmployees;
import nosi.webapps.gestao_de_recursos_humanos.dao.TJobs;
import nosi.webapps.gestao_de_recursos_humanos.pages.lista_de_funcionarios.Lista_de_funcionarios;
import nosi.webapps.gestao_de_recursos_humanos.pages.lista_de_funcionarios.Lista_de_funcionariosController;
import nosi.webapps.gestao_de_recursos_humanos.pages.lista_de_funcionarios.Lista_de_funcionariosView;

/**
 * USER 20/03/2023
 */
public class HelperListaDeFuncionarios {

	public static void index(Lista_de_funcionarios model, Lista_de_funcionariosView view,
			Lista_de_funcionariosController lista_de_funcionariosController) {
		// TODO Auto-generated method stub

		try {
			TDepartments tdepartmentsfilter = new TDepartments().find();
			List<TDepartments> tdepartmentsList = tdepartmentsfilter.all();
			LinkedHashMap<String, String> departamento_id = new LinkedHashMap<>();
			departamento_id.put(null, gt("-- Selecionar --"));
			for (TDepartments tdepartments : tdepartmentsList) {
				departamento_id.put(tdepartments.getDepartmentId().toString(), gt(tdepartments.getDepartmentName()));
			}
			view.departamento_id.setValue(departamento_id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			TJobs tjobsfilter = new TJobs().find();
			List<TJobs> tjobsList = tjobsfilter.all();
			LinkedHashMap<String, String> funcao_id = new LinkedHashMap<>();
			funcao_id.put(null, gt("-- Selecionar --"));
			for (TJobs tjobs : tjobsList) {
				funcao_id.put(tjobs.getJobId().toString(), gt(tjobs.getJobTitle()));
			}
			view.funcao_id.setValue(funcao_id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			TEmployees temployeesfilter = new TEmployees().find();
			if (Core.isNotNullOrZero(model.getDepartamento_id())) {
				temployeesfilter.andWhere("departmentId.departmentId", "=", Core.toInt(model.getDepartamento_id()));
			}
			if (Core.isNotNullOrZero(model.getFuncao_id())) {
				temployeesfilter.orWhere("jobId.jobId", "=", Core.toInt(model.getFuncao_id()));
			}
			List<TEmployees> temployeesList = temployeesfilter.orderByAsc("firstName").all();
			List<Lista_de_funcionarios.Table_1> temployeesTable = new ArrayList<>();
			if (Core.isNotNull(temployeesList)) {
				for (TEmployees temployees : temployeesList) {
					Lista_de_funcionarios.Table_1 row = new Lista_de_funcionarios.Table_1();

					if (Core.isNotNullOrZero(temployees.getStatus())) {
						row.setStatus(temployees.getStatus());
					} else {
						row.setStatus("ACTIVE");
					}

					if (Core.isNotNullOrZero(temployees.getDepartmentId())) {
						row.setDepartamento(temployees.getDepartmentId().getDepartmentName());
					}

					row.setFuncao(temployees.getJobId().getJobTitle());
					row.setNome(temployees.getFirstName());
					row.setApelido(temployees.getLastName());
					row.setEmail(temployees.getEmail());
					row.setSalario(temployees.getSalary());
					row.setId(temployees.getEmployeeId().toString());

					lista_de_funcionariosController.addQueryString("p_id", Core.getParam("p_id"));

					view.btn_editar.addParameter("isEdit", "true");

					if (temployees.getStatus() == "INACTIVE") {
						row.hiddenButton(view.btn_eliminar);
					}

					temployeesTable.add(row);
				}
				model.setTable_1(temployeesTable);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
