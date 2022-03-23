package exercicio_2;

public class LojaFisica extends Loja implements Registro {
	private String endereco;
	private String gerente;
	
	public LojaFisica(String cnpj, String razao_social, String endereco, String gerente) {
		super(cnpj, razao_social);
		this.endereco = endereco;
		this.gerente = gerente;
	}
	public void mostra_Dados() {
		System.out.println("\nLoja: "+this.getId()+"\nCnpj: "+this.getCnpj()+"\nRazão Social: "+this.getRazao_social()+
				"\nEndereço: "+ this.getEndereco()+"\ngerente: "+this.getGerente()+"\nStatus: "+this.isAberta()+"\n");
	}
	public String getEndereco() {
		return this.endereco;
	}
	public String getGerente() {
		return this.gerente;
	}
	public void registra_Abertura_Dia() {
		if (this.isAberta().intern()=="Aberta") {
			System.out.println("\nA loja já está aberta!");
		}
		else {
			this.setAberta(true);
		}
	}
	public void registra_Fechamento_Dia() {
		if (this.isAberta().intern()=="Fechada") {
			System.out.println("\nA loja já está Fechada!");
		}
		else {
			this.setAberta(false);
		}
	}
}
