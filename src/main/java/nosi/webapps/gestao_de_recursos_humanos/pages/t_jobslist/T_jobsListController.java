/*-------------------------*/

/*Create Controller*/

package nosi.webapps.gestao_de_recursos_humanos.pages.t_jobslist;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//


/*----#start-code(packages_import)----*/


/*----#end-code----*/


public class T_jobsListController extends Controller {
		

	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		T_jobsList model = new T_jobsList();
		model.load();
		T_jobsListView view = new T_jobsListView();
		/*----#start-code(index)----*/
		QueryInterface query = Core.query("gestao_de_recursos_humanos_postgresql_1","SELECT job_id as job_id,job_title as job_title,min_salary as min_salary,max_salary as max_salary FROM public.t_jobs");
		model.loadTable_1(query);
		
		view.job_id.setParam(true);
		/*----#end-code----*/
		view.setModel(model);
		
		view.job_id.setParam(true);
		return this.renderView(view);
	}


	public Response actionNew() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*----#start-code(new)----*/
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","T_jobsForm","index");
	}

	public Response actionUpdate() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*----#start-code(update)----*/
		this.addQueryString("target","_blank");
		this.addQueryString("isEdit","true");
		this.addQueryString("p_job_id",Core.getParam("p_job_id"));
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","T_jobsForm","index",this.queryString());
	}

	public Response actionDelete() throws IOException, IllegalArgumentException, IllegalAccessException{
		T_jobsList.Table_1 model = new T_jobsList.Table_1();
		/*----#start-code(delete)----*/
		ResultSet r = Core.delete("gestao_de_recursos_humanos_postgresql_1","public","t_jobs").where("job_id=:job_id")
				.addInt("job_id",Core.getParamInt("p_job_id"))
				.execute();
		if(!r.hasError())
			Core.setMessageSuccess();
		else
			Core.setMessageError();
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","T_jobsList","index");
	}
}
