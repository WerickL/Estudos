package exercicio_3;

import java.util.Scanner;
public class Robo {
	private static int num_identifica��o;
	private String status;
	private double pos_x;
	private double pos_y;
	private int quant_po;
	private int lim_po;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int controle;
		Robo ra = new Robo();
		int p = 0;
		while (p == 0) {
			System.out.println("Controlar rob� aspirador:\n"
					+  "1: Ligar\n"
					+ "2: Desligar\n"
					+ "3: Andar\n"
					+ "4: Parar\n"
					+ "5: Aspirar\n"
					+ "6: esvaziar o p� do aspirador\n"
					+ "7: Comprar um rob� novo\n"
					+ "8: Sair\n");
			controle = sc.nextInt();
			switch (controle) {
				case 1:
					ra.ligar();
					System.out.println(ra.toString());
					break;
				case 2:
					ra.desligar();
					System.out.println(ra.toString());
					break;				
				case 3:
					ra.andar();
					System.out.println(ra.toString());
					break;
				case 4:
					ra.parar();
					System.out.println(ra.toString());
					break;
				case 5:
					ra.aspirar();
					System.out.println(ra.toString());
					break;
				case 6:
					ra.setQuantidade();
					System.out.println(ra.toString());
					break;
				case 7:
					ra = new Robo();
					System.out.println(ra.toString());
					break;
				case 8:
					p = 1;
					System.out.println("O programa foi encerrado!");
					break;
				default:
					System.out.println("Essa op��o n�o est� dispon�vel");
			}
		}
	}
	
	
	public Robo() {
		this.pos_x = 0;
		this.pos_y = 0;
		this.quant_po = 0;
		this.lim_po = 99;
		num_identifica��o++;
		this.status = "desligado";
	}
	
	
	public void ligar() {
		this.status = "ligado";
	}
	
	
	public void desligar() {
		this.status = "desligado";
	}
	
	
	public void aspirar() {
			if ((this.status.intern() == "ligado") || (this.status.intern() == "andando") || (this.status.intern() == "parado")) {	
				Scanner sc = new Scanner(System.in);
				System.out.println("Determine a quantidade de p� que voc� deseja aspirar:\nO limite �: " + getLimite());
				int quantidade = sc.nextInt();
				if (this.quant_po + quantidade <= this.lim_po) {
					this.quant_po += quantidade;
					System.out.println("Aspirando...");
				}
				else {
					System.out.println("O limite foi atingido, desligando imediatamente...");
					this.status = "desligado";
					this.quant_po = this.lim_po;
				}
			}
			else {
				System.out.println("N�o � poss�vel realizar essa opera��o, poi o aspirador est� " + this.status + "!");
			}
	}
	
	
	public void andar() {
		if ((this.status.intern() == "ligado") || (this.status.intern() == "andando") || (this.status.intern() == "parado")) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Determine a quantidade em metros de movimento horizontal:");
			double x = sc.nextInt();
			System.out.println("Determine a quantidade em metros de movimento vertical:");
			double y = sc.nextInt();
			this.pos_y += y;
			this.pos_x += x;
			this.status = "andando";
		}
		else {
			System.out.println("N�o � poss�vel realizar essa opera��o, poi o aspirador est� " + this.status + "!");
		}
	}
	
	
	public void parar() {
		if ((this.status.intern() == "ligado") || (this.status.intern() == "andando") || (this.status.intern() == "parado")) {
			this.status = "parado";
		}
		else {
			System.out.println("N�o � poss�vel realizar essa opera��o, poi o aspirador est� " + this.status + "!");
		}
	}
	
	
	public String toString() {
		String num_identify = String.valueOf(num_identifica��o);
		String status = String.valueOf(this.status);
		String pos_x = String.valueOf(this.pos_x);
		String pos_y = String.valueOf(this.pos_y);
		String quant_po = String.valueOf(this.quant_po);
		String lim_po = String.valueOf(this.lim_po);
		return ("\nN�mero de identifica��o: " + num_identify + "\n" +
				"Status atual: " + status + "\n" +
				"Posi��o em X: " + pos_x + "\n" +
				"Posi��o em Y: " + pos_y + "\n" +
				"Quantidade de p�: " + quant_po + "\n" +
				"Limite suportado: " + lim_po + "\n");
	}
	
	
	public int getLimite() {
		return this.lim_po;
	}
	public void setQuantidade() {
		if (this.status.intern() == "desligado") {
			this.quant_po = 0;
			System.out.println("O aspirador foi esvaziado.");
		}
		else {
			System.out.println("N�o � poss�vel realizar essa opera��o, poi o aspirador est� " + this.status + "!\nDesligue-o antes de fazer qualquer manuten��o.");
		}
	}
}	
