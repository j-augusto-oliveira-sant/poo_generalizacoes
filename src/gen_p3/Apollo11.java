package gen_p3;

public class Apollo11 extends NaveEspacial{
	private String tipoCombustivel;
	Apollo11(double velocidadeMaxima,String tipoCombustivel) {
		super(velocidadeMaxima);
		this.setTipoCombustivel(tipoCombustivel);
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"Apollo11 [tipoCombustivel=" + tipoCombustivel + "]";
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	

}
