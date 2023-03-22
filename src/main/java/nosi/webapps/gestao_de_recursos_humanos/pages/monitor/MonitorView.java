package nosi.webapps.gestao_de_recursos_humanos.pages.monitor;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class MonitorView extends View {

	public Field statbox_1_title;
	public Field statbox_1_val;
	public Field statbox_1_txt;
	public Field statbox_1_url;
	public Field statbox_1_bg;
	public Field statbox_1_icn;
	public IGRPStatBox statbox_1;
	public IGRPChart chart_1;
	public IGRPChart chart_2;


	public MonitorView(){

		this.setPageTitle("Monitor");
			
		statbox_1 = new IGRPStatBox("statbox_1","");

		chart_1 = new IGRPChart("chart_1","Funcionários Por Departamentos");

		chart_2 = new IGRPChart("chart_2","Funcionários Por Função");

		statbox_1_title = new TextField(model,"statbox_1_title");
		statbox_1_title.setLabel(gt("Box Title"));
		statbox_1_title.propertie().add("name","p_statbox_1_title").add("type","text").add("maxlength","4000");
		
		statbox_1_val = new TextField(model,"statbox_1_val");
		statbox_1_val.setLabel(gt("Value"));
		statbox_1_val.propertie().add("name","p_statbox_1_val").add("type","text").add("maxlength","4000");
		
		statbox_1_txt = new TextField(model,"statbox_1_txt");
		statbox_1_txt.setLabel(gt("Url Text"));
		statbox_1_txt.propertie().add("name","p_statbox_1_txt").add("type","text").add("maxlength","4000");
		
		statbox_1_url = new TextField(model,"statbox_1_url");
		statbox_1_url.setLabel(gt("Url"));
		statbox_1_url.propertie().add("name","p_statbox_1_url").add("type","text").add("maxlength","4000");
		
		statbox_1_bg = new TextField(model,"statbox_1_bg");
		statbox_1_bg.setLabel(gt("Background"));
		statbox_1_bg.propertie().add("name","p_statbox_1_bg").add("type","text").add("maxlength","4000");
		
		statbox_1_icn = new TextField(model,"statbox_1_icn");
		statbox_1_icn.setLabel(gt("Icon"));
		statbox_1_icn.setValue(gt("fa-users"));
		statbox_1_icn.propertie().add("name","p_statbox_1_icn").add("type","text").add("maxlength","4000");
		


		
		chart_1.setCaption("");
		chart_1.setChart_type("pie");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		//ex: chart_1.addColor("#fcfcb3").addColor("#7e95af").addColor("#8b837d").addColor("#81ba47");

		chart_2.setCaption("");
		chart_2.setChart_type("column");
		chart_2.setXaxys("Eixo de X");
		chart_2.setYaxys("Eixo de Y");
		chart_2.setUrl("#");
		//ex: chart_2.addColor("#d71a59").addColor("#1ef4a1").addColor("#a75df8").addColor("#868136");

	}
		
	@Override
	public void render(){
		
		statbox_1.addField(statbox_1_title);
		statbox_1.addField(statbox_1_val);
		statbox_1.addField(statbox_1_txt);
		statbox_1.addField(statbox_1_url);
		statbox_1.addField(statbox_1_bg);
		statbox_1.addField(statbox_1_icn);



		this.addToPage(statbox_1);
		this.addToPage(chart_1);
		this.addToPage(chart_2);
	}
		
	@Override
	public void setModel(Model model) {
		
		statbox_1_title.setValue(model);
		statbox_1_val.setValue(model);
		statbox_1_txt.setValue(model);
		statbox_1_url.setValue(model);
		statbox_1_bg.setValue(model);	

		chart_1.loadModel(((Monitor) model).getChart_1());
		chart_2.loadModel(((Monitor) model).getChart_2());
		}
}
