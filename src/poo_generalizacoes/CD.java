package poo_generalizacoes;

public class CD extends ItemMidia {
	private int faixas;
	private String artista;
	private String album;
	CD(int codigo, String descricao, String gravadora, float duracao,int faixas,String artista,String album) {
		super(codigo, descricao, gravadora, duracao);
		this.setAlbum(album);
		this.setArtista(artista);
		this.setFaixas(faixas);
	}
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return super.toString()+" "+"CD [faixas=" + faixas + ", artista=" + artista + ", album=" + album + "]";
	}
	
	
	

}
