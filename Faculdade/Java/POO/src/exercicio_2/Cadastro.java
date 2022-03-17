package exercicio_2;

import java.util.Scanner;
public class Cadastro {
	public static void main(String[] args) {
		Morador m1 = new Morador();
		m1 = Cadastro.cadastrarMorador();
		System.out.println("Nome: " + m1.nome + "\nCPF: " + m1.cpf + "\nCelular: " + m1.celular 
				+ "\nData de nascimento: " + m1.nascimento + "\nSexo: " +m1.sexo + "\nBloco: " + m1.bloco 
				+ "\nApartamento: " + m1.apartamento + "\nCódigo de acesso: " + m1.codigoDeAcesso);
	}
	public static Morador cadastrarMorador() {
		Scanner sc = new Scanner(System.in);
		String nome;
		String cpf;
		String celular;
		String nascimento;
		String sexo;
		String bloco;
		String apartamento;
		int codigoDeAcesso;
		System.out.println("Informe o nome do morador");
		nome = sc.next();
		System.out.println("Informe o cpf do morador");
		cpf = sc.next();
		System.out.println("Informe o celular do morador");
		celular = sc.next();
		System.out.println("Informe o Data de nascimento do morador");
		nascimento  = sc.next();
		System.out.println("Informe o sexo do morador M/F");
		sexo = sc.next();
		System.out.println("Informe o bloco do morador");
		bloco = sc.next();
		System.out.println("Informe o apartamento do morador");
		apartamento = sc.next();
		System.out.println("Informe o código de acesso do morador");
		codigoDeAcesso = sc.nextInt();
		Morador m = new Morador(nome, cpf, celular, nascimento, sexo, bloco, apartamento, codigoDeAcesso);
		System.out.println("Morador " + m.nome+ " cadastrado!");
		return m;
	}
}