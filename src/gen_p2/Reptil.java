package gen_p2;

public class Reptil extends Animal {
	private boolean escamas;
	
	Reptil(String nome,boolean escamas) {
		super(nome);
		this.setEscamas(escamas);
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"Reptil [escamas=" + escamas + "]";
	}

	public boolean isEscamas() {
		return escamas;
	}

	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}

}
