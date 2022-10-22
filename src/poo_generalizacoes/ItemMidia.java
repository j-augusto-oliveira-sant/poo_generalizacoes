package poo_generalizacoes;

public class ItemMidia extends Item {
	private String gravadora;
	private float duracao;
	ItemMidia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		this.gravadora = gravadora;
		this.duracao = duracao;
	}
	@Override
	public String toString() {
		return super.toString()+" "+"ItemMidia [gravadora=" + gravadora + ", duracao=" + duracao + "]";
	}
	
}
