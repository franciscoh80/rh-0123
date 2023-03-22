package nosi.core.db.migration.igrp.postgres;

import nosi.core.db.migration.igrp.IgrpMigrationTemplate;
import nosi.core.webapp.Core;
import nosi.webapps.igrp.dao.Action;
import nosi.webapps.igrp.dao.Application;
import nosi.webapps.igrp.dao.Config_env;
import nosi.webapps.igrp.dao.Domain;
import nosi.webapps.igrp.dao.User;
import nosi.webapps.igrp.dao.RepTemplate;
import nosi.webapps.igrp.dao.RepSource;
import nosi.webapps.igrp.dao.RepTemplateSource;
import nosi.webapps.igrp.dao.RepTemplateSourceParam;
import nosi.webapps.igrp.dao.CLob;
import nosi.webapps.igrp.dao.Transaction;
import nosi.webapps.igrp.dao.DomainType;

/**
 * Nositeste
 * mar 22, 2023
 */
public class R__gestao_de_recursos_humanos extends IgrpMigrationTemplate{

	@Override
	public void app() {
	  this.app = new Application("gestao_de_recursos_humanos", "Gestão de Recursos Humanos", "hr_logo.png", "Treinamento", 1, null,"");
	}

	@Override
	public void pages() {
	  this.actions.add(new Action("Funcionario", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/funcionario/Funcionario.xsl", "Funcionário", "Funcionário", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Monitor", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/monitor/Monitor.xsl", "Monitor", "Monitor", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("T_jobsForm", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/t_jobsform/T_jobsForm.xsl", "Registar t_jobs", "Registar t_jobs", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("T_jobsList", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/t_jobslist/T_jobsList.xsl", "Listar t_jobs", "Listar t_jobs", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("T_regionsForm", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/t_regionsform/T_regionsForm.xsl", "Registar t_regions", "Registar t_regions", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("T_regionsList", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/t_regionslist/T_regionsList.xsl", "Listar t_regions", "Listar t_regions", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Lista_de_funcionarios", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/lista_de_funcionarios/Lista_de_funcionarios.xsl", "Lista de Funcionários", "Lista de Funcionários", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Mapa_de_ferias", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/mapa_de_ferias/Mapa_de_ferias.xsl", "Mapa de Férias", "Mapa de Férias", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Meu_mapa", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/meu_mapa/Meu_mapa.xsl", "Meu Mapa", "Meu Mapa", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Acompanhamento_de_ferias", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/acompanhamento_de_ferias/Acompanhamento_de_ferias.xsl", "Acompanhamento de Férias", "Acompanhamento de Férias", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Pedido", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/pedido/Pedido.xsl", "Pedido", "Pedido", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Parecer", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/parecer/Parecer.xsl", "Parecer", "Parecer", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Autorizacao", "index", "nosi.webapps.gestao_de_recursos_humanos.pages", "gestao_de_recursos_humanos/autorizacao/Autorizacao.xsl", "Autorização", "Autorização", "2.3", 1, this.app, (short)0, null, null, (short)0));
	}

	@Override
	public void transactions() {
	  this.transactions.add(new Transaction("gestao_de_recursos_humanos_Lista_de_funcionarios_eliminar", "Eliminar", 1, this.app));
	  this.transactions.add(new Transaction("gestao_de_recursos_humanos_Mapa_de_ferias_novo_mapa", "Novo Mapa", 1, this.app));
	}

	@Override
	public void domains() {
	  this.domains.add(new Domain("ANO", "2022", "2022", "ATIVE", 1, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ANO", "2023", "2023", "ATIVE", 2, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ANO", "2021", "2021", "ATIVE", 3, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ANO", "2020", "2020", "ATIVE", 4, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ESTADOPEDIDO", "Aguarda Parecer", "PEDIDO", "ATIVE", 1, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ESTADOPEDIDO", "Aguarda Autorização", "PARECER", "ATIVE", 2, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ESTADOPEDIDO", "Autorizado", "AUTORIZADO", "ATIVE", 3, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ESTADOPEDIDO", "Aguarda Retificação", "RETIFICAR", "ATIVE", 4, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ESTADOPEDIDO", "Cancelado", "CANCELADO", "ATIVE", 5, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ESTADOPEDIDO", "Em Férias", "EM_FERIAS", "ATIVE", 6, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("ESTADOPEDIDO", "Regresso", "FINALIZADO", "ATIVE", 7, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("AUTORIZACAO", "Autorizado", "A", "ATIVE", 1, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("AUTORIZACAO", "Desautorizado", "D", "ATIVE", 2, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("PARECER", "Favarável", "F", "ATIVE", 1, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("PARECER", "Desfavorável", "D", "ATIVE", 2, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("PARECER", "Retificar", "R", "ATIVE", 3, DomainType.PRIVATE, this.app));
	}

	@Override
	public void dbConnections() {
	  this.configs.add(new Config_env(null,null,null, "utf-8", "G6pC5Z/zvrwZsWyWjfO0RA==", "MLFDukBWlF3HDBl3LdDr6g==", "g2s6+dBC5ICTuxTLiLHoNg==", "gestao_de_recursos_humanos_postgresql_1", "rvDSR1rjREYbBKk7KybFLkNuiy8sacBkrIT9jGIQvI3D1dsrag3Xq6Tjk2WWzU1z", "fDYSEiVw09DSlMzSTJUW6XvVluz2/lrAfVM3rchj8pc=", this.app, (short)1, "051ceabf-9554-479c-ae73-88fdf1a69593"));	}

	@Override
	public void reports() {
		User userCreated0 = new User();
		userCreated0.setUser_name("demo@nosi.cv");
		User userUpdated0 = new User();
		userUpdated0.setUser_name("demo@nosi.cv");
		Application env0 = new Application();
		env0.setDad("gestao_de_recursos_humanos");
		RepTemplate report0 = new RepTemplate("dec_venc", "Declaração de Vencimento", Core.ToDateUtil("2023-03-06", "yyyy-MM-dd"), Core.ToDateUtil("2023-03-21", "yyyy-MM-dd"),1, userCreated0, userUpdated0, env0,  new CLob("dec_venc.json" ,"null", null, Core.ToDateUtil("2023-03-21", "yyyy-MM-dd"), env0, "null"), new CLob("dec_venc.xsl" ,"null", null, Core.ToDateUtil("2023-03-21", "yyyy-MM-dd"), env0, "null"), "4930bdb3-a663-4c69-954c-4cc399b8e292");
		User userCreated0_0 = new User();
		userCreated0_0.setUser_name("demo@nosi.cv");
		User userUpdated0_0 = new User();
		userUpdated0_0.setUser_name("demo@nosi.cv");
		Config_env configEnv0_0 = new Config_env();
		configEnv0_0.setConnection_identify("051ceabf-9554-479c-ae73-88fdf1a69593");
		this.repDataSources.add(new RepSource("Detalhes Funcionário ", "Query", null, "Query", "select e.employee_id, e.first_name, e.last_name, e.email, e.phone_number, e.hire_date, e.job_id, e.salary, e.manager_id, e.department_id, d.department_name , j.job_title from public.t_departments d, public.t_employees e, public.t_jobs j where  e.department_id = d.department_id and e.job_id = j.job_id and e.employee_id = :employee_id", 1, Core.ToDate("2023-03-06", "yyyy-MM-dd"),  Core.ToDate("2023-03-21", "yyyy-MM-dd"), userCreated0_0, userUpdated0_0, configEnv0_0, env0, "bda01173-8b94-465f-9357-6b6ae75432cb" , "null", "null", "null"));
		RepSource repSource0_0 = new RepSource();
		repSource0_0.setSource_identify("bda01173-8b94-465f-9357-6b6ae75432cb");
		RepTemplateSource reportSource0_0 = new RepTemplateSource(report0, repSource0_0);
		reportSource0_0.getParameters().add(new RepTemplateSourceParam(reportSource0_0, "employee_id", "java.lang.Integer"));
		report0.getReptemplatesources().add(reportSource0_0);
		this.reports.add(report0);
	}

	@Override
	public void bpmns() {
		// Not implemented yet... Put your code here!
	}

	@Override
	public void documentTypes() {
		// Not implemented yet... Put your code here!
	}


	@Override
	public Integer getChecksum() {
		return 449928603;
	}

}