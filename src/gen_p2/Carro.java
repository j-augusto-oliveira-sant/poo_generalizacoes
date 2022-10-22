package gen_p2;

public class Carro extends Veiculo {
	private int portas;
	Carro(boolean motor,int portas) {
		super(motor);
		this.setPortas(portas);
	}
	
	@Override
	public String toString() {
		return "Carro [portas=" + portas + "]";
	}

	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	
	
}
