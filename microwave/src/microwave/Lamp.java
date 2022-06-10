package microwave;

public class Lamp {
	
	private boolean lampOn; 
	public Lamp () {
		this.lampOn= false;
	}
	public void lamp_on() {
		this.lampOn= true;
		
	}
	public void lamp_off() {
		this.lampOn= false;
		
	}
	public boolean isLampOn(){
		return this.lampOn;
	}
	

}
