package arvores;

public class Jardim {
	private int largura;
	private int profundidade;
	private int[][] espacos;
	private int quantidadeDeArvores;
	
	public Jardim (int largura, int profundidade) {
		if (!validaDimensoes(largura, profundidade)) {
			throw new IllegalArgumentException("Os valores das dimensões devem serem positivos.");
		}
		this.largura = largura;
		this.profundidade = profundidade;
		this.espacos = new int [largura][profundidade];
		for (int i = 0; i < this.largura; i++) {
			for (int j = 0; j < this.profundidade; j++) {
				espacos[i][j] = 0;
			}
		}
	}
	
	public boolean validaDimensoes(int largura, int profundidade) {
		return (largura > 0 && profundidade > 0);
	}
	
	public void plantaArvore(int coordX, int coordY) {
		try {
			if (!coordenadasValidas(coordX, coordY)) {
				throw new IllegalArgumentException("Espaço fora dos limites, escolha outro.");
			}
			if (espacoOcupado(coordX, coordY)) {
				throw new IllegalArgumentException("Espaço ocupado, escolha outro.");
			}
			else {
				espacos[coordX][coordY] = 1;
				this.quantidadeDeArvores++;
			}
		}
		catch (IllegalArgumentException e) {
            System.err.println(e.getLocalizedMessage());
		}
	}
	
	public void removeArvore(int coordX, int coordY) {
		try {
			if (!coordenadasValidas(coordX, coordY)) {
				throw new IllegalArgumentException("Espaço fora dos limites, escolha outro.");
			}
			if (!espacoOcupado(coordX, coordY)) {
				throw new IllegalArgumentException("Escolha um espaço onde há uma árvore.");
			}
			else {
				espacos[coordX][coordY] = 0;
				this.quantidadeDeArvores--;
			}
		}
		catch (IllegalArgumentException e) {
            System.err.println(e.getLocalizedMessage());
		}
	}
	
	public boolean coordenadasValidas (int coordX, int coordY) {
		boolean ehPositivo = coordX >= 0 && coordY >= 0;
		boolean ehDentroDosLimites = coordX < this.largura && coordY < this.profundidade && coordX >= 0  && coordY >= 0;
		return (ehPositivo && ehDentroDosLimites);
	}
	
	public boolean espacoOcupado(int coordX, int coordY) {
		return espacos[coordX][coordY] == 1;
	}
	
	public int getQuantidadeArvores() {
		return this.quantidadeDeArvores;
	}
	
	public void printaJardim() {
		for (int i = 0; i < this.largura; i++) {
			for (int j = 0; j < this.profundidade; j++) {
				if (espacoOcupado(i, j)) {
					System.out.print("[x]");
				}
				else {
					System.out.print("[ ]");
				}
			}
			System.out.println("");
		}
	}
	
}
