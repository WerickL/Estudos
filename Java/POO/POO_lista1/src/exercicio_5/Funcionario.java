package exercicio_5;

public class Funcionario extends Pessoa {
	protected int matricula;
	protected double salario;
	public Funcionario(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public int getMatricula() {
		return this.matricula;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;	
	}
	public void aumentaSalario(double percentual) {
		this.salario = this.salario + (salario/100 * percentual);
	}
	public double ganhoAnual() {
		return this.salario * 12;
	}
	
}