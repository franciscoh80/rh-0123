package nosi.webapps.gestao_de_recursos_humanos.pages.acompanhamento_de_ferias;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Acompanhamento_de_ferias extends Model{		

	@RParam(rParamName = "p_departamento_id")
	private String departamento_id;

	@RParam(rParamName = "p_funcao_id")
	private String funcao_id;

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setDepartamento_id(String departamento_id){
		this.departamento_id = departamento_id;
	}
	public String getDepartamento_id(){
		return this.departamento_id;
	}
	
	public void setFuncao_id(String funcao_id){
		this.funcao_id = funcao_id;
	}
	public String getFuncao_id(){
		return this.funcao_id;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String status_legen;
		private String departamento;
		private String funcao;
		private String funcionario;
		private String inicio_em;
		private Integer dias;
		private String aprovador;
		private String estado;
		private Integer id;
		public void setStatus_legen(String status_legen){
			this.status_legen = status_legen;
		}
		public String getStatus_legen(){
			return this.status_legen;
		}

		public void setDepartamento(String departamento){
			this.departamento = departamento;
		}
		public String getDepartamento(){
			return this.departamento;
		}

		public void setFuncao(String funcao){
			this.funcao = funcao;
		}
		public String getFuncao(){
			return this.funcao;
		}

		public void setFuncionario(String funcionario){
			this.funcionario = funcionario;
		}
		public String getFuncionario(){
			return this.funcionario;
		}

		public void setInicio_em(String inicio_em){
			this.inicio_em = inicio_em;
		}
		public String getInicio_em(){
			return this.inicio_em;
		}

		public void setDias(Integer dias){
			this.dias = dias;
		}
		public Integer getDias(){
			return this.dias;
		}

		public void setAprovador(String aprovador){
			this.aprovador = aprovador;
		}
		public String getAprovador(){
			return this.aprovador;
		}

		public void setEstado(String estado){
			this.estado = estado;
		}
		public String getEstado(){
			return this.estado;
		}

		public void setId(Integer id){
			this.id = id;
		}
		public Integer getId(){
			return this.id;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
