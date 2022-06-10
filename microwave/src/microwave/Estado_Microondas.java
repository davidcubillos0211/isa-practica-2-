package microwave;

public abstract class Estado_Microondas {

	protected enum state{OpenWithNoItem,ClosedWithNoItem,
		OpenWithItem,ClosedWithItem,Cooking}
	state fase;

	protected Microwave door_closed (Microwave m) {

		return m;
	}
	protected Microwave door_opened(Microwave m) {

		return m;
	}
	protected Microwave item_placed (Microwave m) {

		return m;
	}
	protected Microwave item_removed(Microwave m) {
		return m;
	}
	protected Microwave power_inc(Microwave m) {
		if (!(m.power>4)) {
			m.power+=1;
		}
		return m;
	}
	protected Microwave power_dec(Microwave m) {
		if (m.power>0) {
			m.power-=1;
		}
		return m;
	}
	protected Microwave power_reset(Microwave m) {
		m.power=0;
		return m;
	}	
	protected Microwave timer_inc(Microwave m) {
		if(!(m.timer>299)) {
			m.timer+=1;
		}
		return m;
	}
	protected Microwave timer_dec(Microwave m) {
		if(m.timer>0) {
			m.timer+=1;
		}
		return m;
	}
	protected Microwave timer_reset(Microwave m) {
		m.timer=0;
		return m;
	}
	protected Microwave cooking_start(Microwave m) {
		return m;
	}
	protected Microwave cooking_stop(Microwave m) {		
		return m;
	}
	protected Microwave tick(Microwave m) {
		return m;
	}
	protected Microwave setTimer(Microwave m,int i) {
		m.timer=i;
		return m;
	}	
	public String fase() {

		return this.fase.toString();
	}




	
	
	


	


}
