import java.util.Scanner;
class EntradaDados {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); //cria objeto para leitura
			String nome;
			int matricula;
			System.out.println("Entre com o nome do aluno:");
			nome = sc.nextLine();
			System.out.println("Entre com a matrícula do aluno:");
			matricula = sc.nextInt();
			System.out.println("Aluno: " + nome +  " - matricula: "  + matricula);
}
}
