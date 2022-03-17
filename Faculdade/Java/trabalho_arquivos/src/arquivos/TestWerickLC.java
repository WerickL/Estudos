package arquivos;
import java.io.File; 

public class TestWerickLC {
	private static String level = ""; 
	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\NOTEBOOK\\WerickLC");
		System.out.println("O caminho obtido lendo o Gerenciador de arquivos do sistema"
				+ " Operacional(SO) é " + f.getPath());
		System.out.println("Lista todos os subdiretórios e arquivos do diretório "
				+ f.getName() + " lidos direto do gerenciador de arquivos do SO");
		
		showAllDirectory("C:\\Users\\NOTEBOOK\\WerickLC");
	}
	public static void showAllDirectory(String path){
		File dir = new File(path);
		File[] dirs = dir.listFiles(); 
		for (int i = 0; dirs != null && i < dirs.length; i++) {
			File f = dirs[i];
			if (f.isFile()) {
				System.out.println(level + f.getName());
			} 
			else
				if (f.isDirectory()) {
					System.out.println(level + f.getName());
					level += "----";
					showAllDirectory(f.getAbsolutePath());
					level = level.substring(0,
							level.lastIndexOf("----"));
				}
		}
	}
}

