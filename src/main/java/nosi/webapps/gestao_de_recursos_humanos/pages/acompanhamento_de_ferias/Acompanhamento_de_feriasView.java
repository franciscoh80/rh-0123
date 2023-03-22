package nosi.webapps.gestao_de_recursos_humanos.pages.acompanhamento_de_ferias;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import java.util.Map;
import java.util.LinkedHashMap;

public class Acompanhamento_de_feriasView extends View {

	public Field departamento_id;
	public Field funcao_id;
	public Field sectionheader_1_text;
	public Field status_legen;
	public Field departamento;
	public Field funcao;
	public Field funcionario;
	public Field inicio_em;
	public Field dias;
	public Field aprovador;
	public Field estado;
	public Field id;
	public IGRPForm form_1;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTable table_1;

	public IGRPToolsBar registar_frias;
	public IGRPButton btn_registar_ferias;
	public IGRPButton btn_filtrar;
	public IGRPButton btn_retificacao;
	public IGRPButton btn_autorizacao;
	public IGRPButton btn_parecer;
	public IGRPButton btn_fui;
	public IGRPButton btn_voltei;
	public IGRPButton btn_cancelar;

	public Acompanhamento_de_feriasView(){

		this.setPageTitle("Acompanhamento de Férias");
			
		form_1 = new IGRPForm("form_1","Filtrar por...");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		table_1 = new IGRPTable("table_1","");

		departamento_id = new ListField(model,"departamento_id");
		departamento_id.setLabel(gt("Departamento"));
		departamento_id.propertie().add("name","p_departamento_id").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		funcao_id = new ListField(model,"funcao_id");
		funcao_id.setLabel(gt("Função"));
		funcao_id.propertie().add("name","p_funcao_id").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><strong><span style='font-size:26px;'><span style='font-family:Comic Sans MS,cursive;'>F&eacute;rias da Empresa</span></span></strong></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		status_legen = new ColorField(model,"status_legen");
		status_legen.setLabel(gt("Status_legen"));
		status_legen.propertie().add("name","p_status_legen").add("type","color").add("maxlength","30").add("showLabel","false").add("group_in","");
		
		departamento = new TextField(model,"departamento");
		departamento.setLabel(gt("Departamento"));
		departamento.propertie().add("name","p_departamento").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		funcao = new TextField(model,"funcao");
		funcao.setLabel(gt("Função"));
		funcao.propertie().add("name","p_funcao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","funcionario");
		
		funcionario = new TextField(model,"funcionario");
		funcionario.setLabel(gt("Funcionário"));
		funcionario.propertie().add("name","p_funcionario").add("type","text").add("maxlength","100").add("showLabel","true").add("group_in","");
		
		inicio_em = new DateField(model,"inicio_em");
		inicio_em.setLabel(gt("Inicio em"));
		inicio_em.propertie().add("name","p_inicio_em").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		dias = new NumberField(model,"dias");
		dias.setLabel(gt("Dias"));
		dias.propertie().add("name","p_dias").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","30").add("showLabel","true").add("total_footer","false").add("group_in","inicio_em").add("java-type","");
		
		aprovador = new TextField(model,"aprovador");
		aprovador.setLabel(gt("Aprovador"));
		aprovador.propertie().add("name","p_aprovador").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		estado = new TextField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","Integer").add("tag","id");
		

		registar_frias = new IGRPToolsBar("registar_frias");

		btn_registar_ferias = new IGRPButton("Registar Férias","gestao_de_recursos_humanos","Acompanhamento_de_ferias","registar_ferias","modal","primary|fa-pause","","");
		btn_registar_ferias.propertie.add("type","specific").add("rel","registar_ferias").add("refresh_components","");

		btn_filtrar = new IGRPButton("Filtrar","gestao_de_recursos_humanos","Acompanhamento_de_ferias","filtrar","submit_ajax","grey|fa-filter","","");
		btn_filtrar.propertie.add("id","button_c48d_8c45").add("type","form").add("class","grey").add("rel","filtrar").add("refresh_components","table_1");

		btn_retificacao = new IGRPButton("Retificação","gestao_de_recursos_humanos","Acompanhamento_de_ferias","retificacao","modal","link|fa-pencil","","");
		btn_retificacao.propertie.add("id","button_433c_3bc9").add("type","specific").add("class","link").add("rel","retificacao").add("refresh_components","");

		btn_autorizacao = new IGRPButton("Autorização","gestao_de_recursos_humanos","Acompanhamento_de_ferias","autorizacao","modal","link|fa-check","","");
		btn_autorizacao.propertie.add("id","button_3e57_63a3").add("type","specific").add("class","link").add("rel","autorizacao").add("refresh_components","");

		btn_parecer = new IGRPButton("Parecer","gestao_de_recursos_humanos","Acompanhamento_de_ferias","parecer","modal","link|fa-check","","");
		btn_parecer.propertie.add("id","button_d599_ade9").add("type","specific").add("class","link").add("rel","parecer").add("refresh_components","");

		btn_fui = new IGRPButton("Fui","gestao_de_recursos_humanos","Acompanhamento_de_ferias","fui","confirm","link|fa-play","","");
		btn_fui.propertie.add("id","button_e632_1c20").add("type","specific").add("class","link").add("rel","fui").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		btn_voltei = new IGRPButton("Voltei","gestao_de_recursos_humanos","Acompanhamento_de_ferias","voltei","confirm","link|fa-stop","","");
		btn_voltei.propertie.add("id","button_66c5_2b4e").add("type","specific").add("class","link").add("rel","voltei").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		btn_cancelar = new IGRPButton("Cancelar","gestao_de_recursos_humanos","Acompanhamento_de_ferias","cancelar","confirm","link|fa-times","","");
		btn_cancelar.propertie.add("id","button_6069_39a3").add("type","specific").add("class","link").add("rel","cancelar").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(departamento_id);
		form_1.addField(funcao_id);

		sectionheader_1.addField(sectionheader_1_text);

		table_1.addField(status_legen);
		table_1.addField(departamento);
		table_1.addField(funcao);
		table_1.addField(funcionario);
		table_1.addField(inicio_em);
		table_1.addField(dias);
		table_1.addField(aprovador);
		table_1.addField(estado);
		table_1.addField(id);
		/* start table_1 legend colors*/
		Map<Object, Map<String, String>> table_1_colors= new LinkedHashMap<>();
		Map<String, String> color_dc2b4c_table_1 = new LinkedHashMap<>();
		color_dc2b4c_table_1.put("#dc2b4c","Aguarda Parecer");
		table_1_colors.put("PEDIDO",color_dc2b4c_table_1);
		Map<String, String> color_ea9126_table_1 = new LinkedHashMap<>();
		color_ea9126_table_1.put("#ea9126","Aguarda Autorização");
		table_1_colors.put("PARECER",color_ea9126_table_1);
		Map<String, String> color_95c11f_table_1 = new LinkedHashMap<>();
		color_95c11f_table_1.put("#95c11f","Autorizado");
		table_1_colors.put("AUTORIZADO",color_95c11f_table_1);
		Map<String, String> color_ebbc90_table_1 = new LinkedHashMap<>();
		color_ebbc90_table_1.put("#ebbc90","Aguarda Retificação");
		table_1_colors.put("RETIFICAR",color_ebbc90_table_1);
		Map<String, String> color_000000_table_1 = new LinkedHashMap<>();
		color_000000_table_1.put("#000000","Cancelado");
		table_1_colors.put("CANCELADO",color_000000_table_1);
		Map<String, String> color_18d416_table_1 = new LinkedHashMap<>();
		color_18d416_table_1.put("#18d416","Em Férias");
		table_1_colors.put("EM_FERIAS",color_18d416_table_1);
		Map<String, String> color_5bdfe8_table_1 = new LinkedHashMap<>();
		color_5bdfe8_table_1.put("#5bdfe8","Regresso");
		table_1_colors.put("FINALIZADO",color_5bdfe8_table_1);
		this.table_1.setLegendColors(table_1_colors);
		/* end table_1 legend colors*/

		registar_frias.addButton(btn_registar_ferias);
		form_1.addButton(btn_filtrar);
		table_1.addButton(btn_retificacao);
		table_1.addButton(btn_autorizacao);
		table_1.addButton(btn_parecer);
		table_1.addButton(btn_fui);
		table_1.addButton(btn_voltei);
		table_1.addButton(btn_cancelar);
		this.addToPage(form_1);
		this.addToPage(sectionheader_1);
		this.addToPage(table_1);
		this.addToPage(registar_frias);
	}
		
	@Override
	public void setModel(Model model) {
		
		departamento_id.setValue(model);
		funcao_id.setValue(model);
		status_legen.setValue(model);
		departamento.setValue(model);
		funcao.setValue(model);
		funcionario.setValue(model);
		inicio_em.setValue(model);
		dias.setValue(model);
		aprovador.setValue(model);
		estado.setValue(model);
		id.setValue(model);	

		table_1.loadModel(((Acompanhamento_de_ferias) model).getTable_1());
		}
}
