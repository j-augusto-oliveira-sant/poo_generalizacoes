package poo_generalizacoes;

public class ContaSimples extends Conta {
	private double saldoPoupanca;
	ContaSimples(String banco, int agencia, int numeroconta, double saldo,double saldoPoupanca) {
		super(banco, agencia, numeroconta, saldo);
		this.setSaldoPoupanca(saldoPoupanca);
	}
	
	public boolean depositoPoupanca(double valor) {
		this.saldoPoupanca += valor;
		return true;
	}
	
	public boolean saquePoupanca(double valor) {
		this.saldoPoupanca -= valor;
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"ContaSimples [saldoPoupanca=" + saldoPoupanca + "]";
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

}
