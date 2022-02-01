import java.util.Scanner;
class EntradaDados {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in); //cria objeto para leitura
			String nome;
			int matricula;
			System.out.println("Entre com o nome do aluno:");
			nome = ler.nextLine();
			System.out.println("Entre com a matr�cula do aluno:");
			matricula = ler.nextInt();
			System.out.println("Aluno: " + nome +  " - matricula: "  + matricula);
}
}
