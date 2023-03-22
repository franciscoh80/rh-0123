/*-------------------------*/

/*Create View*/
package nosi.webapps.gestao_de_recursos_humanos.pages.t_jobslist;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class T_jobsListView extends View {

	public Field job_id;
	public Field job_title;
	public Field min_salary;
	public Field max_salary;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_new;
	public IGRPButton btn_update;
	public IGRPButton btn_delete;

	public T_jobsListView(){

		this.setPageTitle("");
			
		table_1 = new IGRPTable("table_1","Listar t_jobs");

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

		btn_new = new IGRPButton("Novo","gestao_de_recursos_humanos","T_jobsList","new","modal|refresh","success|fa-plus","","");
		btn_new.propertie.add("crud_op","addNew").add("action-id","88").add("rel","new").add("type","specific");

		btn_update = new IGRPButton("Editar","gestao_de_recursos_humanos","T_jobsList","update","mpsubmit|refresh","warning|fa-pencil","","");
		btn_update.propertie.add("crud_op","edit").add("action-id","88").add("rel","update").add("type","form");

		btn_delete = new IGRPButton("Eliminar","gestao_de_recursos_humanos","T_jobsList","delete","confirm","danger|fa-trash","","");
		btn_delete.propertie.add("crud_op","delete").add("action-id","89").add("rel","delete").add("type","form");

		
	}
		
	@Override
	public void render(){
		

		table_1.addField(job_id);
		table_1.addField(job_title);
		table_1.addField(min_salary);
		table_1.addField(max_salary);

		toolsbar_1.addButton(btn_new);
		table_1.addButton(btn_update);
		table_1.addButton(btn_delete);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		job_id.setValue(model);
		job_title.setValue(model);
		min_salary.setValue(model);
		max_salary.setValue(model);	

		table_1.loadModel(((T_jobsList) model).getTable_1());
		}
}
/*-------------------------*/