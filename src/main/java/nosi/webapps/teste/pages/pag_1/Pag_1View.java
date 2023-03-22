package nosi.webapps.teste.pages.pag_1;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Pag_1View extends View {

	public Field form_1_select_1;
	public IGRPForm form_1;


	public Pag_1View(){

		this.setPageTitle("Pag 1");
			
		form_1 = new IGRPForm("form_1","");

		form_1_select_1 = new ListField(model,"form_1_select_1");
		form_1_select_1.setLabel(gt("Select"));
		form_1_select_1.propertie().add("name","p_form_1_select_1").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","Genero « teste").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(form_1_select_1);

		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		form_1_select_1.setValue(model);	

		}
}
