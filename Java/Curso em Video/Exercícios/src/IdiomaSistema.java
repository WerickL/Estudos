import java.util.Locale;
public class IdiomaSistema {
	public static void main(String[] args) {
		// Criei uma variável, recebendo o Lcal defaul do java nessa máquina
		Locale locale = Locale.getDefault();
		// Criei outra variável recebendo linguagem do local da classe string
		String idioma = locale.getDisplayLanguage();
		System.out.print("O idoma local é: ");
		System.out.println(idioma);
	}
	
}
// Encontrei a Classe Locale na documentação do Java
// Encontrei o método getDisplayLanguage na documentação
// Não consegui obter o idioma sozinho com o método
// Consegui ao obter na net a linha de código String lang = locale.getDisplayLanguage();
// Eu não conhecia a declaração de string