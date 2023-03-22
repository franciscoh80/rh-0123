package nosi.webapps.gestao_de_recursos_humanos.helpers.mapa_de_ferias;

import org.hibernate.Session;
import org.hibernate.Transaction;

import static nosi.core.i18n.Translator.gt;

import java.io.IOException;//
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//

import nosi.core.webapp.Model;
import nosi.webapps.gestao_de_recursos_humanos.dao.TDepartments;
import nosi.webapps.gestao_de_recursos_humanos.dao.TEmployees;
import nosi.webapps.gestao_de_recursos_humanos.dao.TJobs;
import nosi.webapps.gestao_de_recursos_humanos.dao.TVacationMap;
import nosi.webapps.gestao_de_recursos_humanos.pages.mapa_de_ferias.Mapa_de_ferias;
import nosi.webapps.gestao_de_recursos_humanos.pages.mapa_de_ferias.Mapa_de_feriasController;
import nosi.webapps.gestao_de_recursos_humanos.pages.mapa_de_ferias.Mapa_de_feriasView;

/**
 * USER 20/03/2023
 */
public class HelperMapaFerias {

	public static Model filtrar(Mapa_de_feriasController mapa_de_feriasController) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void novoMapa(Mapa_de_ferias model, Mapa_de_feriasController mapa_de_feriasController) {

		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		try {
			if (model.validate()) {
				session = Core.getSession(Core.defaultConnection());
				transaction = session.getTransaction();
				if (!transaction.isActive())
					transaction.begin();

				TVacationMap tvacationmap = new TVacationMap();

				try {

					TEmployees temployeesfilter = new TEmployees().find().keepConnection();
					List<TEmployees> temployeesList = temployeesfilter.all();
					if (temployeesList != null) {
						for (TEmployees temployees : temployeesList) {
							tvacationmap = new TVacationMap();

							tvacationmap.setEmployeeId(temployees);
							tvacationmap.setYear(model.getAno());
							tvacationmap.insert().keepConnection();

						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				Core.setMessageSuccess();
			} else
				Core.setMessageError();
		} catch (Exception e) {
			e.printStackTrace();
			Core.setMessageError("Error: " + e.getMessage());
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public static void index(Mapa_de_ferias model, Mapa_de_feriasView view,
			Mapa_de_feriasController mapa_de_feriasController) {
		// TODO Auto-generated method stub
		if (Core.isNullOrZero(model.getAno())) {
			model.setAno(""+LocalDateTime.now().getYear());
		}

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
			TVacationMap tvacationmapfilter = new TVacationMap().find();
			if (Core.isNotNullOrZero(model.getAno())) {
				tvacationmapfilter.andWhere("year", "=", model.getAno());
			}
			List<TVacationMap> tvacationmapList = tvacationmapfilter.orderByAsc("employeeId").all();
			List<Mapa_de_ferias.Table_1> tvacationmapTable = new ArrayList<>();
			if (Core.isNotNull(tvacationmapList)) {
				for (TVacationMap tvacationmap : tvacationmapList) {
					Mapa_de_ferias.Table_1 row = new Mapa_de_ferias.Table_1();
					row.setFuncionario(tvacationmap.getEmployeeId().getFirstName().concat(" ")
							.concat(tvacationmap.getEmployeeId().getLastName()));
					row.setDepartamento(tvacationmap.getEmployeeId().getDepartmentId().getDepartmentName());
					row.setFuncao(tvacationmap.getEmployeeId().getJobId().getJobTitle());
					row.setDias_ano_ante(tvacationmap.getTransportedDays());
					row.setDias_ano_atual(22);

					if (Core.isNotNullOrZero(tvacationmap.getDays1())) {
						row.setPeriodo_1("Gozo de ".concat(tvacationmap.getDays1().toString())
								.concat(" dia(a) a partir de ")
								.concat(Core.convertLocalDateToString(tvacationmap.getStartDate1(), Core.DD_MM_YYYY)));
					}

					if (Core.isNotNullOrZero(tvacationmap.getDays2())) {
						row.setPeriodo_2("Gozo de ".concat(tvacationmap.getDays2().toString())
								.concat(" dia(a) a partir de ")
								.concat(Core.convertLocalDateToString(tvacationmap.getStartDate2(), Core.DD_MM_YYYY)));
					}

					if (Core.isNotNullOrZero(tvacationmap.getDays3())) {
						row.setPeriodo_3("Gozo de ".concat(tvacationmap.getDays3().toString())
								.concat(" dia(a) a partir de ")
								.concat(Core.convertLocalDateToString(tvacationmap.getStartDate3(), Core.DD_MM_YYYY)));
					}

					if (Core.isNotNullOrZero(tvacationmap.getDays4())) {
						row.setPeriodo_4("Gozo de ".concat(tvacationmap.getDays4().toString())
								.concat(" dia(a) a partir de ")
								.concat(Core.convertLocalDateToString(tvacationmap.getStartDate4(), Core.DD_MM_YYYY)));
					}

					row.setMap_id(tvacationmap.getVacationMapId().toString());

					if (!tvacationmap.getEmployeeId().getEmail().equals(Core.getCurrentUser().getEmail())) {
						row.hiddenButton(view.btn_meu_mapa);
					}

					tvacationmapTable.add(row);
				}
				model.setTable_1(tvacationmapTable);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
