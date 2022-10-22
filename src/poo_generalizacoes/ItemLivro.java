package poo_generalizacoes;

public class ItemLivro extends Item {
	private String autor;
	
	ItemLivro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"ItemLivro [autor=" + autor + "]";
	}
}
