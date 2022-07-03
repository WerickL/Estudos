package exercicio_2;

public class Morador {
	String nome;
	String cpf;
	String celular;
	String nascimento;
	String sexo;
	String bloco;
	String apartamento;
	int codigoDeAcesso;
	
	Morador(String nome, String cpf, String celular, String nascimento, String sexo, String bloco, String apartamento,int codigoDeAcesso){
	this.nome = nome;
	this.cpf = cpf;
	this.celular = celular;
	this.nascimento = nascimento;
	this.sexo = sexo;
	this.bloco = bloco;
	this.apartamento = apartamento;
	this.codigoDeAcesso = codigoDeAcesso;
	}
	public Morador() {
	// TODO Auto-generated constructor stub
	}
}
