package nosi.webapps.teste.pages.pag_1;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Pag_1 extends Model{		

	@RParam(rParamName = "p_form_1_select_1")
	private String form_1_select_1;
	
	public void setForm_1_select_1(String form_1_select_1){
		this.form_1_select_1 = form_1_select_1;
	}
	public String getForm_1_select_1(){
		return this.form_1_select_1;
	}



}
