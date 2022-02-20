package exercicio_3;

public class Morador {
	private String nome;
	private String cpf;
	private String celular;
	private String nascimento;
	private String sexo;
	private String bloco;
	private String apartamento;
	private int codigoDeAcesso;
	private static int codigo_sequencial = -1;
	public Morador() {
		codigo_sequencial = codigo_sequencial + 1;
	}
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
	public String getBloco() {
		return this.bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public String getApartamento() {
		return this.apartamento;
	}
	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}
	public void setCodigoDeAcesso(int codigoDeAcesso) {
		this.codigoDeAcesso = codigoDeAcesso;
	}
	public static int getCodigo_sequencial() {
		return codigo_sequencial;
	}
}
