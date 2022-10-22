package gen_p3;

public class Banheiro extends Ambiente {
	private boolean banheira;
	Banheiro(float area,boolean banheira) {
		super(area);
		this.setBanheira(banheira);
	}
	
	@Override
	public String toString() {
		return super.toString()+"Banheiro [banheira=" + banheira + "]";
	}

	public boolean isBanheira() {
		return banheira;
	}
	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}

}
