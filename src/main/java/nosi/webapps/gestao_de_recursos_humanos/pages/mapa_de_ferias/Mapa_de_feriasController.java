package nosi.webapps.gestao_de_recursos_humanos.pages.mapa_de_ferias;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import java.util.List; //block import
import java.util.LinkedHashMap; //block import
import static nosi.core.i18n.Translator.gt; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TDepartments; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TJobs; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TVacationMap; //block import
import nosi.webapps.gestao_de_recursos_humanos.dao.TEmployees; //block import
import java.time.LocalDate; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/

import nosi.webapps.gestao_de_recursos_humanos.helpers.mapa_de_ferias.HelperMapaFerias;
/*----#end-code----*/
		
public class Mapa_de_feriasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapa_de_ferias model = new Mapa_de_ferias();
		model.load();
		Mapa_de_feriasView view = new Mapa_de_feriasView();
		view.map_id.setParam(true);
		view.ano.loadDomain("ANO","gestao_de_recursos_humanos","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Mollit doloremque stract totam iste' as funcionario,'Doloremque sit elit aliqua eli' as departamento,'Aliqua ipsum natus magna accus' as funcao,'15' as dias_ano_ante,'21' as dias_ano_atual,'Omnis aperiam magna sit aliqua' as periodo_1,'Voluptatem consectetur totam m' as periodo_2,'Rem laudantium officia sit nat' as periodo_3,'Perspiciatis adipiscing sit of' as periodo_4,'hidden-03d8_97f3' as map_id "));
		view.departamento_id.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.funcao_id.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) */
	/*
	if(Core.isNotNullOrZero(model.getAno())){
				model.setAno("2023");
	}
	
	
	try{
	TDepartments tdepartmentsfilter = new TDepartments().find();
	List<TDepartments> tdepartmentsList = tdepartmentsfilter.all();
	LinkedHashMap<String, String> departamento_id = new LinkedHashMap<>();
	departamento_id.put(null, gt("-- Selecionar --"));
	for(TDepartments tdepartments : tdepartmentsList){
		departamento_id.put(tdepartments.getDepartmentId().toString(), gt(tdepartments.getDepartmentName()));
	}
	view.departamento_id.setValue(departamento_id);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	TJobs tjobsfilter = new TJobs().find();
	List<TJobs> tjobsList = tjobsfilter.all();
	LinkedHashMap<String, String> funcao_id = new LinkedHashMap<>();
	funcao_id.put(null, gt("-- Selecionar --"));
	for(TJobs tjobs : tjobsList){
		funcao_id.put(tjobs.getJobId().toString(), gt(tjobs.getJobTitle()));
	}
	view.funcao_id.setValue(funcao_id);
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
		TVacationMap tvacationmapfilter = new TVacationMap().find();
	if(Core.isNotNullOrZero(model.getAno())){
		tvacationmapfilter.andWhere("year","=",model.getAno());
	}
	List<TVacationMap> tvacationmapList = tvacationmapfilter.orderByAsc("employeeId").all();
	List<Mapa_de_ferias.Table_1> tvacationmapTable = new ArrayList<>();
	if(Core.isNotNull(tvacationmapList)){
		for(TVacationMap tvacationmap : tvacationmapList){
			Mapa_de_ferias.Table_1 row  = new Mapa_de_ferias.Table_1();
			row.setFuncionario(tvacationmap.getEmployeeId().getFirstName().concat(" ").concat(tvacationmap.getEmployeeId().getLastName()));
			row.setDepartamento(tvacationmap.getEmployeeId().getDepartmentId().getDepartmentName());
			row.setFuncao(tvacationmap.getEmployeeId().getJobId().getJobTitle());
			row.setDias_ano_ante(tvacationmap.getTransportedDays());
			row.setDias_ano_atual(22);
	
	if(Core.isNotNullOrZero(tvacationmap.getDays1())){
				row.setPeriodo_1("Gozo de ".concat(tvacationmap.getDays1().toString()).concat(" dia(a) a partir de ").concat(Core.convertLocalDateToString(tvacationmap.getStartDate1(), Core.DD_MM_YYYY)));
	}
	
	
	if(Core.isNotNullOrZero(tvacationmap.getDays2())){
				row.setPeriodo_2("Gozo de ".concat(tvacationmap.getDays2().toString()).concat(" dia(a) a partir de ").concat(Core.convertLocalDateToString(tvacationmap.getStartDate2(), Core.DD_MM_YYYY)));
	}
	
	
	if(Core.isNotNullOrZero(tvacationmap.getDays3())){
				row.setPeriodo_3("Gozo de ".concat(tvacationmap.getDays3().toString()).concat(" dia(a) a partir de ").concat(Core.convertLocalDateToString(tvacationmap.getStartDate3(), Core.DD_MM_YYYY)));
	}
	
	
	if(Core.isNotNullOrZero(tvacationmap.getDays4())){
				row.setPeriodo_4("Gozo de ".concat(tvacationmap.getDays4().toString()).concat(" dia(a) a partir de ").concat(Core.convertLocalDateToString(tvacationmap.getStartDate3(), Core.DD_MM_YYYY)));
	}
	
	
	if(tvacationmap.getEmployeeId().getEmail() != Core.getCurrentUser().getEmail()){
		row.hiddenButton(view.btn_meu_mapa);
	}
	
			row.setMap_id(tvacationmap.getVacationMapId().toString());
			tvacationmapTable.add(row);
		}
		model.setTable_1(tvacationmapTable);
	}
	}catch(Exception e){
		e.printStackTrace();
	}
	*//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		HelperMapaFerias.index(model, view, this);

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo_mapa() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapa_de_ferias model = new Mapa_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_map_id",Core.getParam("p_map_id"));
		  return this.forward("gestao_de_recursos_humanos","Mapa_de_ferias","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (novo_mapa)  *//* End-Code-Block  */
		/*----#start-code(novo_mapa)----*/
		HelperMapaFerias.novoMapa(model, this);

		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Mapa_de_ferias","index", this.queryString());	
	}
	
	public Response actionFiltrar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapa_de_ferias model = new Mapa_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_map_id",Core.getParam("p_map_id"));
		  return this.forward("gestao_de_recursos_humanos","Lista_de_funcionarios","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (filtrar)  */
	return this.forward("gestao_de_recursos_humanos","Mapa_de_ferias","index",this.queryString());/* End-Code-Block  */
		/*----#start-code(filtrar)----*/

		/*----#end-code----*/
			
	}
	
	public Response actionMeu_mapa() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapa_de_ferias model = new Mapa_de_ferias();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_map_id",Core.getParam("p_map_id"));
		  return this.forward("gestao_de_recursos_humanos","Meu_mapa","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (meu_mapa)  */
	this.addQueryString("p_map_id", Core.getParam("p_map_id"));
	
	this.addQueryString("isEdit", "true");/* End-Code-Block  */
		/*----#start-code(meu_mapa)----*/

		/*----#end-code----*/
		return this.redirect("gestao_de_recursos_humanos","Meu_mapa","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
