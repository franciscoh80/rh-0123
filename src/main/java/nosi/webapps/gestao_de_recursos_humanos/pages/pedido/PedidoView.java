package nosi.webapps.gestao_de_recursos_humanos.pages.pedido;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class PedidoView extends View {

	public Field mapa_de_ferias;
	public Field funcionario;
	public Field dias_ano_ante;
	public Field dias_ano_atual;
	public Field total_de_dias;
	public Field info_ferias;
	public Field data_de_inicio;
	public Field nr_dias;
	public Field id;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_registar_pedido;

	public PedidoView(){

		this.setPageTitle("Pedido");
			
		form_1 = new IGRPForm("form_1","");

		mapa_de_ferias = new SeparatorField(model,"mapa_de_ferias");
		mapa_de_ferias.setLabel(gt("Mapa de Férias"));
		mapa_de_ferias.propertie().add("name","p_mapa_de_ferias").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		funcionario = new TextField(model,"funcionario");
		funcionario.setLabel(gt("Funcionário"));
		funcionario.propertie().add("name","p_funcionario").add("type","text").add("maxlength","250").add("required","false").add("readonly","true").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		dias_ano_ante = new NumberField(model,"dias_ano_ante");
		dias_ano_ante.setLabel(gt("Dias Ano Ante."));
		dias_ano_ante.propertie().add("name","p_dias_ano_ante").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","true").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		dias_ano_atual = new NumberField(model,"dias_ano_atual");
		dias_ano_atual.setLabel(gt("Dias Ano Atual"));
		dias_ano_atual.propertie().add("name","p_dias_ano_atual").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","true").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		total_de_dias = new NumberField(model,"total_de_dias");
		total_de_dias.setLabel(gt("Total de Dias"));
		total_de_dias.propertie().add("name","p_total_de_dias").add("type","number").add("min","").add("max","").add("calculation","true").add("mathcal","({p_dias_ano_ante}+{p_dias_ano_atual})").add("numberformat","round").add("maxlength","250").add("required","false").add("readonly","true").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		info_ferias = new SeparatorField(model,"info_ferias");
		info_ferias.setLabel(gt("Info Férias"));
		info_ferias.propertie().add("name","p_info_ferias").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		data_de_inicio = new DateField(model,"data_de_inicio");
		data_de_inicio.setLabel(gt("Data de Inicio"));
		data_de_inicio.propertie().add("name","p_data_de_inicio").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		nr_dias = new NumberField(model,"nr_dias");
		nr_dias.setLabel(gt("Nr Dias"));
		nr_dias.propertie().add("name","p_nr_dias").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_registar_pedido = new IGRPButton("Registar Pedido","gestao_de_recursos_humanos","Pedido","registar_pedido","submit","primary|fa-save","","");
		btn_registar_pedido.propertie.add("type","specific").add("rel","registar_pedido").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(mapa_de_ferias);
		form_1.addField(funcionario);
		form_1.addField(dias_ano_ante);
		form_1.addField(dias_ano_atual);
		form_1.addField(total_de_dias);
		form_1.addField(info_ferias);
		form_1.addField(data_de_inicio);
		form_1.addField(nr_dias);
		form_1.addField(id);


		toolsbar_1.addButton(btn_registar_pedido);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		mapa_de_ferias.setValue(model);
		funcionario.setValue(model);
		dias_ano_ante.setValue(model);
		dias_ano_atual.setValue(model);
		total_de_dias.setValue(model);
		info_ferias.setValue(model);
		data_de_inicio.setValue(model);
		nr_dias.setValue(model);
		id.setValue(model);	

		}
}
