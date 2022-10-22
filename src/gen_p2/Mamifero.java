package gen_p2;

public class Mamifero extends Animal {
	private String cor_pelugem;
	
	Mamifero(String nome,String cor_pelugem) {
		super(nome);
		this.setCor_pelugem(cor_pelugem);
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"Mamifero [cor_pelugem=" + cor_pelugem + "]";
	}

	public String getCor_pelugem() {
		return cor_pelugem;
	}

	public void setCor_pelugem(String cor_pelugem) {
		this.cor_pelugem = cor_pelugem;
	}
	
	
	
}
