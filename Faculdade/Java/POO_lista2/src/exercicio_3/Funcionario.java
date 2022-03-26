package exercicio_3;

public class Funcionario extends Pessoa {
	
	public Funcionario(String nome, String cpf, int matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}
	protected int matricula;
	@Override
	public String toString() {
		return "Funcionário: ["+this.nome+", matricula=" + matricula+"]" ;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
