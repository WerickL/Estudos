package exercicio_3;

public class Cliente extends Pessoa {
	public Cliente(String nome, String cpf, String telefone) {
		super(nome, cpf);
		this.telefone = telefone;
	}
	protected String telefone;
	@Override
	public String toString() {
		return "Cliente: ["+this.nome+", telefone=" + telefone+"]" ;
	}
	
	
}
