package poo_generalizacoes;

public class ContaEspecial extends Conta {
	private int diasSemJuros;
	private double limite;
	
	ContaEspecial(String banco, int agencia, int numeroconta, double saldo,int diasSemJuros,double limite) {
		super(banco, agencia, numeroconta, saldo);
		this.diasSemJuros = diasSemJuros;
		this.limite = limite;
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return super.toString()+" "+"ContaEspecial [diasSemJuros=" + diasSemJuros + ", limite=" + limite + "]";
	}
	
	
	
	

}
