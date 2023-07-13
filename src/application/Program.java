package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		
		String[] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite" };
		String path = "G:\\workspace\\eclipse\\java\\criado.txt";
		
		/*
		 * Escreve o texto e cria o arquivo caso ele não exista.
		 */
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
