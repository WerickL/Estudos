package exercicio_1;
import java.io.*;
import java.util.ArrayList;

public class Imposto{
	private static double totalFeminino;
	private static double totalMasculino;
	private static double total;


	public static void main(String[] args)  throws IOException{
		InputStream arq = new FileInputStream("C:\\Users\\NOTEBOOK\\Desktop\\funcionarios.txt");
		InputStreamReader arqbyte= new InputStreamReader(arq);
		BufferedReader dados = new BufferedReader(arqbyte);
		
		String[] campos;
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		int c = 0;
		
		//Leitura do arquivo linha a linha
		String linha = dados.readLine();
		while(linha != null)  {
			campos = linha.split("#");
			funcionarios.add(new Funcionario(campos[0],  campos[1].charAt(0), Double.parseDouble(campos[2]), Integer.parseInt(campos[3])));
			
			linha = dados.readLine();
			c++;
		}
		
		//Soma dos totais
		for(int i = 0; i < funcionarios.size(); i++) {
			total += funcionarios.get(i).impostoRenda();
			if( funcionarios.get(i).getSexo() == "F".charAt(0)) {
				totalFeminino += funcionarios.get(i).impostoRenda();
			}else if( funcionarios.get(i).getSexo() == "M".charAt(0)) {
				totalMasculino += funcionarios.get(i).impostoRenda();
			}
			System.out.println(funcionarios.get(i).mostraFuncionario()+"\n");
		}
		
		System.out.println("Imposto total pago por funcionários do sexo Feminino:\nR$"+totalFeminino+
				"\nImposto total pago por funcionários do sexo Masculino:\nR$"+totalMasculino+
				"\nImposto total pago por funcionários da empresa:\nR$"+total);
	}	
}
