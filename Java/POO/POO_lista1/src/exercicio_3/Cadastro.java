package exercicio_3;

import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {
	
	public static void main(String[] args){
		ArrayList<Morador> moradores = new ArrayList();
		int indice;
		int p = 0;
		while (p == 0) {
			moradores.add(Cadastro.cadastrarMorador());
			String manter = "";
			p = 2;
			while (p == 2) {
				manter = Cadastro.lerStr("Você deseja continuar? S/N");
				if (manter.intern() == "S") {
					p = 0;
				}
				else if(manter.intern() == "N") {
					p = 1;
				}
				else {
					System.out.println("Erro! Considere responder apenas com S ou N (maiúsculas).");
				}
			}
		}
		indice = moradores.get(0).getCodigo_sequencial();
		System.out.println("Moradores Cadastrados: ");
		for (int i = 0; i <= indice; i++) {
		System.out.println("Morador: " + moradores.get(i).getNome());
		System.out.println("CPF: " + moradores.get(i).getCpf());
		}
	}
	
	public static Morador cadastrarMorador() {
		Morador morador = new Morador();
		Scanner sc = new Scanner(System.in);
		String nome;
		String cpf;
		String celular;
		String nascimento;
		String sexo;
		String bloco;
		String apartamento;
		int codigoDeAcesso;
		nome = Cadastro.lerStr("Informe o nome do morador: ");
		morador.setNome(nome);
		cpf = Cadastro.lerStr("Informe o CPF do morador: ");
		morador.setCpf(cpf);
		celular = Cadastro.lerStr("Informe o celular do morador: ");
		morador.setCelular(celular);
		nascimento = Cadastro.lerStr("Informe a data de nascimento do morador: ");
		morador.setNascimento(nascimento);
		sexo = Cadastro.lerStr("Informe o sexo do morador: ");
		morador.setSexo(sexo);
		bloco = Cadastro.lerStr("Informe o bloco do morador: ");
		morador.setBloco(bloco);
		apartamento = Cadastro.lerStr("Informe o apartamento do morador: ");
		morador.setApartamento(apartamento);
		codigoDeAcesso = Cadastro.lerInt("Informe o codigo de acesso do morador: ");
		morador.setCodigoDeAcesso(codigoDeAcesso);
		return morador;
	}
	
	private static String lerStr(String parametro) {
		Scanner sc = new Scanner(System.in);
		String par;
		System.out.println(parametro);
		par = sc.nextLine();
		return par;
	}
	
	private static int lerInt(String parametro) {
		Scanner sc = new Scanner(System.in);
		int par;
		System.out.println(parametro);
		par = sc.nextInt();
		return par;
	}
}
