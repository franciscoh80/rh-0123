package nosi.webapps.gestao_de_recursos_humanos.pages.lista_de_funcionarios;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import nosi.core.webapp.Report; //block import
import java.util.List; //block import
import java.util.LinkedHashMap; //block import
import static nosi.core.i18n.Translator.gt; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TDepartments; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TJobs; //block import
import nosi.webapps.gestao_de_recursos_humanos.helpers.lista_de_funcionarios.HelperListaDeFuncionarios;
import nosi.webapps.gestao_de_recursos_humanos.dao.TEmployees; //block import
import java.time.LocalDate; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import org.hibernate.Session; //block import
import org.hibernate.Transaction; //block import
/*----#end-code----*/
		
public class Lista_de_funcionariosController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_funcionarios model = new Lista_de_funcionarios();
		model.load();
		Lista_de_funcionariosView view = new Lista_de_funcionariosView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'INACTIVE' as status,'Consectetur stract deserunt la' as departamento,'Omnis sit dolor consectetur si' as funcao,'Consectetur amet labore rem ap' as nome,'Sit stract sit stract ut' as apelido,'Iste elit perspiciatis omnis d' as email,'23' as salario,'hidden-e86b_b395' as id "));
		view.departamento_id.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.funcao_id.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	/* End-Code-Block (index) */
		/*----#start-code(index)----*/
		HelperListaDeFuncionarios.index(model,view, this);
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_funcionarios model = new Lista_de_funcionarios();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Funcionario","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (novo)  *//* End-Code-Block  */
		/*----#start-code(novo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Funcionario","index", this.queryString());	
	}
	
	public Response actionFiltrar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_funcionarios model = new Lista_de_funcionarios();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Lista_de_funcionarios","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (filtrar)  */
	return this.forward("gestao_de_recursos_humanos","Lista_de_funcionarios","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(filtrar)----*/
		
		
		/*----#end-code----*/
			
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_funcionarios model = new Lista_de_funcionarios();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Funcionario","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  */
	this.addQueryString("p_id", Core.getParam("p_id"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Funcionario","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_funcionarios model = new Lista_de_funcionarios();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Lista_de_funcionarios","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  */Core.setMessageWarning(Core.getParamInt("p_id").toString());
	Core.setMessageSuccess(Core.getParamInt("p_id").toString());
	Core.setMessageError(Core.getParamInt("p_id").toString());
	
	/*
	try{
		TEmployees temployees = new TEmployees().findOne(Core.getParamInt("p_id"));
		if (temployees != null && !temployees.hasError()) {
		temployees.setStatus("INACTIVE");
			temployees.setEndDate(LocalDate.now());
		temployees.update();
		Core.setMessageSuccess();
		}
		else
			Core.setMessageError();
	}catch ( Exception e ) {
		e.printStackTrace();
	}	
	*//* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		Session session = null;
		Transaction transaction = null;
      
      
		try{
          
			session = Core.getSession(Core.defaultConnection());
			transaction = session.getTransaction();
          	if(!transaction.isActive())
				transaction.begin();
          
            TEmployees temployees = new TEmployees();          
          	temployees = session.find(TEmployees.class, Core.getParamInt("p_id"));
          
            if (temployees != null && !temployees.hasError()) {
                temployees.setStatus("INACTIVE");
                temployees.setEndDate(LocalDate.now());

                session.persist(temployees);
                transaction.commit();
                Core.setMessageSuccess();
            }
            else
                Core.setMessageError();
	}catch ( Exception e ) {
          
          
		e.printStackTrace();
        if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}	
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Lista_de_funcionarios","index", this.queryString());	
	}
	
	public Response actionRecibo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_funcionarios model = new Lista_de_funcionarios();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("gestao_de_recursos_humanos","Funcionario","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (recibo)  */return Core.getLinkReport("dec_venc", new Report().addParam("employee_id", Core.getParamInt("p_id")));/* End-Code-Block  */
		/*----#start-code(recibo)----*/
		
      
      //or PDF report - Response=> Core.getLinkReportPDF("dec_venc",new nosi.core.webapp.Report().addParam("employee_id","?"));or report HTML - Response=> Core.getLinkReport("dec_venc",new nosi.core.webapp.Report().addParam("employee_id","?"));
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
