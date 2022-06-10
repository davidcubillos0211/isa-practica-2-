package microwave;

public class Microwave {
	protected boolean doorOpen, cooking , withItem; 
	protected int power, timer; 
	protected Estado_Microondas estado;
	
	protected Heating calor;
	protected Lamp lampara;
	protected Turntable gira;
	protected Beeper alarma;
	protected Display pantalla;
	
	/*
	  * Constructor
	  * Crea un microondas cerrado sin ningun objeto dentro,
	  * la base del sistema.
	  */
	public Microwave () {
		
		this.estado= new Estado_ClosedWithNoItem();
		this.doorOpen= false ;
		this.cooking= false;
		this.withItem= false ;
		this.power= 0; 
		this.timer= 0; 
		this.alarma= new Beeper();
		this.pantalla= new Display();
		this.calor= new Heating();
		calor.heating_off();
		calor.SetPower(0);
		this.lampara=new Lamp();
		this.lampara.lamp_off();
		this.cooking=false; 
		this.doorOpen=false;
		this.gira= new Turntable();
		gira.turntable_stop();
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	public boolean isCooking() {
		return cooking;
	}
	public boolean isWithItem() {
		return withItem;
	}
	public int getPower() {
		return power;
	}
	public int getTimer() {
		return timer;
	}
	public Estado_Microondas getEstado() {
		return estado;
	}
	public Heating getCalor() {
		return calor;
	}
	public Lamp getLampara() {
		return lampara;
	}
	public Turntable getGira() {
		return gira;
	}
	public Beeper getAlarma() {
		return alarma;
	}
	public Display getPantalla() {
		return pantalla;
	}
	private void  Microwave(Microwave m){
		this.estado= m.estado;
		this.doorOpen= m.doorOpen;
		this.cooking= m.cooking;
		this.withItem= m.withItem;
		this.power= m.power; 
		this.timer= m.timer; 
		this.alarma= m.alarma;
		this.calor= m.calor;
		this.cooking=m.cooking;
		this.doorOpen=m.doorOpen;
		this.gira= m.gira;	
		this.lampara=m.lampara;
		this.pantalla= m.pantalla;
	}
	public void door_closed() {
		Microwave(estado.door_closed(this));	
	}
	public void door_opened() {
		this.Microwave(estado.door_opened(this));
	}
	public void item_placed() {
		this.Microwave(estado.item_placed(this));
	}
	public void item_removed() {
		this.Microwave(estado.item_removed(this));
	}
	public void power_inc () {
		if (this.power<5)this.power+=1;
	}
	public void power_dec() {
		if (this.power>0) {this.power-=1;} 
	}
	public void power_reset() {
		if (this.power!=0) {this.power=0;} 
	}
	public void timer_inc() {
		this.Microwave(estado.timer_inc(this));
	}
	public void timer_dec() {
		this.Microwave(estado.timer_dec(this));
	}
	public void timer_reset() {	
		this.Microwave(estado.timer_reset(this));
	}
	public void cooking_start() {
		this.Microwave(estado.cooking_start(this)); 
	}
	public void cooking_stop() {
		this.Microwave(estado.cooking_stop(this)); 	
	}	
	public void tick() {
		this.Microwave(estado.tick(this));
	}
	public void setTimer(int timer) {
		if (timer>=0 && timer <301) {
			this.Microwave(estado.setTimer(this,timer)); 
		} else {
			this.pantalla.setDisplay("Solo valores entre 0 y 300");
		}
		
	}
}
