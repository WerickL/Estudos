package exercicio_1;

public class Horistas extends Funcionario{
	public Horistas(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	private int horas_trabalhadas;
	private double valor_hora;
	
	
	public void setHoras_Trabalhadas(int horas_trabalhadas) {
		this.horas_trabalhadas = horas_trabalhadas;
	}
	public void setValor_Hora(double valor_hora) {
		this.valor_hora = valor_hora;
	}
	private double pagamentoPorHora() {
		double pagamento = this.horas_trabalhadas * this.valor_hora;
		return pagamento;
	}
	public void ganhoMensal() {
		System.out.println(this.getNome()+" "+this.getSobrenome()+"\n"+
				"Ganho mensal: R$"+ this.pagamentoPorHora());
	}
}
