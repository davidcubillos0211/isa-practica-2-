package microwave;

public class Turntable {
	private boolean turntableOn;
	public Turntable () {
	this.turntableOn=false;	
	}
	
	public boolean isMoving() {
		return turntableOn;
	}

	public void turntable_start() {
		this.turntableOn = true;
	}
	public void turntable_stop() {
		this.turntableOn = false;
	}
	

}
