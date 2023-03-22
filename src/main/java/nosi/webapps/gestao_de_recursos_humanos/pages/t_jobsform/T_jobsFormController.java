/*-------------------------*/

/*Create Controller*/

package nosi.webapps.gestao_de_recursos_humanos.pages.t_jobsform;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//


/*----#start-code(packages_import)----*/


/*----#end-code----*/


public class T_jobsFormController extends Controller {
		

	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		T_jobsForm model = new T_jobsForm();
		model.load();
		
		T_jobsFormView view = new T_jobsFormView();
		/*----#start-code(index)----*/
		String isEdit = Core.getParam("isEdit");;
 			
		if(Core.isNotNull(isEdit)) {
		QueryInterface query = Core.query("gestao_de_recursos_humanos_postgresql_1","SELECT job_id as job_id,job_title as job_title,min_salary as min_salary,max_salary as max_salary FROM public.t_jobs")
				.where("job_id=:job_id")
				.addInt("job_id",model.getJob_id());
		model.load(query);
		view.btn_save.setLink("save&isEdit=true");
		}
		/*----#end-code----*/
		view.setModel(model);
		
		return this.renderView(view);
	}


	public Response actionList() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*----#start-code(list)----*/
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","T_jobsList","index");
	}

	public Response actionSave() throws IOException, IllegalArgumentException, IllegalAccessException{
		T_jobsForm model = new T_jobsForm();
		model.load();
		/*----#start-code(save)----*/
		ResultSet r = null;
		
		String isEdit = Core.getParam("isEdit");;
		 	
		if(Core.isNull(isEdit)){
			r = Core.insert("gestao_de_recursos_humanos_postgresql_1","public","t_jobs")		
				.addString("job_title",model.getJob_title())
				.addString("min_salary",model.getMin_salary())
				.addString("max_salary",model.getMax_salary())
				.execute();
		}else{
			r = Core.update("gestao_de_recursos_humanos_postgresql_1","public","t_jobs")		
				.addString("job_title",model.getJob_title())
				.addString("min_salary",model.getMin_salary())
				.addString("max_salary",model.getMax_salary())
				.where("job_id=:job_id")
				.addInt("job_id",model.getJob_id())
				.execute();
		}
		if(!r.hasError()){
			Core.setMessageSuccess();
		 }else{
			Core.setMessageError();
			 return this.forward("gestao_de_recursos_humanos","T_jobsForm","index");
		}
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","T_jobsForm","index");
	}
}
