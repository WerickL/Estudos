package exercicio_2;

import java.util.Scanner;
public class RedeLojas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cnpj = lerString("Informe o cnpj: ");
		String razao_social = lerString("Informe a razão social: ");
		String endereco = lerString("Informe o endereco: ");
		String gerente = lerString("Informe o nome do Gerente: ");
		LojaFisica matriz = new LojaFisica(cnpj, razao_social, endereco, gerente);
		System.out.println("Loja Criada!!");
		
		cnpj = lerString("Informe o cnpj: ");
		razao_social = lerString("Informe a razão social: ");
		endereco = lerString("Informe o endereco: ");
		gerente = lerString("Informe o nome do Gerente: ");
		LojaFisica filial1 = new LojaFisica(cnpj, razao_social, endereco, gerente);
		System.out.println("Loja Criada!!");
		
		cnpj = lerString("Informe o cnpj: ");
		razao_social = lerString("Informe a razão social: ");
		endereco = lerString("Informe o endereco: ");
		gerente = lerString("Informe o nome do Gerente: ");
		LojaFisica filial2 = new LojaFisica(cnpj, razao_social, endereco, gerente);
		System.out.println("Loja Criada!!");
		
		matriz.mostra_Dados();
		filial1.mostra_Dados();
		filial2.mostra_Dados();
		
		
		int var_control01 = 0;
		while(var_control01 == 0){
			System.out.println("\nQual loja deseja administrar?"
					+ "\n1: Loja Matriz."
					+ "\n2: Loja Filial: "+filial1.getId()
					+ "\n3: Loja Filial: "+filial2.getId()
					+ "\n4: Sair");
			int opc = sc.nextInt();
			
			int var_control02 = 0;
			switch(opc){//Escolhe a loja a ser alterada
				case 1://loja matriz
					
					matriz.mostra_Dados();
					while(var_control02 == 0) {
						
						System.out.println("\nQual ação deseja efetuar?"
								+ "\n1: Abrir Loja: "+matriz.getId()
								+ "\n2: Fechar Loja: "+matriz.getId()
								+ "\n3:  Sair: ");
						opc = sc.nextInt();
						
						switch(opc) {//escolhe a ação a ser feita na loja
							case 1:
								matriz.registra_Abertura_Dia();
								matriz.mostra_Dados();
								break;
							case 2:
								matriz.registra_Fechamento_Dia();
								matriz.mostra_Dados();
								break;
							case 3:
								var_control02 = 1;
								break;
						}
					}
					break;
				
			
				case 2://loja filial 1
					
					filial1.mostra_Dados();
					while(var_control02 == 0) {
						
						System.out.println("\nQual ação deseja efetuar?"
								+ "\n1: Abrir Loja: "+filial1.getId()
								+ "\n2: Fechar Loja: "+filial1.getId()
								+ "\n3:  Sair: ");
						opc = sc.nextInt();
						
						switch(opc) {//escolhe a ação a ser feita na loja
							case 1:
								filial1.registra_Abertura_Dia();
								filial1.mostra_Dados();
								break;
							case 2:
								filial1.registra_Fechamento_Dia();
								filial1.mostra_Dados();
								break;
							case 3:
								var_control02 = 1;
								break;
						}
					}
					break;
				case 3://loja filial 2
					
					filial2.mostra_Dados();
					while(var_control02 == 0) {
						
						System.out.println("\nQual ação deseja efetuar?"
								+ "\n1: Abrir Loja: "+filial2.getId()
								+ "\n2: Fechar Loja: "+filial2.getId()
								+ "\n3:  Sair: ");
						opc = sc.nextInt();
						
						switch(opc) {//escolhe a ação a ser feita na loja
							case 1:
								filial2.registra_Abertura_Dia();
								filial2.mostra_Dados();
								break;
							case 2:
								filial2.registra_Fechamento_Dia();
								filial2.mostra_Dados();
								break;
							case 3:
								var_control02 = 1;
								break;
						}
					}
					break;
				case 4:
					var_control01 = 1;
					break;
			}
		}
		matriz.mostra_Dados();
		filial1.mostra_Dados();
		filial2.mostra_Dados();
	}
	//métodos úteis
	 public static String lerString(String txt) {
			Scanner sc = new Scanner(System.in);
			System.out.println(txt);
			String texto = sc.nextLine();
			return texto;
		}
	 public static int lerInteiro(String txt) {
			Scanner sc = new Scanner(System.in);
			System.out.println(txt);
			int valor = sc.nextInt();
			return valor;
		}
}
