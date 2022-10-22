package gen_p3;

public class Sala extends Ambiente {
	private boolean tv;
	Sala(float area,boolean tv) {
		super(area);
		this.setTv(tv);
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+" "+"Sala [tv=" + tv + "]";
	}



	public boolean isTv() {
		return tv;
	}
	public void setTv(boolean tv) {
		this.tv = tv;
	}
	
	

}
