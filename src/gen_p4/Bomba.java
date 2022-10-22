package gen_p4;

public class Bomba {
	private double totalLitros;
	private float valorLitro;
	Bomba(double totalLitros,float valorLitro){
		this.setTotalLitros(totalLitros);
		this.setValorLitro(valorLitro);
	}
	
	public boolean abastecerPorLitro(int litros) {
		this.totalLitros += litros;
		return true;
	}
	public boolean abastecerPorLitro(double valor) {
		double litros = valorLitro*valor;
		this.totalLitros += litros;
		return true;
	}
	@Override
	public String toString() {
		return "Bomba [totalLitros=" + totalLitros + ", valorLitro=" + valorLitro + "]";
	}

	public double getTotalLitros() {
		return totalLitros;
	}
	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
}
