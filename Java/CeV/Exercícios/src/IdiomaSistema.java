import java.util.Locale;
public class IdiomaSistema {
	public static void main(String[] args) {
		// Criei uma vari�vel, recebendo o Lcal defaul do java nessa m�quina
		Locale locale = Locale.getDefault();
		// Criei outra vari�vel recebendo linguagem do local da classe string
		String idioma = locale.getDisplayLanguage();
		System.out.print("O idoma local �: ");
		System.out.println(idioma);
	}
	
}
// Encontrei a Classe Locale na documenta��o do Java
// Encontrei o m�todo getDisplayLanguage na documenta��o
// N�o consegui obter o idioma sozinho com o m�todo
// Consegui ao obter na net a linha de c�digo String lang = locale.getDisplayLanguage();
// Eu n�o conhecia a declara��o de string