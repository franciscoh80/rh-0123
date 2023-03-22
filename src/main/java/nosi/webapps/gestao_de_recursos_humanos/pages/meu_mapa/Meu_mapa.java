package nosi.webapps.gestao_de_recursos_humanos.pages.meu_mapa;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Meu_mapa extends Model{		

	@RParam(rParamName = "p_funcionario")
	private String funcionario;

	@RParam(rParamName = "p_dias_ano_ante")
	private Integer dias_ano_ante;

	@RParam(rParamName = "p_dias_ano_atual")
	private Integer dias_ano_atual;

	@RParam(rParamName = "p_total_de_dias")
	private Integer total_de_dias;

	@RParam(rParamName = "p_map_id")
	private String map_id;

	@Past(message="Não pode ser data passado")
	@RParam(rParamName = "p_data_inicio_1")
	private String data_inicio_1;

	@RParam(rParamName = "p_dias_1")
	private Integer dias_1;

	@RParam(rParamName = "p_data_inicio_2")
	private String data_inicio_2;

	@RParam(rParamName = "p_dias_2")
	private Integer dias_2;

	@RParam(rParamName = "p_data_inicio_3")
	private String data_inicio_3;

	@RParam(rParamName = "p_dias_3")
	private Integer dias_3;

	@RParam(rParamName = "p_data_inicio_4")
	private String data_inicio_4;

	@RParam(rParamName = "p_dias_4")
	private Integer dias_4;
	
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
	
	public void setMap_id(String map_id){
		this.map_id = map_id;
	}
	public String getMap_id(){
		return this.map_id;
	}
	
	public void setData_inicio_1(String data_inicio_1){
		this.data_inicio_1 = data_inicio_1;
	}
	public String getData_inicio_1(){
		return this.data_inicio_1;
	}
	
	public void setDias_1(Integer dias_1){
		this.dias_1 = dias_1;
	}
	public Integer getDias_1(){
		return this.dias_1;
	}
	
	public void setData_inicio_2(String data_inicio_2){
		this.data_inicio_2 = data_inicio_2;
	}
	public String getData_inicio_2(){
		return this.data_inicio_2;
	}
	
	public void setDias_2(Integer dias_2){
		this.dias_2 = dias_2;
	}
	public Integer getDias_2(){
		return this.dias_2;
	}
	
	public void setData_inicio_3(String data_inicio_3){
		this.data_inicio_3 = data_inicio_3;
	}
	public String getData_inicio_3(){
		return this.data_inicio_3;
	}
	
	public void setDias_3(Integer dias_3){
		this.dias_3 = dias_3;
	}
	public Integer getDias_3(){
		return this.dias_3;
	}
	
	public void setData_inicio_4(String data_inicio_4){
		this.data_inicio_4 = data_inicio_4;
	}
	public String getData_inicio_4(){
		return this.data_inicio_4;
	}
	
	public void setDias_4(Integer dias_4){
		this.dias_4 = dias_4;
	}
	public Integer getDias_4(){
		return this.dias_4;
	}



}
