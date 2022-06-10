package microwave;

public class Heating {
	private boolean heating ; 
	private int power;
	public Heating () {
		this.heating= false;
		this.power=0;
	} 
	protected void heating_on() {
		this.heating=true;
	}
	protected void heating_off() {
		this.heating=false;

	}
	protected void SetPower(int a) {
		this.power=a;
	}
	protected Boolean isHeating() {
		return this.heating;
	}
	protected int getPower() {
		return this.power;
	}

}
