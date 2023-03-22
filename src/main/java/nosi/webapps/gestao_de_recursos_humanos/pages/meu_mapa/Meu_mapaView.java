package nosi.webapps.gestao_de_recursos_humanos.pages.meu_mapa;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Meu_mapaView extends View {

	public Field funcionario;
	public Field dias_ano_ante;
	public Field dias_ano_atual;
	public Field total_de_dias;
	public Field map_id;
	public Field data_inicio_1;
	public Field dias_1;
	public Field data_inicio_2;
	public Field dias_2;
	public Field data_inicio_3;
	public Field dias_3;
	public Field data_inicio_4;
	public Field dias_4;
	public IGRPForm form_1;
	public IGRPForm form_2;
	public IGRPForm form_3;
	public IGRPForm form_4;
	public IGRPForm form_5;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;

	public Meu_mapaView(){

		this.setPageTitle("Meu Mapa");
			
		form_1 = new IGRPForm("form_1","");

		form_2 = new IGRPForm("form_2","1º Periodo");

		form_3 = new IGRPForm("form_3","2º Periodo");

		form_4 = new IGRPForm("form_4","3º Periodo");

		form_5 = new IGRPForm("form_5","4º Periodo");

		funcionario = new TextField(model,"funcionario");
		funcionario.setLabel(gt("Funcionário"));
		funcionario.propertie().add("name","p_funcionario").add("type","text").add("maxlength","250").add("required","false").add("readonly","true").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		dias_ano_ante = new NumberField(model,"dias_ano_ante");
		dias_ano_ante.setLabel(gt("Dias Ano Ante."));
		dias_ano_ante.propertie().add("name","p_dias_ano_ante").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		dias_ano_atual = new NumberField(model,"dias_ano_atual");
		dias_ano_atual.setLabel(gt("Dias Ano Atual"));
		dias_ano_atual.propertie().add("name","p_dias_ano_atual").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		total_de_dias = new NumberField(model,"total_de_dias");
		total_de_dias.setLabel(gt("Total de Dias"));
		total_de_dias.propertie().add("name","p_total_de_dias").add("type","number").add("min","").add("max","").add("calculation","true").add("mathcal","({p_dias_ano_ante}+{p_dias_ano_atual})").add("numberformat","round").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		map_id = new HiddenField(model,"map_id");
		map_id.setLabel(gt(""));
		map_id.propertie().add("name","p_map_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","map_id");
		
		data_inicio_1 = new DateField(model,"data_inicio_1");
		data_inicio_1.setLabel(gt("Data inicio"));
		data_inicio_1.propertie().add("name","p_data_inicio_1").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		dias_1 = new NumberField(model,"dias_1");
		dias_1.setLabel(gt("Dias"));
		dias_1.propertie().add("name","p_dias_1").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		data_inicio_2 = new DateField(model,"data_inicio_2");
		data_inicio_2.setLabel(gt("Data inicio"));
		data_inicio_2.propertie().add("name","p_data_inicio_2").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		dias_2 = new NumberField(model,"dias_2");
		dias_2.setLabel(gt("Dias"));
		dias_2.propertie().add("name","p_dias_2").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		data_inicio_3 = new DateField(model,"data_inicio_3");
		data_inicio_3.setLabel(gt("Data inicio"));
		data_inicio_3.propertie().add("name","p_data_inicio_3").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		dias_3 = new NumberField(model,"dias_3");
		dias_3.setLabel(gt("Dias"));
		dias_3.propertie().add("name","p_dias_3").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		data_inicio_4 = new DateField(model,"data_inicio_4");
		data_inicio_4.setLabel(gt("Data inicio"));
		data_inicio_4.propertie().add("name","p_data_inicio_4").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		dias_4 = new NumberField(model,"dias_4");
		dias_4.setLabel(gt("Dias"));
		dias_4.propertie().add("name","p_dias_4").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar = new IGRPButton("Gravar","gestao_de_recursos_humanos","Meu_mapa","gravar","submit","primary|fa-calendar-check-o","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(funcionario);
		form_1.addField(dias_ano_ante);
		form_1.addField(dias_ano_atual);
		form_1.addField(total_de_dias);
		form_1.addField(map_id);

		form_2.addField(data_inicio_1);
		form_2.addField(dias_1);

		form_3.addField(data_inicio_2);
		form_3.addField(dias_2);

		form_4.addField(data_inicio_3);
		form_4.addField(dias_3);

		form_5.addField(data_inicio_4);
		form_5.addField(dias_4);


		toolsbar_1.addButton(btn_gravar);
		this.addToPage(form_1);
		this.addToPage(form_2);
		this.addToPage(form_3);
		this.addToPage(form_4);
		this.addToPage(form_5);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		funcionario.setValue(model);
		dias_ano_ante.setValue(model);
		dias_ano_atual.setValue(model);
		total_de_dias.setValue(model);
		map_id.setValue(model);
		data_inicio_1.setValue(model);
		dias_1.setValue(model);
		data_inicio_2.setValue(model);
		dias_2.setValue(model);
		data_inicio_3.setValue(model);
		dias_3.setValue(model);
		data_inicio_4.setValue(model);
		dias_4.setValue(model);	

		}
}
