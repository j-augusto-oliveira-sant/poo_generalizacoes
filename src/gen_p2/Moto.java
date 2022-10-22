package gen_p2;

public class Moto extends Veiculo {
	private int cilindradas;
	
	Moto(boolean motor,int cilindradas) {
		super(motor);
		this.setCilindradas(cilindradas);
	}
	
	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + "]";
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	

	
}
