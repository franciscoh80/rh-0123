/*-------------------------*/

/*Create Controller*/

package nosi.webapps.gestao_de_recursos_humanos.pages.t_regionslist;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//


/*----#start-code(packages_import)----*/


/*----#end-code----*/


public class T_regionsListController extends Controller {
		

	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		T_regionsList model = new T_regionsList();
		model.load();
		T_regionsListView view = new T_regionsListView();
		/*----#start-code(index)----*/
		QueryInterface query = Core.query("gestao_de_recursos_humanos_postgresql_1","SELECT region_id as region_id,region_name as region_name FROM public.t_regions");
		model.loadTable_1(query);
		
		view.region_id.setParam(true);
		/*----#end-code----*/
		view.setModel(model);
		
		view.region_id.setParam(true);
		return this.renderView(view);
	}


	public Response actionNew() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*----#start-code(new)----*/
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","T_regionsForm","index");
	}

	public Response actionUpdate() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*----#start-code(update)----*/
		this.addQueryString("target","_blank");
		this.addQueryString("isEdit","true");
		this.addQueryString("p_region_id",Core.getParam("p_region_id"));
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","T_regionsForm","index",this.queryString());
	}

	public Response actionDelete() throws IOException, IllegalArgumentException, IllegalAccessException{
		T_regionsList.Table_1 model = new T_regionsList.Table_1();
		/*----#start-code(delete)----*/
		ResultSet r = Core.delete("gestao_de_recursos_humanos_postgresql_1","public","t_regions").where("region_id=:region_id")
				.addInt("region_id",Core.getParamInt("p_region_id"))
				.execute();
		if(!r.hasError())
			Core.setMessageSuccess();
		else
			Core.setMessageError();
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","T_regionsList","index");
	}
}
