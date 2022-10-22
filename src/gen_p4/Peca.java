package gen_p4;

public class Peca {
	private int linha;
	private int coluna;
	private boolean cor;
	private int movimentos;
	
	Peca(int linha,int coluna,boolean cor,int movimentos){
		this.setLinha(linha);
		this.setColuna(coluna);
		this.setCor(cor);
		this.setMovimentos(movimentos);
	}
	

	@Override
	public String toString() {
		return "Peca [linha=" + linha + ", coluna=" + coluna + ", cor=" + cor + ", movimentos=" + movimentos + "]";
	}


	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public boolean isCor() {
		return cor;
	}

	public void setCor(boolean cor) {
		this.cor = cor;
	}

	public int getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(int movimentos) {
		this.movimentos = movimentos;
	}
}
