package exercicio_1;
import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario team[];
		team = new Funcionario[10];
		
		//2 Horistas
		String nome = lerString("Informe o nome do Funcion�rio");
		String sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[0] = new Horistas(nome, sobrenome);
		System.out.println("Cadastrado como Horista");
		
		nome = lerString("Informe o nome do Funcion�rio");
		sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[1] = new Horistas(nome, sobrenome);
		System.out.println("Cadastrado como Horista");
		
		//4 Administradores
		nome = lerString("Informe o nome do Funcion�rio");
		sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[2] = new Administrador(nome, sobrenome);
		System.out.println("Cadastrado como Administrador");
		
		nome = lerString("Informe o nome do Funcion�rio");
		sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[3] = new Administrador(nome, sobrenome);
		System.out.println("Cadastrado como Administrador");
		
		nome = lerString("Informe o nome do Funcion�rio");
		sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[4] = new Administrador(nome, sobrenome);
		System.out.println("Cadastrado como Administrador");
		
		nome = lerString("Informe o nome do Funcion�rio");
		sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[5] = new Administrador(nome, sobrenome);
		System.out.println("Cadastrado como Administrador");
		
		//3 Comisionados
		nome = lerString("Informe o nome do Funcion�rio");
		sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[6] = new Comissionado(nome, sobrenome);
		System.out.println("Cadastrado como Comissionado");
		
		nome = lerString("Informe o nome do Funcion�rio");
		sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[7] = new Comissionado(nome, sobrenome);
		System.out.println("Cadastrado como Comissionado");
		
		nome = lerString("Informe o nome do Funcion�rio");
		sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[8] = new Comissionado(nome, sobrenome);
		System.out.println("Cadastrado como Comissionado");
		
		//1 Gerente
		nome = lerString("Informe o nome do Funcion�rio");
		sobrenome = lerString("Informe o sobrenome do Funcion�rio");
		team[9] = new Gerente(nome, sobrenome);
		System.out.println("Cadastrado como Gerente");
		
		//Cadastrando os dados baseado na instancia do objeto
		for (int i=0; i<=9; i++) {
			if(team[i] instanceof Gerente) {
				double salario = lerDouble("Informe o sal�rio do Gerente: " +team[i].getNome());
				((Gerente) team[i]).setSalario(salario);
				double  bonificacao = lerDouble("Informe o percentual de bonifica��o");
				((Gerente) team[i]).setBonificacao(bonificacao);
			}
			else if (team[i] instanceof Administrador) {
				double salario = lerDouble("Informe o sal�rio do Administrador: "+team[i].getNome());
				((Administrador) team[i]).setSalario(salario);
			}
			else if (team[i] instanceof Comissionado) {
				double salario = lerDouble("Informe o sal�rio do Comissionado: " + team[i].getNome());
				((Comissionado) team[i]).setSalario(salario);
				int total_de_vendas = lerInteiro("Informe o total de vendas do Comissionado: "+team[i].getNome());
				((Comissionado) team[i]).setTotal_de_vendas(total_de_vendas);
				double comissao = lerDouble("Informe o percentual de comiss�o do Comissionado: "+team[i].getNome());
				((Comissionado) team[i]).setPercentual_de_comissao(comissao);
			}
			else {
				int horas_trabalhadas = lerInteiro("Informe o total de horas trabalhadas do Horista: "+team[i].getNome());
				((Horistas) team[i]).setHoras_Trabalhadas(horas_trabalhadas);
				double valor_hora = lerDouble("Informe o valor por hora do Horista: "+team[i].getNome());
				((Horistas) team[i]).setValor_Hora(valor_hora);
			}
		}
		// mostrando os dados de cada classe
		for (int i=0; i<=9; i++) {
			team[i].ganhoMensal();
		}
	}
	
	
	//m�todos �teis haha
	public static String lerString(String txt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(txt);
		String texto = sc.nextLine();
		return texto;
	}
	public static double lerDouble(String txt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(txt);
		double valor = sc.nextDouble();
		return valor;
	}
	public static int lerInteiro(String txt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(txt);
		int valor = sc.nextInt();
		return valor;
	}
}
