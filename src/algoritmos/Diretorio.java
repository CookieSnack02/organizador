package algoritmos;

import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.stream.Stream;

public class Diretorio {
	
	
	public static void listarDiretorio(String caminho) {
		Path caminhoDigitado = Paths.get(caminho); //Path e uma interface dentro do Java para representar o caminho no sistema operacional || Paths e a classe auxiliar que converte texto em objeto do tipo path
		
		try(Stream<Path> listaDeFicheiro = Files.list(caminhoDigitado)){
			
			listaDeFicheiro.forEach(ficheiro -> { System.out.println("Arquivo listado: " + ficheiro.getFileName());
			});
		}
		
		catch(IOException e) {
			System.out.println("Erro: Não foi possível ler o diretório");
		}
	}

	public static void main(String[] args) {
		
		listarDiretorio(null);

	}

}
