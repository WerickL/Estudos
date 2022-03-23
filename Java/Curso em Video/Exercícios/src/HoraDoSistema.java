// Aqui fica  o nome do pacote que inclui essa classe (se não tiver nome significa que o pacote é default)
import java.util.Date;
// Importando uma classe (primeira letra maiúscula)

public class HoraDoSistema {
// Cabeçalho da classe (classe pública)
	public static void main(String[] args) {
	// Método principal da classe	
		Date relogio = new Date();
		// Nome da Classe + nome da variável = new(sgnifica que é um  novo objeto) + Classe
		System.out.print("A Data atual é: ");
		System.out.println(relogio.toString());
		// Objeto relógio tranformado em string através do método .toString()
	}

}
