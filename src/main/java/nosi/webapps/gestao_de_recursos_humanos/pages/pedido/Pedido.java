package nosi.webapps.gestao_de_recursos_humanos.pages.pedido;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Pedido extends Model{		

	@RParam(rParamName = "p_mapa_de_ferias")
	private String mapa_de_ferias;

	@RParam(rParamName = "p_funcionario")
	private String funcionario;

	@RParam(rParamName = "p_dias_ano_ante")
	private Integer dias_ano_ante;

	@RParam(rParamName = "p_dias_ano_atual")
	private Integer dias_ano_atual;

	@RParam(rParamName = "p_total_de_dias")
	private Integer total_de_dias;

	@RParam(rParamName = "p_info_ferias")
	private String info_ferias;

	@NotNull()
	@RParam(rParamName = "p_data_de_inicio")
	private String data_de_inicio;

	@NotNull()
	@RParam(rParamName = "p_nr_dias")
	private Integer nr_dias;

	@RParam(rParamName = "p_id")
	private String id;
	
	public void setMapa_de_ferias(String mapa_de_ferias){
		this.mapa_de_ferias = mapa_de_ferias;
	}
	public String getMapa_de_ferias(){
		return this.mapa_de_ferias;
	}
	
	public void setFuncionario(String funcionario){
		this.funcionario = funcionario;
	}
	public String getFuncionario(){
		return this.funcionario;
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
	
	public void setTotal_de_dias(Integer total_de_dias){
		this.total_de_dias = total_de_dias;
	}
	public Integer getTotal_de_dias(){
		return this.total_de_dias;
	}
	
	public void setInfo_ferias(String info_ferias){
		this.info_ferias = info_ferias;
	}
	public String getInfo_ferias(){
		return this.info_ferias;
	}
	
	public void setData_de_inicio(String data_de_inicio){
		this.data_de_inicio = data_de_inicio;
	}
	public String getData_de_inicio(){
		return this.data_de_inicio;
	}
	
	public void setNr_dias(Integer nr_dias){
		this.nr_dias = nr_dias;
	}
	public Integer getNr_dias(){
		return this.nr_dias;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}



}
