package nosi.webapps.gestao_de_recursos_humanos.pages.mapa_de_ferias;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

import nosi.core.validator.constraints.*;

public class Mapa_de_ferias extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_ano")
	private String ano;

	@RParam(rParamName = "p_departamento_id")
	private String departamento_id;

	@RParam(rParamName = "p_funcao_id")
	private String funcao_id;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setAno(String ano){
		this.ano = ano;
	}
	public String getAno(){
		return this.ano;
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


	public static class Table_1 extends IGRPTable.Table{
		private String funcionario;
		private String departamento;
		private String funcao;
		private Integer dias_ano_ante;
		private Integer dias_ano_atual;
		private String periodo_1;
		private String periodo_2;
		private String periodo_3;
		private String periodo_4;
		private String map_id;
		public void setFuncionario(String funcionario){
			this.funcionario = funcionario;
		}
		public String getFuncionario(){
			return this.funcionario;
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

		public void setDias_ano_ante(Integer dias_ano_ante){
			this.dias_ano_ante = dias_ano_ante;
		}
		public Integer getDias_ano_ante(){
			return this.dias_ano_ante;
		}

		public void setDias_ano_atual(Integer dias_ano_atual){
			this.dias_ano_atual = dias_ano_atual;
		}
		public Integer getDias_ano_atual(){
			return this.dias_ano_atual;
		}

		public void setPeriodo_1(String periodo_1){
			this.periodo_1 = periodo_1;
		}
		public String getPeriodo_1(){
			return this.periodo_1;
		}

		public void setPeriodo_2(String periodo_2){
			this.periodo_2 = periodo_2;
		}
		public String getPeriodo_2(){
			return this.periodo_2;
		}

		public void setPeriodo_3(String periodo_3){
			this.periodo_3 = periodo_3;
		}
		public String getPeriodo_3(){
			return this.periodo_3;
		}

		public void setPeriodo_4(String periodo_4){
			this.periodo_4 = periodo_4;
		}
		public String getPeriodo_4(){
			return this.periodo_4;
		}

		public void setMap_id(String map_id){
			this.map_id = map_id;
		}
		public String getMap_id(){
			return this.map_id;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
