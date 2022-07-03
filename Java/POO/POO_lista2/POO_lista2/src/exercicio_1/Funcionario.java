package exercicio_1;

public class Funcionario {
	public Funcionario(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		
	}
	private String nome;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void ganhoMensal() {
		System.out.println("Não há dados suficientes para gerar essa informação!");
	}
}

