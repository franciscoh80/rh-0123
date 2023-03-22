package nosi.webapps.gestao_de_recursos_humanos.pages.funcionario;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import org.hibernate.Session; //block import
import org.hibernate.Transaction; //block import
import java.util.List; //block import
import java.util.LinkedHashMap; //block import
import static nosi.core.i18n.Translator.gt; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TJobs; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TDepartments; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TEmployees; //block import
import java.time.LocalDate; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/
/*
import org.hibernate.Session; //block import
import org.hibernate.Transaction; //block import
import java.util.List; //block import
import java.util.LinkedHashMap; //block import
import static nosi.core.i18n.Translator.gt; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TJobs; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TDepartments; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TEmployees; //block import
import java.time.LocalDate; //block import
*/
/*----#end-code----*/
		
public class FuncionarioController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Funcionario model = new Funcionario();
		model.load();
		FuncionarioView view = new FuncionarioView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.funcao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.departamento.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.coordenador.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	try{
	TJobs tjobsfilter = new TJobs().find();
	List<TJobs> tjobsList = tjobsfilter.all();
	LinkedHashMap<String, String> funcao = new LinkedHashMap<>();
	funcao.put(null, gt("-- Selecionar --"));
	for(TJobs tjobs : tjobsList){
		funcao.put(tjobs.getJobId().toString(), gt(tjobs.getJobTitle()));
	}
	view.funcao.setValue(funcao);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TDepartments tdepartmentsfilter = new TDepartments().find();
	List<TDepartments> tdepartmentsList = tdepartmentsfilter.all();
	LinkedHashMap<String, String> departamento = new LinkedHashMap<>();
	departamento.put(null, gt("-- Selecionar --"));
	for(TDepartments tdepartments : tdepartmentsList){
		departamento.put(tdepartments.getDepartmentId().toString(), gt(tdepartments.getDepartmentName()));
	}
	view.departamento.setValue(departamento);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TEmployees temployeesfilter = new TEmployees().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_id"))){
		temployeesfilter.andWhere("employeeId", " <> ", Core.getParamInt("p_id"));
	}
	List<TEmployees> temployeesList = temployeesfilter.all();
	LinkedHashMap<String, String> coordenador = new LinkedHashMap<>();
	coordenador.put(null, gt("-- Selecionar --"));
	for(TEmployees temployees : temployeesList){
		coordenador.put(temployees.getEmployeeId().toString(), gt(temployees.getFirstName().concat(" ").concat(temployees.getLastName())));
	}
	view.coordenador.setValue(coordenador);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		TEmployees temployees = new TEmployees().findOne(Core.getParamInt("p_id"));
		if (temployees!=null && !temployees.hasError()) {
			model.setNome(temployees.getFirstName());
			model.setApelido(temployees.getLastName());
			model.setEmail(temployees.getEmail());
			model.setSalario(temployees.getSalary());
			model.setData_de_contratacao(Core.convertLocalDateToString(temployees.getHireDate(), Core.DD_MM_YYYY));
			model.setTelefone(temployees.getPhoneNumber());
	
	if(Core.isNotNullOrZero(temployees.getJobId())){
				model.setFuncao(temployees.getJobId().getJobId());
	}
	
	
	if(Core.isNotNullOrZero(temployees.getDepartmentId())){
				model.setDepartamento(temployees.getDepartmentId().getDepartmentId());
	}
	
			model.setCoordenador(temployees.getManagerId());
			model.setId(temployees.getEmployeeId());
	
	view.btn_gravar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}/* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
      if (Core.isNotNullOrZero(Core.getParamInt("p_id")))
       		model.setDeclaracao_de_vencimento(Core.getLinkReport("dec_venc").addParam("employee_id",Core.getParamInt("p_id"))); 
      else
            view.declaracao_de_vencimento.setVisible(false);
                                        
                                        
                                        //or PDF report - Response=> Core.getLinkReportPDF("dec_venc",new nosi.core.webapp.Report().addParam("employee_id","?"));or report HTML - Response=> Core.getLinkReport("dec_venc",new nosi.core.webapp.Report().addParam("employee_id","?")););
      
      
      /*try{
			TJobs tjobsfilter = new TJobs().find();
			List<TJobs> tjobsList = tjobsfilter.all();
			LinkedHashMap<String, String> funcao = new LinkedHashMap<>();
			funcao.put(null, gt("-- Selecionar --"));
			for(TJobs tjobs : tjobsList){
				funcao.put(tjobs.getJobId().toString(), gt(tjobs.getJobTitle()));
			}
			view.funcao.setValue(funcao);
			}catch ( Exception e ) {
				e.printStackTrace();
			}
			
			try{
			TDepartments tdepartmentsfilter = new TDepartments().find();
			List<TDepartments> tdepartmentsList = tdepartmentsfilter.all();
			LinkedHashMap<String, String> departamento = new LinkedHashMap<>();
			departamento.put(null, gt("-- Selecionar --"));
			for(TDepartments tdepartments : tdepartmentsList){
				departamento.put(tdepartments.getDepartmentId().toString(), gt(tdepartments.getDepartmentName()));
			}
			view.departamento.setValue(departamento);
			}catch ( Exception e ) {
				e.printStackTrace();
			}
			
			try{
			TEmployees temployeesfilter = new TEmployees().find();
			List<TEmployees> temployeesList = temployeesfilter.all();
			LinkedHashMap<String, String> coordenador = new LinkedHashMap<>();
			coordenador.put(null, gt("-- Selecionar --"));
			for(TEmployees temployees : temployeesList){
				coordenador.put(temployees.getEmployeeId().toString(), gt(temployees.getFirstName().concat(", ").concat(temployees.getLastName())));
			}
			view.coordenador.setValue(coordenador);
			}catch ( Exception e ) {
				e.printStackTrace();
			}
			
			try{
			String isEdit = Core.getParam("isEdit");
			if (Core.isNotNull(isEdit)) {
				TEmployees temployees = new TEmployees().findOne(Core.getParamInt("p_id"));
				if (temployees!=null && !temployees.hasError()) {
					model.setNome(temployees.getFirstName());
					model.setApelido(temployees.getLastName());
					model.setEmail(temployees.getEmail());
					model.setSalario(temployees.getSalary());
					model.setData_de_contratacao(Core.convertLocalDateToString(temployees.getHireDate(), Core.DD_MM_YYYY));
					model.setTelefone(temployees.getPhoneNumber());
					model.setFuncao(temployees.getJobId().getJobId().toString());
					model.setDepartamento(temployees.getDepartmentId().getDepartmentId().toString());
					model.setCoordenador(temployees.getManagerId().toString());
			
			view.btn_gravar.addParameter("isEdit", "true");
			this.addQueryString("p_isEdit","true");
				}
			}
			}catch ( Exception e ) {
				e.printStackTrace();
			}
		*/
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Funcionario model = new Funcionario();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("gestao_de_recursos_humanos","Funcionario","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (gravar)  */Core.setMessageWarning(model.getId().toString().concat("-model_id"));
	Core.setMessageWarning(Core.getParamInt("p_id").toString().concat("-param_id"));
	Core.setMessageWarning(Core.getParamInt("p_isEdit").toString().concat("-isEdit"));
	
	Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		if(!transaction.isActive())
			transaction.begin();
		TEmployees temployees  = new TEmployees();
		if(Core.isNotNull(isEdit)) {
			 temployees = session.find(TEmployees.class, model.getId());
		}
		if (temployees != null){
			temployees.setFirstName(model.getNome());
			temployees.setLastName(model.getApelido());
			temployees.setEmail(model.getEmail());
			temployees.setPhoneNumber(model.getTelefone());
			temployees.setHireDate(Core.convertStringToLocalDate(model.getData_de_contratacao(), Core.DD_MM_YYYY));
	TJobs tjobsForeign = session.find(TJobs.class, model.getFuncao());
	temployees.setJobId(tjobsForeign);
			temployees.setSalary(model.getSalario());
			temployees.setManagerId(model.getCoordenador());
	TDepartments tdepartmentsForeign = session.find(TDepartments.class, model.getDepartamento());
	temployees.setDepartmentId(tdepartmentsForeign);
		}
		session.persist(temployees);
		transaction.commit();
		Core.setMessageSuccess();
	}
	else
		Core.setMessageError();
	}catch ( Exception e ) {
		e.printStackTrace();
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
	if(Core.isNotNull(isEdit)) {
		this.addQueryString("isEdit", "true");
		return this.forward("gestao_de_recursos_humanos","Funcionario","index",this.queryString());
	}/* End-Code-Block  */
		/*----#start-code(gravar)----*/
		/*Session session = null;
		Transaction transaction = null;
		String isEdit = Core.getParam("isEdit");
		try{
		if (model.validate()) {
			session = Core.getSession(Core.defaultConnection());
			transaction = session.getTransaction();
			if(!transaction.isActive())
				transaction.begin();
			TEmployees temployees  = new TEmployees();
			if(Core.isNotNull(isEdit)) {
				 temployees = session.find(TEmployees.class, model.getId());
			}
			if (temployees != null){
				temployees.setFirstName(model.getNome());
				temployees.setLastName(model.getApelido());
				temployees.setEmail(model.getEmail());
				temployees.setSalary(model.getSalario());
				temployees.setHireDate(Core.convertStringToLocalDate(model.getData_de_contratacao(), Core.DD_MM_YYYY));
		TJobs tjobsForeign = session.find(TJobs.class, Core.toInt(model.getFuncao()));
		temployees.setJobId(tjobsForeign);
				temployees.setManagerId(Core.toInt(model.getCoordenador()));
		TDepartments tdepartmentsForeign = session.find(TDepartments.class, Core.toInt(model.getDepartamento()));
		temployees.setDepartmentId(tdepartmentsForeign);
		
		this.addQueryString("p_id",temployees.getEmployeeId());
			}
			session.persist(temployees);
			transaction.commit();
			Core.setMessageSuccess();
		}
		else
			Core.setMessageError();
		}catch ( Exception e ) {
			e.printStackTrace();
			Core.setMessageError("Error: "+ e.getMessage());
			if (transaction != null)
				transaction.rollback();
		}finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
		if(Core.isNotNull(isEdit)) {
			this.addQueryString("isEdit", "true");
			return this.forward("gestao_de_recursos_humanos","Funcionario","index",this.queryString());
		}*/
		
      //return this.forward("gestao_de_recursos_humanos","Funcionario","index",this.queryString()); 
		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Funcionario","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
