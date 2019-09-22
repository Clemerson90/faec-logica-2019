package br.com.faec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivoEscritaTexto {

	public static void main(String[] args) {
		
		FileReader leitura = null;
		BufferedReader in = null;
		
		try {
			leitura = new FileReader("100n50d.txt");
			in = new BufferedReader(leitura);
			
			FileWriter arq = new FileWriter("saida.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			
			String linha = in.readLine();
	
			while (linha != null) {
				System.out.println(linha);
				
				linha = in.readLine();
				
//				gravarArq.write(in);
				
			}
			
		} catch(IOException e) {
			System.err.println("Erro na abertura  do arquivo: \n" + e.getMessage());
		}
		
	}
}