// Aqui fica  o nome do pacote que inclui essa classe (se n�o tiver nome significa que o pacote � default)
import java.util.Date;
// Importando uma classe (primeira letra mai�scula)

public class HoraDoSistema {
// Cabe�alho da classe (classe p�blica)
	public static void main(String[] args) {
	// M�todo principal da classe	
		Date relogio = new Date();
		// Nome da Classe + nome da vari�vel = new(sgnifica que � um  novo objeto) + Classe
		System.out.print("A Data atual �: ");
		System.out.println(relogio.toString());
		// Objeto rel�gio tranformado em string atrav�s do m�todo .toString()
	}

}
