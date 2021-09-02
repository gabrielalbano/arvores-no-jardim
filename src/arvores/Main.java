package arvores;

import java.util.Scanner;

public class Main {
	
	public static void menuOpcoes(Jardim jardim) {
		int coordX;
		int coordY;
		int opcao;
		String input;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Escolha uma das opções:");
			System.out.println("1 - Plantar uma árvore");
			System.out.println("2 - Remover uma árvore");
			System.out.println("3 - Visualizar o jardim.");
			System.out.println("4 - Sair.");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
		switch (opcao) {
			case 1:
				System.out.println("Digite as coordenadas do local: ");
				input = scanner.nextLine();
				coordX = Integer.parseInt(input.split(" ")[0]);
				coordY = Integer.parseInt(input.split(" ")[1]);
				jardim.plantaArvore(coordX, coordY);
				break;
			case 2:
				System.out.println("Digite as coordenadas do local da árvore: ");
				input = scanner.nextLine();
				coordX = Integer.parseInt(input.split(" ")[0]);
				coordY = Integer.parseInt(input.split(" ")[1]);
				jardim.removeArvore(coordX, coordY);
				break;
			case 3:
				jardim.printaJardim();
				break;
			case 4:
				System.out.println("Saindo.");
				break;
			default:
				System.out.println("Insira um valor válido.");
			}
		}while(opcao != 4);
		
		scanner.close();
	}

	public static void main(String[] args) {
		int largura;
		int profundidade;
		Jardim jardim;
		String input;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a largura e a profundidade do jardim.");
		input = scanner.nextLine();
		largura = Integer.parseInt(input.split(" ")[0]);
		profundidade = Integer.parseInt(input.split(" ")[1]);
		
		try {
			jardim = new Jardim(largura, profundidade);	
			menuOpcoes(jardim);
			System.out.println("Total de árvores no jardim: " + jardim.getQuantidadeArvores());
		} catch (IllegalArgumentException e) {
			System.out.println("Não foi possível criar o jardim: " + e.getMessage());
		}
		
		scanner.close();

	}

}
