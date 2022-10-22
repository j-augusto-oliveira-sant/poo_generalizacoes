package gen_p3;

public class Cozinha extends Ambiente {
	private boolean microondas;
	Cozinha(float area,boolean microondas) {
		super(area);
		this.setMicroondas(microondas);
	}
	
	@Override
	public String toString() {
		return "Cozinha [microondas=" + microondas + "]";
	}

	public boolean isMicroondas() {
		return microondas;
	}
	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}
	

}
