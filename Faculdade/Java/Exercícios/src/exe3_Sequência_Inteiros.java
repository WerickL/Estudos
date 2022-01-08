import java.util.Scanner;
public class exe3_Sequência_Inteiros {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int val1;
		int val2;
		int c;
		int quant = 0;
		int soma = 0;
		float media = 0;
		System.out.println("Digite o valor inicial:");
		val1 = ler.nextInt();
		System.out.println("Digite o Valor final");
		val2 = ler.nextInt();
		for(c = val1; c <=  val2; c = c+1 ) {
			quant++;
			soma += c;
		}
		media = ((float)soma/(float)quant);
		System.out.println("Quantidade: "+quant+" Soma: "+soma+" Média: "+ media);
		
	}
}
