package exercicio_4;

public class Morador {
	private String nome;
	private String cpf;
	private String celular;
	private String nascimento;
	private String sexo;
	private int bloco;
	private int apartamento;
	private int codigoDeAcesso;
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getBloco() {
		return this.bloco;
	}
	public void setBloco(int bloco) {
		this.bloco = bloco;
	}
	public int getApartamento() {
		return this.apartamento;
	}
	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}
	public void setCodigoDeAcesso(int codigoDeAcesso) {
		this.codigoDeAcesso = codigoDeAcesso;
	}
}
