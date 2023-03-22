/*-------------------------*/

/*Create View*/
package nosi.webapps.gestao_de_recursos_humanos.pages.t_regionsform;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class T_regionsFormView extends View {

	public Field region_id;
	public Field region_name;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_list;
	public IGRPButton btn_save;

	public T_regionsFormView(){

		this.setPageTitle("");
			
		form_1 = new IGRPForm("form_1","Registar t_regions");

		region_id = new HiddenField(model,"region_id");
		region_id.setLabel(gt(""));
		region_id.propertie().add("isAutoincrement","true").add("name","p_region_id").add("tag","region_id").add("java-type","Integer").add("type","hidden").add("required","true");
		
		region_name = new TextField(model,"region_name");
		region_name.setLabel(gt("region name"));
		region_name.propertie().add("readonly","false").add("maxlength","25").add("name","p_region_name").add("disabled","false").add("placeholder",gt("")).add("java-type","String").add("type","text").add("required","false");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_list = new IGRPButton("List","gestao_de_recursos_humanos","T_regionsForm","list","_self","default|fa-list","","");
		btn_list.propertie.add("crud_op","list").add("action-id","91").add("rel","list").add("type","specific");

		btn_save = new IGRPButton("Gravar","gestao_de_recursos_humanos","T_regionsForm","save","submit","primary|fa-save","","");
		btn_save.propertie.add("crud_op","save").add("action-id","90").add("rel","save").add("type","specific");

		
	}
		
	@Override
	public void render(){
		

		form_1.addField(region_id);
		form_1.addField(region_name);

		toolsbar_1.addButton(btn_list);
		toolsbar_1.addButton(btn_save);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		region_id.setValue(model);
		region_name.setValue(model);	

		}
}
/*-------------------------*/