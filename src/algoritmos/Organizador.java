package algoritmos;
import java.util.Scanner; 

public class Organizador {
	
	public static void menu(int opcao) {
		
		
		System.out.println(" ----- SISTEMA DE ORGANIZAÇÃO DE ARQUIVO -----");
		System.out.println("1. Diretório");
		System.out.println("2. Organizar");
		System.out.println("0. Sair do Sistema");
	}
	
	
	public static void main(String[] args) {
		int opcao; 
		Diretorio diretorio = new Diretorio(); //Importando a classe diretorio para ler os arquivos
		Scanner inputUsuario = new Scanner(System.in); 
		System.out.println("Qual é o diretório que você deseja organizar? \n");
		
		String caminhoDiretorio = inputUsuario.nextLine();
		System.out.println("Aqui está o caminho que será feita a organização: " + caminhoDiretorio.trim());
		
		System.out.println("Qual é a opção que você escolhe?\n");
		opcao = inputUsuario.nextInt();
		
		switch (opcao) {
		case 1:
			diretorio.listarDiretorio(caminhoDiretorio);
			break;
		
		case 2:
			
			break;
		
		case 0:
			
			break;

		default:
			break;
		}
		

	}

}
