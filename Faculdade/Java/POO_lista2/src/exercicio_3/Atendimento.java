package exercicio_3;

import java.util.Date;

public class Atendimento {
	private Date data;
	private String descricao;
	
	private Funcionario atendente;
	private Aparelho aparelho;

	public Atendimento(Date data, String descricao, Funcionario atendente, Aparelho aparelho) {
		this.data = data;
		this.descricao = descricao;
		this.atendente = atendente;
		this.aparelho = aparelho;
	}

	@Override
	public String toString() {
		return "\n"+"Atendimento [data = " + data + "]\n"+"descrição = [" + descricao +  "]\n"+"atendente = " + atendente +  "\n"+"aparelho = "+ aparelho ;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getAtendente() {
		return atendente;
	}

	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}

	public Aparelho getAparelho() {
		return aparelho;
	}

	public void setAparelho(Aparelho aparelho) {
		this.aparelho = aparelho;
	}
}
