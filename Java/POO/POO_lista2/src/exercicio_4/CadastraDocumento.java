package exercicio_4;

import java.util.Scanner;

public class CadastraDocumento {    
    public static void main(String args[]) {
        FabricaDocumentos factory = new FabricaDocumentos();
        String remetente = lerString("Informe o nome do Remetente");
        String numero = lerString("Informe o número do documento");
        String tipo = lerString("Informe o tipo de documento");
        Documento documento = factory.criaDocumento(remetente, tipo, numero);
        abrirDocumento(documento);
    }
    public static String lerString(String txt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(txt);
		String texto = sc.nextLine();
		return texto;
	}
    public static void abrirDocumento(Documento documento) {
    	System.out.println(documento.remetente +"\n"+ documento.numero);
    }
 }
