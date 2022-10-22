package gen_p3;

public class Quarto extends Ambiente {
	private int capacidade;
	Quarto(float area,int capacidade) {
		super(area);
		this.setCapacidade(capacidade);
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"Quarto [capacidade=" + capacidade + "]";
	}

	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	

}
