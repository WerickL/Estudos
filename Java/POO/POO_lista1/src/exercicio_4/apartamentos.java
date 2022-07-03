package exercicio_4;

import java.util.ArrayList;
public class apartamentos {
	private int numero;
	private int andar;
	private double tamanho;
	private String situação;
	ArrayList<Morador> moradores = new ArrayList<Morador>();
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getSituação() {
		return situação;
	}
	public void setSituação(String situação) {
		this.situação = situação;
	}
}
/*O exercício só pediu pra criar a classe e a lista, mais nada. Talvez esteja faltando tópicos no exercício, ou interpretei errado.*/
