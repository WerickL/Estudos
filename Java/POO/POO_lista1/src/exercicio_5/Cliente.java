package exercicio_5;

public class Cliente extends Pessoa{
	private double renda;
	private String interesses;
	private String profissao;
	private int idade;
	private String cpf;
	private String status;
	public Cliente(String nome, String telefone, double renda, String interesse, String profissao, int idade, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.renda = renda;
		this.interesses = interesse;
		this.profissao = profissao;
		this.idade = idade;
		this.cpf = cpf;
		this.status = "A";
	}
	public void desativar() {
		if (this.status.intern() == "A") {
			this.status = "I";
		}
		else {
			System.out.println("O cliente já está inativo.");
		}
	}
	public void dadosCliente() {
		System.out.println("\nDados do cliente " + this.nome
							+ "\nTelefone: "+this.telefone
							+ "\nRenda: R$"+ this.renda
							+"\nInteresses: "+this.interesses
							+"\nProfissão: "+this.profissao
							+"\nIdade: "+this.idade
							+"\nCPF: "+this.cpf
							+"\nSituação: "+this.status);
	}
}