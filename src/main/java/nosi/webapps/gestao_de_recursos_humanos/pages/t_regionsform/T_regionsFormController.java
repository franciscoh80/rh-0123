/*-------------------------*/

/*Create Controller*/

package nosi.webapps.gestao_de_recursos_humanos.pages.t_regionsform;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//


/*----#start-code(packages_import)----*/


/*----#end-code----*/


public class T_regionsFormController extends Controller {
		

	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		T_regionsForm model = new T_regionsForm();
		model.load();
		
		T_regionsFormView view = new T_regionsFormView();
		/*----#start-code(index)----*/
		String isEdit = Core.getParam("isEdit");;
 			
		if(Core.isNotNull(isEdit)) {
		QueryInterface query = Core.query("gestao_de_recursos_humanos_postgresql_1","SELECT region_id as region_id,region_name as region_name FROM public.t_regions")
				.where("region_id=:region_id")
				.addInt("region_id",model.getRegion_id());
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
		return this.redirect("gestao_de_recursos_humanos","T_regionsList","index");
	}

	public Response actionSave() throws IOException, IllegalArgumentException, IllegalAccessException{
		T_regionsForm model = new T_regionsForm();
		model.load();
		/*----#start-code(save)----*/
		ResultSet r = null;
		
		String isEdit = Core.getParam("isEdit");;
		 	
		if(Core.isNull(isEdit)){
			r = Core.insert("gestao_de_recursos_humanos_postgresql_1","public","t_regions")		
				.addString("region_name",model.getRegion_name())
				.execute();
		}else{
			r = Core.update("gestao_de_recursos_humanos_postgresql_1","public","t_regions")		
				.addString("region_name",model.getRegion_name())
				.where("region_id=:region_id")
				.addInt("region_id",model.getRegion_id())
				.execute();
		}
		if(!r.hasError()){
			Core.setMessageSuccess();
		 }else{
			Core.setMessageError();
			 return this.forward("gestao_de_recursos_humanos","T_regionsForm","index");
		}
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","T_regionsForm","index");
	}
}
