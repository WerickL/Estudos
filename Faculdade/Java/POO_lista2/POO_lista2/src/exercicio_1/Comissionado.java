package exercicio_1;

public class Comissionado extends Funcionario{
	public Comissionado(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	private double salario;
	private int total_de_vendas;
	private double percentual_de_comissao;
	
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setTotal_de_vendas(int total_de_vendas) {
		this.total_de_vendas = total_de_vendas;
	}
	public void setPercentual_de_comissao(double percentual_de_comissao) {
		this.percentual_de_comissao = percentual_de_comissao;
	}
	private double valorComissao() {
		double valor = (this.salario/100 * this.percentual_de_comissao) * this.total_de_vendas;
		return valor; 
	}
	private double comissaoAplicada() {
		double valor = this.salario + this.valorComissao();
		return valor;
	}
	public void ganhoMensal() {
		System.out.println(super.getNome()+" "+super.getSobrenome()+"\n"+
				"Ganho mensal: R$"+ this.comissaoAplicada() );
	}
}
