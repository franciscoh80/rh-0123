package nosi.webapps.gestao_de_recursos_humanos.pages.acompanhamento_de_ferias;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Acompanhamento_de_feriasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Acompanhamento_de_ferias model = new Acompanhamento_de_ferias();
		model.load();
		Acompanhamento_de_feriasView view = new Acompanhamento_de_feriasView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'FINALIZADO' as status_legen,'Doloremque omnis deserunt dolo' as departamento,'Adipiscing deserunt stract lor' as funcao,'Lorem rem stract sed amet' as funcionario,'01-04-2010' as inicio_em,'1' as dias,'Voluptatem doloremque anim lau' as aprovador,'Sed anim accusantium labore ad' as estado,'hidden-1e93_09db' as id "));
		view.departamento_id.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.funcao_id.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionRegistar_ferias() throws IOException, IllegalArgumentException, IllegalAccessException{
		Acompanhamento_de_ferias model = new Acompanhamento_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Pedido","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (registar_ferias)  *//* End-Code-Block  */
		/*----#start-code(registar_ferias)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Pedido","index", this.queryString());	
	}
	
	public Response actionFiltrar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Acompanhamento_de_ferias model = new Acompanhamento_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Acompanhamento_de_ferias","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (filtrar)  *//* End-Code-Block  */
		/*----#start-code(filtrar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Acompanhamento_de_ferias","index", this.queryString());	
	}
	
	public Response actionRetificacao() throws IOException, IllegalArgumentException, IllegalAccessException{
		Acompanhamento_de_ferias model = new Acompanhamento_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Pedido","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (retificacao)  *//* End-Code-Block  */
		/*----#start-code(retificacao)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Pedido","index", this.queryString());	
	}
	
	public Response actionAutorizacao() throws IOException, IllegalArgumentException, IllegalAccessException{
		Acompanhamento_de_ferias model = new Acompanhamento_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Autorizacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (autorizacao)  *//* End-Code-Block  */
		/*----#start-code(autorizacao)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Autorizacao","index", this.queryString());	
	}
	
	public Response actionParecer() throws IOException, IllegalArgumentException, IllegalAccessException{
		Acompanhamento_de_ferias model = new Acompanhamento_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Parecer","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (parecer)  *//* End-Code-Block  */
		/*----#start-code(parecer)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Parecer","index", this.queryString());	
	}
	
	public Response actionFui() throws IOException, IllegalArgumentException, IllegalAccessException{
		Acompanhamento_de_ferias model = new Acompanhamento_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Acompanhamento_de_ferias","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (fui)  *//* End-Code-Block  */
		/*----#start-code(fui)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Acompanhamento_de_ferias","index", this.queryString());	
	}
	
	public Response actionVoltei() throws IOException, IllegalArgumentException, IllegalAccessException{
		Acompanhamento_de_ferias model = new Acompanhamento_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Acompanhamento_de_ferias","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (voltei)  *//* End-Code-Block  */
		/*----#start-code(voltei)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Acompanhamento_de_ferias","index", this.queryString());	
	}
	
	public Response actionCancelar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Acompanhamento_de_ferias model = new Acompanhamento_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Acompanhamento_de_ferias","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (cancelar)  *//* End-Code-Block  */
		/*----#start-code(cancelar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Acompanhamento_de_ferias","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
