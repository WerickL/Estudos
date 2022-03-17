package Exercicios;

import java.util.Scanner;
public class exercicio_2 {
public static  void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	String nome;
	int matricula;
	int quant_alunos = 0;
	String lista = "Lista de alunos:\n";
	System.out.print("Informe a quantidade de alunos a ser cadastrada: ");
	quant_alunos = ler.nextInt();
	for (int c=0; c < quant_alunos;c++) {
		System.out.println("Entre com o nome do aluno: ");
		nome = ler.next();
		System.out.println("Entre com a matricula do aluno:");
		matricula = ler.nextInt();
		lista = lista + matricula + " - " + nome + "\n";
		
	}
	System.out.println(lista);
}

}
