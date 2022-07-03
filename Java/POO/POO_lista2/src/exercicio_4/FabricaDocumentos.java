package exercicio_4;

class FabricaDocumentos extends Fabrica{
	public Documento criaDocumento(String remetente, String tipo, String numero) {
		if (tipo.equals("Carta")) {
			return new Carta(remetente, numero );
       }
       else if (tipo.equals("Telegrama")) {
    	   return new Telegrama(remetente, numero);
       } 
       else if (tipo.equals("Notificação")) {
    	   return new Notificacao(remetente, numero);
       }
       else { 
    	   return new Notificacao(null, null);
       }
    }
       
}