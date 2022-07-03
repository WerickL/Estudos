package exercicio_1;


public class Gerente extends Funcionario {
	public Gerente(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	private double bonificacao;
	private double salarioTotal;
	private double salario;
	
	
	
	private void calcularBonificacao() {
		double boni = this.salario/100 * this.bonificacao;
		this.salarioTotal = this.salario + boni;
	}
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
		this.calcularBonificacao();
	}
	public void setSalario(double salario) {
		this.salario = salario;
		this.calcularBonificacao();
	}
	public void ganhoMensal() {
		System.out.println(super.getNome()+" "+ super.getSobrenome()+"\n"+
				"Ganho mensal: R$"+ this.salarioTotal);
	}
}
