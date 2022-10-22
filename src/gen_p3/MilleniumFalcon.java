package gen_p3;

public class MilleniumFalcon extends Apollo11{
	
	private class HiperPropulsor{
		private float motor() {
			return 3.32324f;
		}
	}
	
	MilleniumFalcon(double velocidadeMaxima, String tipoCombustivel) {
		super(velocidadeMaxima, tipoCombustivel);
		// TODO Auto-generated constructor stub
	}
	
	public float ligar_motor() {
		HiperPropulsor h = new HiperPropulsor();
		return h.motor();
	}

}
