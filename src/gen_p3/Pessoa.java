package gen_p3;

public class Pessoa {
	private int codigo;
	private String nome;
	private String endereco;
	
	Pessoa(int codigo,String nome,String endereco){
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setEndereco(endereco);
	}
	
	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
