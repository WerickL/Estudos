package Exercicios;

import java.util.Scanner;
public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int val1;
		int val2;
		int c;
		int quant = 0;
		int soma = 0;
		float media = 0;
		int pares = 0;
		System.out.print("Digite o valor inicial:");
		val1 = ler.nextInt();
		System.out.print("Digite o Valor final");
		val2 = ler.nextInt();
		for(c = val1 + 1; c <  val2; c = c+1 ) {
			quant++;
			soma += c;
			if (c%2 == 0) {
				pares++;
			}
		}
		media = ((float)soma/(float)quant);
		System.out.println("Quantidade: "+quant+"\nSoma: "+soma+"\nMédia: "+ media+ "\nPares: "+pares);
	}

}
