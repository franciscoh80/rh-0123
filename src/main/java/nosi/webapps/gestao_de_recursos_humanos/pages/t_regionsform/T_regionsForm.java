/*---------------------- Create Model ----------------------*/
package nosi.webapps.gestao_de_recursos_humanos.pages.t_regionsform;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class T_regionsForm extends Model{		

	@RParam(rParamName = "p_region_id")
	private Integer region_id;

	@RParam(rParamName = "p_region_name")
	private String region_name;
	
	public void setRegion_id(Integer region_id){
		this.region_id = region_id;
	}
	public Integer getRegion_id(){
		return this.region_id;
	}
	
	public void setRegion_name(String region_name){
		this.region_name = region_name;
	}
	public String getRegion_name(){
		return this.region_name;
	}



}
/*-------------------------*/