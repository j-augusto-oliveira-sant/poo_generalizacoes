package gen_p2;

public class Animal {
	private String nome;
	
	Animal(String nome){
		this.setNome(nome);
	}
	
	public boolean respira() {
		return true;
	}
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + "]";
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
