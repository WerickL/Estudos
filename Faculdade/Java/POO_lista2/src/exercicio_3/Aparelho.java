package exercicio_3;
import java.util.ArrayList;

public class Aparelho {
	private String codigo;
	private String ano;
	private String marca;
	private String modelo;
	private Cliente proprietario;
	private ArrayList<Atendimento> atendimentos = new ArrayList<Atendimento>();
	
	public Aparelho(String codigo, String ano, String marca, String modelo, Cliente proprietario) {
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.codigo = codigo;
	}
	public void adicionarAtendimento(Atendimento atendimento) {
		this.atendimentos.add(atendimento);
	}
	@Override
	public String toString() {
		return "[codigo = " + codigo + ", ano = " + ano + ", marca = " + marca + ", modelo = " + modelo
				+ "]\n"+"proprietario = " + proprietario;
	}
	public void getAtendimentos() {
		for (int i = 0; i<atendimentos.size();i++) {
			System.out.println(atendimentos.get(i));
		}
	}
	
}
