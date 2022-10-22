package poo_generalizacoes;

public class VHS extends ItemMidia {
	private String titulo;

	VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		this.setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return super.toString()+" "+"VHS [titulo=" + titulo + "]";
	}
	
	

}
