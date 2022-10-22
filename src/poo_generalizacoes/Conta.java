package poo_generalizacoes;

public class Conta {
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	
	Conta(String banco,int agencia,int numeroconta,double saldo){
		this.setBanco(banco);
		this.setAgencia(agencia);
		this.setNumeroconta(numeroconta);
		this.setSaldo(saldo);
	}
	
	public boolean deposito(double valor) {
		this.saldo += valor;
		return true;
	}
	
	public boolean saque(double valor) {
		this.saldo -= valor;
		return true;
	}

	@Override
	public String toString() {
		return "Conta [banco=" + banco + ", agencia=" + agencia + ", numeroconta=" + numeroconta + ", saldo=" + saldo
				+ "]";
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
