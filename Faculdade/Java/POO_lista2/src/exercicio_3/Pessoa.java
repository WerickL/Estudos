package exercicio_3;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa nome=" + nome + ", cpf=" + cpf ;
	}
}
