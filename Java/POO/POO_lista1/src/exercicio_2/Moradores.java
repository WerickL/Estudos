package exercicio_2;

import java.util.Scanner;
public class Moradores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = 0;
		int i = 0;
		Morador vetor[] = new Morador[3];
		
		while ((p == 0) && (i < vetor.length)) {
			vetor[i] = Cadastro.cadastrarMorador();
			i++;
			p = 2;
			while ((p == 2) && (i < vetor.length))	{
				String r = "A";
				System.out.println("Deseja cintunuar? S/N");
				r = sc.next();
				if (r.intern() == "S") {
					p = 0;
				}
				else if (r.intern() == "N") {
					p = 1;
				}
				else {
					System.out.println("Erro, considere responder apenas com S ou N");
				}
			}
			if (i == vetor.length) {
				System.out.println("Você chegou ao último morador");
			}
			
		}
		System.out.println("Dados dos moradores:");
		for (int c = 0; c < vetor.length; c++) {
			System.out.println("\nMorador:" + (c+1) + "\nNome: " + vetor[c].nome + "\nCPF: " + vetor[c].cpf + "\nCelular: " + vetor[c].celular+ "\nNascimento: " + vetor[c].nascimento 
			+ "\nSexo: " + vetor[c].sexo + "\nBloco: " + vetor[c].bloco + "\nApartamento: " + vetor[c].apartamento + "\nCódigo de acesso: " + vetor[c].codigoDeAcesso);
		}
	}
}
