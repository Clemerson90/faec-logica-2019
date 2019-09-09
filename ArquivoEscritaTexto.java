/**
 * 
 */
package br.com.faec;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoEscritaTexto {
	
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter out = null;
		try {
			fw = new FileWriter("dadoscurso.txt");
			out = new BufferedWriter(fw);
			out.write("Curso Aplicações Linguagem Java\n");
			out.write("60 Horas\n");
			out.write("Período noturno");
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}