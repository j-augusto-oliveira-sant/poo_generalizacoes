package poo_generalizacoes;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String estado_civil;
	PessoaFisica(String nome, String endereco, String cpf,String estado_civil) {
		super(nome, endereco);
		this.setCpf(cpf);
		this.setEstado_civil(estado_civil);
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"PessoaFisica [cpf=" + cpf + ", estado_civil=" + estado_civil + "]";
	}
}
