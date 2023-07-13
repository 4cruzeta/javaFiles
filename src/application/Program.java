package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/* Objeto File com a variável file instanciando um novo File.
		 * Esse objeto vai encapsular todo o processo de acessar o 
		 * arquivo e também o caminho do arquivo.
		 * O arquivo teste.txt tem duas linhas de texto. Para reproduzir
		 * basta criar o arquivo e alterar a chamada. Ex:
		 * "X:\\lugar\\do\\arquivo.txt" Não esqueça de usar duas 
		 * barras "//" no path.
		 */
		File file = new File("G:\\workspace\\eclipse\\java\\teste.txt");
		Scanner sc = null;
		/*
		 * Leitura de arquivo dentro de bloco try, caso aconteça algum erro.
		 * sc recebe um novo Scanner com o arquivo como argumento.
		 */

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		/*
		 * O fechamento do arquivo vai no bloco finally pra evitar que 
		 * qualquer erro no processo deixe o arquivo aberto.
		 */
		
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
