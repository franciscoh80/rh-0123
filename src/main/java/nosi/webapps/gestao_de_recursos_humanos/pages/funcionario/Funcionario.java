package nosi.webapps.gestao_de_recursos_humanos.pages.funcionario;

import java.math.BigDecimal;
import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Funcionario extends Model{		

	@RParam(rParamName = "p_declaracao_de_vencimento")
	private IGRPLink declaracao_de_vencimento;
	@RParam(rParamName = "p_declaracao_de_vencimento_desc")
	private String declaracao_de_vencimento_desc;

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_apelido")
	private String apelido;

	@RParam(rParamName = "p_email")
	private String email;

	@RParam(rParamName = "p_salario")
	private BigDecimal salario;

	@RParam(rParamName = "p_data_de_contratacao")
	private String data_de_contratacao;

	@RParam(rParamName = "p_telefone")
	private String telefone;

	@RParam(rParamName = "p_funcao")
	private Integer funcao;

	@RParam(rParamName = "p_departamento")
	private Integer departamento;

	@RParam(rParamName = "p_coordenador")
	private Integer coordenador;

	@RParam(rParamName = "p_id")
	private Integer id;
	
	public IGRPLink setDeclaracao_de_vencimento(String app,String page,String action){
		this.declaracao_de_vencimento = new IGRPLink(app,page,action);
		return this.declaracao_de_vencimento;
	}
	public IGRPLink getDeclaracao_de_vencimento(){
		return this.declaracao_de_vencimento;
	}
	public void setDeclaracao_de_vencimento_desc(String declaracao_de_vencimento_desc){
		this.declaracao_de_vencimento_desc = declaracao_de_vencimento_desc;
	}
	public String getDeclaracao_de_vencimento_desc(){
		return this.declaracao_de_vencimento_desc;
	}
	public IGRPLink setDeclaracao_de_vencimento(String link){
		this.declaracao_de_vencimento = new IGRPLink(link);
		return this.declaracao_de_vencimento;
	}
	public IGRPLink setDeclaracao_de_vencimento(Report link){
		this.declaracao_de_vencimento = new IGRPLink(link);
		return this.declaracao_de_vencimento;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setApelido(String apelido){
		this.apelido = apelido;
	}
	public String getApelido(){
		return this.apelido;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setSalario(BigDecimal salario){
		this.salario = salario;
	}
	public BigDecimal getSalario(){
		return this.salario;
	}
	
	public void setData_de_contratacao(String data_de_contratacao){
		this.data_de_contratacao = data_de_contratacao;
	}
	public String getData_de_contratacao(){
		return this.data_de_contratacao;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public String getTelefone(){
		return this.telefone;
	}
	
	public void setFuncao(Integer funcao){
		this.funcao = funcao;
	}
	public Integer getFuncao(){
		return this.funcao;
	}
	
	public void setDepartamento(Integer departamento){
		this.departamento = departamento;
	}
	public Integer getDepartamento(){
		return this.departamento;
	}
	
	public void setCoordenador(Integer coordenador){
		this.coordenador = coordenador;
	}
	public Integer getCoordenador(){
		return this.coordenador;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}



}
