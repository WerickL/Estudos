package exercicio_3;

import java.util.ArrayList;
import java.util.Date;

public class Assistencia {

	public static void main(String[] args) {   
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Cliente cliente1 = new Cliente("Marcos", "543.927.890-71", "(67) 2432-5423");
		
		Aparelho aparelho1 = new Aparelho("5540", "2017", "LG", "K548", cliente1);
		
		Funcionario atendente1 = new Funcionario("João", "125.689.720-50", 201504739);
		
		Atendimento atendimento1 = new Atendimento(new Date(), "Quebrou a tela", atendente1, aparelho1);
		aparelho1.adicionarAtendimento(atendimento1);
		
		Funcionario atendente1_2 = new Funcionario("Pedro", "340.732.470-77", 2015487351);
		Atendimento atendimento1_2 = new Atendimento(new Date(), "Tela nova Parou de funcionar", atendente1_2, aparelho1 );
		aparelho1.adicionarAtendimento(atendimento1_2);
		
		
		Cliente cliente2 = new Cliente("Felipe", "573.531.960-41", "(75) 3426-7943");
		
		Aparelho aparelho2 = new Aparelho("554/0", "2017", "Sansung", "h24587f", cliente2);
		
		Funcionario atendente2 = new Funcionario("Thiago", "504.501.200-23", 2019485468);
	
		Atendimento atendimento2 = new Atendimento(new Date(), "Bateria estragou", atendente2, aparelho2);
		aparelho2.adicionarAtendimento(atendimento2);
		
		
		
		Funcionario atendente2_2 = new Funcionario("David", "264.181.360-20", 2020484673);
		
		Atendimento atendimento2_2 = new Atendimento(new Date(), "Tela ficou verde", atendente2_2, aparelho2 );
		aparelho2.adicionarAtendimento(atendimento2_2);
		
		pessoas.add(cliente1);
		pessoas.add(atendente1);
		pessoas.add(cliente2);
		pessoas.add(atendente2_2);
		
		for (int i = 0; i<pessoas.size();i++) {
			System.out.println(pessoas.get(i));
		}
		
		aparelho1.getAtendimentos();
		aparelho2.getAtendimentos();
		
		
	}

}
