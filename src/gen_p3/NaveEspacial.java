package gen_p3;

public class NaveEspacial {
	private double velocidadeMaxima;
	
	NaveEspacial(double velocidadeMaxima){
		this.setVelocidadeMaxima(velocidadeMaxima);
	}
	
	@Override
	public String toString() {
		return "NaveEspacial [velocidadeMaxima=" + velocidadeMaxima + "]";
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
}
