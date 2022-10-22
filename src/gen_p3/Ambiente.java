package gen_p3;

public class Ambiente {
	private float area;
	Ambiente(float area){
		this.setArea(area);
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+" "+"Ambiente [area=" + area + "]";
	}



	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	
}
