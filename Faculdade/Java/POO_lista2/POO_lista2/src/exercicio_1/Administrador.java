package exercicio_1;

public class Administrador extends Funcionario {
	public Administrador(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	private double salario;
	
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void ganhoMensal() {
		System.out.println(super.getNome()+" "+super.getSobrenome()+"\n"+
				"Ganho mensal: R$"+ this.salario);
	}
}

