package exercicio_5;

public class Gerente extends Funcionario {
	public Gerente(String nome, int matricula) {
		super(nome, matricula);
	}
	private double bonificacao;
	private String tipo;
	private double salarioTotal;
	
	private void bonificacao() {
		double boni = this.salario/100 * this.bonificacao;
		this.salarioTotal = this.salario + boni;
	}
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	public void setSalario(double salario) {
		this.salario = salario;
		this.bonificacao();
		
	}
	public void aumentaSalario(double percentual) {
		this.salario = this.salario + (this.salario/100 * percentual);
		this.bonificacao();
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getBonificacao() {
		return this.bonificacao;
	}
	
	public double ganhoAnual() {
		double ganho = this.salarioTotal * 12;
		return ganho;
	}
	public double bonificacaoAplicada() {
		return this.salario/100 * this.bonificacao;
	}
	public double getSalarioTotal() {
		return this.salarioTotal;
	}
}
