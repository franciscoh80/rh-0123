package nosi.webapps.gestao_de_recursos_humanos.pages.lista_de_funcionarios;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import java.util.Map;
import java.util.LinkedHashMap;

public class Lista_de_funcionariosView extends View {

	public Field departamento_id;
	public Field funcao_id;
	public Field status;
	public Field departamento;
	public Field funcao;
	public Field nome;
	public Field apelido;
	public Field email;
	public Field salario;
	public Field id;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_filtrar;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;
	public IGRPButton btn_recibo;

	public Lista_de_funcionariosView(){

		this.setPageTitle("Lista de Funcionários");
			
		form_1 = new IGRPForm("form_1","Filtrar por...");

		table_1 = new IGRPTable("table_1","Funcionários");

		departamento_id = new ListField(model,"departamento_id");
		departamento_id.setLabel(gt("Departamento"));
		departamento_id.propertie().add("name","p_departamento_id").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		funcao_id = new ListField(model,"funcao_id");
		funcao_id.setLabel(gt("Função"));
		funcao_id.propertie().add("name","p_funcao_id").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		status = new ColorField(model,"status");
		status.setLabel(gt("Status"));
		status.propertie().add("name","p_status").add("type","color").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		departamento = new TextField(model,"departamento");
		departamento.setLabel(gt("Departamento"));
		departamento.propertie().add("name","p_departamento").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		funcao = new TextField(model,"funcao");
		funcao.setLabel(gt("Função"));
		funcao.propertie().add("name","p_funcao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		apelido = new TextField(model,"apelido");
		apelido.setLabel(gt("Apelido"));
		apelido.propertie().add("name","p_apelido").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		email = new TextField(model,"email");
		email.setLabel(gt("Email"));
		email.propertie().add("name","p_email").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		salario = new NumberField(model,"salario");
		salario.setLabel(gt("Salário"));
		salario.propertie().add("name","p_salario").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","30").add("showLabel","true").add("total_footer","false").add("group_in","").add("java-type","BigDecimal");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","gestao_de_recursos_humanos","Lista_de_funcionarios","novo","modal|refresh","primary|fa-user-plus","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_filtrar = new IGRPButton("Filtrar","gestao_de_recursos_humanos","Lista_de_funcionarios","filtrar","submit_ajax","grey|fa-filter","","");
		btn_filtrar.propertie.add("id","button_c48d_8c45").add("type","form").add("class","grey").add("rel","filtrar").add("refresh_components","table_1");

		btn_editar = new IGRPButton("Editar","gestao_de_recursos_humanos","Lista_de_funcionarios","editar","modal|refresh","info|fa-pencil-square-o","","");
		btn_editar.propertie.add("id","button_ce9e_40c7").add("type","specific").add("class","info").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","gestao_de_recursos_humanos","Lista_de_funcionarios","eliminar","confirm","danger|fa-trash-o","","");
		btn_eliminar.propertie.add("id","button_0855_219e").add("type","specific").add("flg_transaction","true").add("class","danger").add("rel","eliminar").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		btn_recibo = new IGRPButton("Recibo","gestao_de_recursos_humanos","Lista_de_funcionarios","recibo","_blank","primary|fa-wpforms","","");
		btn_recibo.propertie.add("id","button_fe2e_cc4c").add("type","specific").add("class","primary").add("rel","recibo").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(departamento_id);
		form_1.addField(funcao_id);


		table_1.addField(status);
		table_1.addField(departamento);
		table_1.addField(funcao);
		table_1.addField(nome);
		table_1.addField(apelido);
		table_1.addField(email);
		table_1.addField(salario);
		table_1.addField(id);
		/* start table_1 legend colors*/
		Map<Object, Map<String, String>> table_1_colors= new LinkedHashMap<>();
		Map<String, String> color_2bdc75_table_1 = new LinkedHashMap<>();
		color_2bdc75_table_1.put("#2bdc75","Activo");
		table_1_colors.put("ACTIVE",color_2bdc75_table_1);
		Map<String, String> color_ea2680_table_1 = new LinkedHashMap<>();
		color_ea2680_table_1.put("#ea2680","Inativo");
		table_1_colors.put("INACTIVE",color_ea2680_table_1);
		this.table_1.setLegendColors(table_1_colors);
		/* end table_1 legend colors*/
		toolsbar_1.addButton(btn_novo);
		form_1.addButton(btn_filtrar);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		table_1.addButton(btn_recibo);
		this.addToPage(form_1);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		departamento_id.setValue(model);
		funcao_id.setValue(model);
		status.setValue(model);
		departamento.setValue(model);
		funcao.setValue(model);
		nome.setValue(model);
		apelido.setValue(model);
		email.setValue(model);
		salario.setValue(model);
		id.setValue(model);	

		table_1.loadModel(((Lista_de_funcionarios) model).getTable_1());
		}
}
