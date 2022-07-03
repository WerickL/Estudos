package exercicio_5;
import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		String telefone;
		int matricula;
		String horario;
		double salario;
		double aumento;
		double bonificacao;
		String tipo;
		double renda;
		String interesses;
		String profissao;
		int idade;
		String cpf;
		int control = 0;
		
		while (control == 0) {
			System.out.println("\nQual parte do código deseja testar?"
					+ "\n1: Cadastrar funcionário caixa."
					+ "\n2: Cadastrar funcionário gerente."
					+ "\n3: Cadastrar 3 clientes."
					+ "\n4: Encerrar o código.");
			int opc = sc.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Cadastrando novo funcionário para a função - Caixa");
				System.out.println("Informe o nome do funcionário.");
				nome = sc.next();
				System.out.println("Informe o número de matrícula do funcionário.");
				matricula = sc.nextInt();
				
				Caixa cx = new Caixa(nome, matricula);
				
				
				System.out.println("Informe o horário de trabalho do funcionário.");
				horario = sc.next();
				cx.setHorario(horario);
				
				System.out.println("Informe o número de telefone do funcionário.");
				telefone = sc.next();
				cx.setTelefone(telefone);
				
				System.out.println("Informe o salário do funcionário.");
				salario = sc.nextDouble();
				cx.setSalario(salario);
				
				System.out.println("Em quanto deseja aumentar o salário do funcionário? (%)");
				aumento = sc.nextDouble();
				cx.aumentaSalario(aumento);
				
				System.out.println("Nome: " + cx.getNome()+
									"\nMatricula: " + cx.getMatricula()+
									"\nHorario: " + cx.getHorario()+
									"\nTelefone: " + cx.getTelefone()+
									"\nSalário: R$" + cx.getSalario());
				System.out.println("Ganho anual: R$" + cx.ganhoAnual());
				break;
			
			case 2:
				System.out.println("Cadastrando novo funcionário para a função - Gerente");
				System.out.println("Informe o nome do funcionário.");
				nome = sc.next();
				System.out.println("Informe o número de matrícula do funcionário.");
				matricula = sc.nextInt();
				Gerente gr = new Gerente(nome, matricula);
				
				System.out.println("Informe o número de telefone do funcionário.");
				telefone = sc.next();
				gr.setTelefone(telefone);
				
				System.out.println("Informe o salário do funcionário.");
				salario = sc.nextDouble();
				gr.setSalario(salario);
				
				System.out.println("Definia a bonificação mensal do funcionário.(%)");
				bonificacao = sc.nextDouble();
				gr.setBonificacao(bonificacao);
				
				System.out.println("Informe o tipo de Pessoa do funcionário: PF/PJ");
				tipo = sc.next();
				gr.setTipo(tipo);
				
				System.out.println("Em quanto deseja aumentar o salário do funcionário? (%)");
				aumento = sc.nextDouble();
				gr.aumentaSalario(aumento);
				
				System.out.println("Nome: " + gr.getNome()+
						"\nMatricula: " + gr.getMatricula()+
						"\nTelefone: " + gr.getTelefone()+
						"\nSalário: R$" + gr.getSalario()+
						"\nBonificação: " + gr.getBonificacao() +"% = R$"+ gr.bonificacaoAplicada()+
						"\nGanho mensal: R$" + gr.getSalarioTotal()+
						"\nTipo: " + gr.getTipo());
				System.out.println("Ganho anual: R$" + gr.ganhoAnual());
				break;
			case 3:	
				System.out.println("Cliente 1!");
				System.out.println("Informe o nome do cliente.");
				nome = sc.next();
				System.out.println("Informe o telefone do cliente.");
				telefone = sc.next();
				System.out.println("Informe a renda do cliente.");
				renda = sc.nextDouble();
				System.out.println("Informe os interesses do cliente.");
				interesses = sc.next();
				System.out.println("Informe a profissão do cliente.");
				profissao = sc.next();
				System.out.println("Informe a idade do cliente.");
				idade = sc.nextInt();
				System.out.println("Informe CPF do cliente.");
				cpf = sc.next();
				Cliente cliente1 = new Cliente(nome, telefone, renda, interesses, profissao, idade, cpf);
				System.out.println("Cliente Cadastrado!\n");
				
				System.out.println("Cliente 2!");
				System.out.println("Informe o nome do cliente.");
				nome = sc.next();
				System.out.println("Informe o telefone do cliente.");
				telefone = sc.next();
				System.out.println("Informe a renda do cliente.");
				renda = sc.nextDouble();
				System.out.println("Informe os interesses do cliente.");
				interesses = sc.next();
				System.out.println("Informe a profissão do cliente.");
				profissao = sc.next();
				System.out.println("Informe a idade do cliente.");
				idade = sc.nextInt();
				System.out.println("Informe CPF do cliente.");
				cpf = sc.next();
				Cliente cliente2 = new Cliente(nome, telefone, renda, interesses, profissao, idade, cpf);
				System.out.println("Cliente Cadastrado!\n");
				
				
				System.out.println("Cliente 3!");
				System.out.println("Informe o nome do cliente.");
				nome = sc.next();
				System.out.println("Informe o telefone do cliente.");
				telefone = sc.next();
				System.out.println("Informe a renda do cliente.");
				renda = sc.nextDouble();
				System.out.println("Informe os interesses do cliente.");
				interesses = sc.next();
				System.out.println("Informe a profissão do cliente.");
				profissao = sc.next();
				System.out.println("Informe a idade do cliente.");
				idade = sc.nextInt();
				System.out.println("Informe CPF do cliente.");
				cpf = sc.next();
				Cliente cliente3 = new Cliente(nome, telefone, renda, interesses, profissao, idade, cpf);
				System.out.println("Cliente Cadastrado!\n");
				
				System.out.println("Desativando o cliente " + cliente2.getNome());
				cliente2.desativar();
				
				cliente1.dadosCliente();
				cliente2.dadosCliente();
				cliente3.dadosCliente();
				break;
			case 4:
				control = 1;
				System.out.println("Encerrando programa...");
				break;
			default:
				System.out.println("Essa opção não está disponível!\n");
				break;
			}
		}
	}
		
}
