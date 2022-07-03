package Exercicios;

import java.util.Scanner;
public class exercicio_3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		int maior = 0;
		int meio = 0;
		int menor = 0;
		System.out.print("Digite um valor: ");
		x = ler.nextInt();
		System.out.print("Digite outro valor: ");
		y = ler.nextInt();
		System.out.print("Digite o último valor: ");
		z = ler.nextInt();
		maior = x;
		if (y > maior) {
			if (y > z) {
				maior = y;
				if (x > z) {
					meio = x;
					menor = z;
				}else {
					meio = z;
					menor = x;
				}
			}else {
				maior = z;
				meio = y;
				menor = x;
			}
		}else if (z > maior) {
			maior = z;
			meio = x;
			menor = y;
		}else {
			if (y > z) {
				meio = y;
				menor = z;
			}else {
				meio = z;
				menor = y;
			}
		}
		System.out.println(maior + "-" + meio + "-" + menor);
	}	
}
