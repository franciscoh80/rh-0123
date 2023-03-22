package nosi.webapps.gestao_de_recursos_humanos.pages.mapa_de_ferias;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Mapa_de_feriasView extends View {

	public Field sectionheader_1_text;
	public Field ano;
	public Field departamento_id;
	public Field funcao_id;
	public Field funcionario;
	public Field departamento;
	public Field funcao;
	public Field dias_ano_ante;
	public Field dias_ano_atual;
	public Field periodo_1;
	public Field periodo_2;
	public Field periodo_3;
	public Field periodo_4;
	public Field map_id;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo_mapa;
	public IGRPButton btn_filtrar;
	public IGRPButton btn_meu_mapa;

	public Mapa_de_feriasView(){

		this.setPageTitle("Mapa de Férias");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","Filtrar por...");

		table_1 = new IGRPTable("table_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><span style='font-size:18px;'><span style='font-family:Comic Sans MS,cursive;'>Mapa de F&eacute;rias do Ano $ano$</span></span></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		ano = new ListField(model,"ano");
		ano.setLabel(gt("Ano"));
		ano.propertie().add("name","p_ano").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","ANO « gestao_de_recursos_humanos").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		departamento_id = new ListField(model,"departamento_id");
		departamento_id.setLabel(gt("Departamento"));
		departamento_id.propertie().add("name","p_departamento_id").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		funcao_id = new ListField(model,"funcao_id");
		funcao_id.setLabel(gt("Função"));
		funcao_id.propertie().add("name","p_funcao_id").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		funcionario = new TextField(model,"funcionario");
		funcionario.setLabel(gt("Funcionário"));
		funcionario.propertie().add("name","p_funcionario").add("type","text").add("maxlength","100").add("showLabel","true").add("group_in","");
		
		departamento = new TextField(model,"departamento");
		departamento.setLabel(gt("Departamento"));
		departamento.propertie().add("name","p_departamento").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		funcao = new TextField(model,"funcao");
		funcao.setLabel(gt("Função"));
		funcao.propertie().add("name","p_funcao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","funcionario");
		
		dias_ano_ante = new NumberField(model,"dias_ano_ante");
		dias_ano_ante.setLabel(gt("Dias ano ante."));
		dias_ano_ante.propertie().add("name","p_dias_ano_ante").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","30").add("showLabel","true").add("total_footer","false").add("group_in","").add("java-type","");
		
		dias_ano_atual = new NumberField(model,"dias_ano_atual");
		dias_ano_atual.setLabel(gt("Dias ano atual"));
		dias_ano_atual.propertie().add("name","p_dias_ano_atual").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","30").add("showLabel","true").add("total_footer","false").add("group_in","").add("java-type","");
		
		periodo_1 = new TextField(model,"periodo_1");
		periodo_1.setLabel(gt("1º Periodo"));
		periodo_1.propertie().add("name","p_periodo_1").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		periodo_2 = new TextField(model,"periodo_2");
		periodo_2.setLabel(gt("2º Periodo"));
		periodo_2.propertie().add("name","p_periodo_2").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		periodo_3 = new TextField(model,"periodo_3");
		periodo_3.setLabel(gt("3º Periodo"));
		periodo_3.propertie().add("name","p_periodo_3").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		periodo_4 = new TextField(model,"periodo_4");
		periodo_4.setLabel(gt("4º Periodo"));
		periodo_4.propertie().add("name","p_periodo_4").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		map_id = new HiddenField(model,"map_id");
		map_id.setLabel(gt(""));
		map_id.propertie().add("name","p_map_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","map_id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo_mapa = new IGRPButton("Novo Mapa","gestao_de_recursos_humanos","Mapa_de_ferias","novo_mapa","alert_submit","primary|fa-gears","","");
		btn_novo_mapa.propertie.add("type","specific").add("rel","novo_mapa").add("flg_transaction","true").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		btn_filtrar = new IGRPButton("Filtrar","gestao_de_recursos_humanos","Mapa_de_ferias","filtrar","submit_ajax","grey|fa-filter","","");
		btn_filtrar.propertie.add("id","button_c48d_8c45").add("type","form").add("class","grey").add("rel","filtrar").add("refresh_components","table_1");

		btn_meu_mapa = new IGRPButton("Meu Mapa","gestao_de_recursos_humanos","Mapa_de_ferias","meu_mapa","modal","primary|fa-calendar","","");
		btn_meu_mapa.propertie.add("id","button_2fd2_df6c").add("type","specific").add("class","primary").add("rel","meu_mapa").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		form_1.addField(ano);
		form_1.addField(departamento_id);
		form_1.addField(funcao_id);


		table_1.addField(funcionario);
		table_1.addField(departamento);
		table_1.addField(funcao);
		table_1.addField(dias_ano_ante);
		table_1.addField(dias_ano_atual);
		table_1.addField(periodo_1);
		table_1.addField(periodo_2);
		table_1.addField(periodo_3);
		table_1.addField(periodo_4);
		table_1.addField(map_id);

		toolsbar_1.addButton(btn_novo_mapa);
		form_1.addButton(btn_filtrar);
		table_1.addButton(btn_meu_mapa);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		ano.setValue(model);
		departamento_id.setValue(model);
		funcao_id.setValue(model);
		funcionario.setValue(model);
		departamento.setValue(model);
		funcao.setValue(model);
		dias_ano_ante.setValue(model);
		dias_ano_atual.setValue(model);
		periodo_1.setValue(model);
		periodo_2.setValue(model);
		periodo_3.setValue(model);
		periodo_4.setValue(model);
		map_id.setValue(model);	

		table_1.loadModel(((Mapa_de_ferias) model).getTable_1());
		}
}
