package Projeto_1_Parte_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	public static void escreverTexto(String pCaminhoArquivo, String pTextoescreverarquivo) {
		try(
			FileWriter criadordeArquivos = new FileWriter(pCaminhoArquivo, true);
			BufferedWriter buffer = new BufferedWriter(criadordeArquivos);
			PrintWriter escritordearquivo = new PrintWriter(buffer);
				){
			escritordearquivo.append(pTextoescreverarquivo);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
