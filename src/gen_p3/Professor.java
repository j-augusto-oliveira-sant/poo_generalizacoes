package gen_p3;

public class Professor extends Pessoa {
	private String disciplina;
	Professor(int codigo, String nome, String endereco,String disciplina) {
		super(codigo, nome, endereco);
		this.setDisciplina(disciplina);
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"Professor [disciplina=" + disciplina + "]";
	}

	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
