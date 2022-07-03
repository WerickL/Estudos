package exercicio_5;

public class Caixa extends Funcionario {
	public Caixa(String nome, int matricula) {
		super(nome, matricula);
	}
	private String horario;
	
	public String getHorario() {
		return this.horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
