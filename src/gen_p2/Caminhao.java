package gen_p2;

public class Caminhao extends Veiculo {
	private int eixos;
	Caminhao(boolean motor,int eixos) {
		super(motor);
		this.setEixos(eixos);
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+"Caminhao [eixos=" + eixos + "]";
	}

	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}	
	
	
}
