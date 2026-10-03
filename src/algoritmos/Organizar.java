package algoritmos;

import java.nio.file.*;
import java.io.IOException;
import java.util.stream.*;
import java.nio.file.Files;

public class Organizar {

	
	public static void criarSubpastas(String caminho) {
		Diretorio.listarDiretorio(caminho);
		
		Path caminhoDigitado = Paths.get(caminho);
		
		try(Stream<Path> listaDeFicheiro = Files.list(caminhoDigitado)){
			
			listaDeFicheiro.forEach(ficheiro -> {
				String arquivoCompleto = ficheiro.getFileName().toString();
				System.out.println("Arquivos listados: " + arquivoCompleto); 
				
				int pontoParaExtensao = arquivoCompleto.lastIndexOf("."); //Retorna onde tem o ponto que separa para a extensao
				String extensao; 
				
				if(pontoParaExtensao > 0) {
					extensao = arquivoCompleto.substring(pontoParaExtensao + 1);
					
				} else {
					System.out.println("Sem extensão");
				}
				
				System.out.println("Extensão: " + extensao);
				
				try {
					Path pastaPorExtensao = caminhoDigitado.resolve(extensao);
					Files.createDirectories(pastaPorExtensao);
					System.out.println("Pasta criada: " + pastaPorExtensao);
				} catch(IOException e) {
					System.out.println("Erro ao criar pasta: " + e.getMessage()); 
				
				}
	
			});	
			

		}
		
		catch(IOException e) {
			System.out.println("Problema ao realizar a criação de subpastas: ");
		}
		
	}
	
	
	public static void moverArquivos() {
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		

	}

}
