package gen_p2;

public class Veiculo {
	private boolean motor;
	Veiculo(boolean motor){
		this.setMotor(motor);
	}
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Veiculo [motor=" + motor + "]";
	}
	
}
