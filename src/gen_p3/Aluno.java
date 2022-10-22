package gen_p3;

public class Aluno extends Pessoa {
	private int matricula;
	Aluno(int codigo, String nome, String endereco,int matricula) {
		super(codigo, nome, endereco);
		this.setMatricula(matricula);
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" "+"Aluno [matricula=" + matricula + "]";
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
