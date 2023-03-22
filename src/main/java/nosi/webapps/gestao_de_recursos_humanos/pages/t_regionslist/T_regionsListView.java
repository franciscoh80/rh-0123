/*-------------------------*/

/*Create View*/
package nosi.webapps.gestao_de_recursos_humanos.pages.t_regionslist;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class T_regionsListView extends View {

	public Field region_id;
	public Field region_name;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_new;
	public IGRPButton btn_update;
	public IGRPButton btn_delete;

	public T_regionsListView(){

		this.setPageTitle("");
			
		table_1 = new IGRPTable("table_1","Listar t_regions");

		region_id = new HiddenField(model,"region_id");
		region_id.setLabel(gt(""));
		region_id.propertie().add("isAutoincrement","true").add("name","p_region_id").add("tag","region_id").add("java-type","Integer").add("type","hidden").add("required","true");
		
		region_name = new TextField(model,"region_name");
		region_name.setLabel(gt("region name"));
		region_name.propertie().add("readonly","false").add("maxlength","25").add("name","p_region_name").add("disabled","false").add("placeholder",gt("")).add("java-type","String").add("type","text").add("required","false");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_new = new IGRPButton("Novo","gestao_de_recursos_humanos","T_regionsList","new","modal|refresh","success|fa-plus","","");
		btn_new.propertie.add("crud_op","addNew").add("action-id","90").add("rel","new").add("type","specific");

		btn_update = new IGRPButton("Editar","gestao_de_recursos_humanos","T_regionsList","update","mpsubmit|refresh","warning|fa-pencil","","");
		btn_update.propertie.add("crud_op","edit").add("action-id","90").add("rel","update").add("type","form");

		btn_delete = new IGRPButton("Eliminar","gestao_de_recursos_humanos","T_regionsList","delete","confirm","danger|fa-trash","","");
		btn_delete.propertie.add("crud_op","delete").add("action-id","91").add("rel","delete").add("type","form");

		
	}
		
	@Override
	public void render(){
		

		table_1.addField(region_id);
		table_1.addField(region_name);

		toolsbar_1.addButton(btn_new);
		table_1.addButton(btn_update);
		table_1.addButton(btn_delete);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		region_id.setValue(model);
		region_name.setValue(model);	

		table_1.loadModel(((T_regionsList) model).getTable_1());
		}
}
/*-------------------------*/