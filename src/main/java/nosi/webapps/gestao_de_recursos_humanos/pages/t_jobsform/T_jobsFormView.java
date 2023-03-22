/*-------------------------*/

/*Create View*/
package nosi.webapps.gestao_de_recursos_humanos.pages.t_jobsform;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class T_jobsFormView extends View {

	public Field job_id;
	public Field job_title;
	public Field min_salary;
	public Field max_salary;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_list;
	public IGRPButton btn_save;

	public T_jobsFormView(){

		this.setPageTitle("");
			
		form_1 = new IGRPForm("form_1","Registar t_jobs");

		job_id = new HiddenField(model,"job_id");
		job_id.setLabel(gt(""));
		job_id.propertie().add("isAutoincrement","true").add("name","p_job_id").add("tag","job_id").add("java-type","Integer").add("type","hidden").add("required","true");
		
		job_title = new TextField(model,"job_title");
		job_title.setLabel(gt("job title"));
		job_title.propertie().add("readonly","false").add("maxlength","35").add("name","p_job_title").add("disabled","false").add("placeholder",gt("")).add("tag","job_title").add("java-type","String").add("type","text").add("required","true");
		
		min_salary = new NumberField(model,"min_salary");
		min_salary.setLabel(gt("min salary"));
		min_salary.propertie().add("readonly","false").add("maxlength","10").add("name","p_min_salary").add("disabled","false").add("placeholder",gt("")).add("java-type","String").add("type","number").add("required","false");
		
		max_salary = new NumberField(model,"max_salary");
		max_salary.setLabel(gt("max salary"));
		max_salary.propertie().add("readonly","false").add("maxlength","10").add("name","p_max_salary").add("disabled","false").add("placeholder",gt("")).add("java-type","String").add("type","number").add("required","false");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_list = new IGRPButton("List","gestao_de_recursos_humanos","T_jobsForm","list","_self","default|fa-list","","");
		btn_list.propertie.add("crud_op","list").add("action-id","89").add("rel","list").add("type","specific");

		btn_save = new IGRPButton("Gravar","gestao_de_recursos_humanos","T_jobsForm","save","submit","primary|fa-save","","");
		btn_save.propertie.add("crud_op","save").add("action-id","88").add("rel","save").add("type","specific");

		
	}
		
	@Override
	public void render(){
		

		form_1.addField(job_id);
		form_1.addField(job_title);
		form_1.addField(min_salary);
		form_1.addField(max_salary);

		toolsbar_1.addButton(btn_list);
		toolsbar_1.addButton(btn_save);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		job_id.setValue(model);
		job_title.setValue(model);
		min_salary.setValue(model);
		max_salary.setValue(model);	

		}
}
/*-------------------------*/