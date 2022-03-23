package exercicio_2;

public abstract class Loja {
	private int id;
	private static int lot = 0;//parâmetro criado para auxiliar em uma identificação automática
	private String cnpj;
	private String razao_social;
	private boolean aberta;
	
	public Loja(String cnpj, String razao_social) {
		this.cnpj = cnpj;
		this.razao_social = razao_social;
		this.setAberta(false);
		lot++;//a cada instância o número de identificação muda
		this.id = lot;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String isAberta() {
		if(this.aberta == true) {
			return "Aberta";
		}
		else {
			return "Fechada";
		}
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public int getId() {
		return id;
	}

}
