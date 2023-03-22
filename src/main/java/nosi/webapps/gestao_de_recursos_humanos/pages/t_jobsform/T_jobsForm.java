/*---------------------- Create Model ----------------------*/
package nosi.webapps.gestao_de_recursos_humanos.pages.t_jobsform;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class T_jobsForm extends Model{		

	@RParam(rParamName = "p_job_id")
	private Integer job_id;

	@RParam(rParamName = "p_job_title")
	private String job_title;

	@RParam(rParamName = "p_min_salary")
	private String min_salary;

	@RParam(rParamName = "p_max_salary")
	private String max_salary;
	
	public void setJob_id(Integer job_id){
		this.job_id = job_id;
	}
	public Integer getJob_id(){
		return this.job_id;
	}
	
	public void setJob_title(String job_title){
		this.job_title = job_title;
	}
	public String getJob_title(){
		return this.job_title;
	}
	
	public void setMin_salary(String min_salary){
		this.min_salary = min_salary;
	}
	public String getMin_salary(){
		return this.min_salary;
	}
	
	public void setMax_salary(String max_salary){
		this.max_salary = max_salary;
	}
	public String getMax_salary(){
		return this.max_salary;
	}



}
/*-------------------------*/