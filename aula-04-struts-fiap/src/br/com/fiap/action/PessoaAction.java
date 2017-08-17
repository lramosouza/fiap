package br.com.fiap.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/pessoa")
public class PessoaAction extends ActionSupport {

	private static List<PessoaBean> pessoa = new ArrayList<PessoaBean>();
	private String mensagem;

	public PessoaAction(List<PessoaBean> pessoa) {
		pessoa = PessoaAction.pessoa;
	}

	@Action(value = "/cadastrar", results = { @Result(name = "success", location = "/cadastro.jsp"),
			@Result(name = "error", location = "/erro.jsp"), })

	public String cadastrar() {
		pessoa.addAll(pessoa);
		this.mensagem = "Deu bom";
		return SUCCESS;
	}

	public static List<PessoaBean> getPessoa() {
		return pessoa;
	}

	public static void setPessoa(List<PessoaBean> pessoa) {
		PessoaAction.pessoa = pessoa;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
