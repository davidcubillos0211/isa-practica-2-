package microwave;

public class Estado_Cooking extends Estado_Microondas {
	
	public Estado_Cooking() {
		fase= state.Cooking;
	}
	@Override
	protected Microwave door_opened(Microwave m) {
		m.doorOpen=true;
		m=m.estado.cooking_stop(m);
		m.estado= new Estado_OpenWithItem();
		return m;
	}
	/*
	 * en cooking stop paramos todo los procesos asociados a cocinar el alimento, 
	 * de forma que se pude reusar por otras funciones para parar de cocinar.
	 */
	@Override
	protected Microwave cooking_stop(Microwave m ) {
		m.estado= new Estado_ClosedWithItem();
		m.calor.heating_off();
		m.gira.turntable_stop();
		m.lampara.lamp_off();
		m.pantalla.clearDisplay();
		m.cooking= false;
		
		return m;
	}
	@Override
	protected Microwave timer_dec(Microwave m) {
		if (m.timer>0) {
			if (m.timer==1) {
				m= m.estado.cooking_stop(m);
			}else {
				m.pantalla.setDisplay(String.valueOf(m.timer-1));

			}
			m.timer-=1;
		}
		return m;
	}
	@Override
	protected Microwave timer_reset(Microwave m) {
		m.timer=0;
		m.estado.cooking_stop(m);
		return m;
	}
	@Override
	protected Microwave tick(Microwave m) {
		m= timer_dec(m);
		 if (m.estado instanceof Estado_ClosedWithItem ) {
			 m.alarma.beep(2);
			 m.pantalla.setDisplay("Tiempo finalizado \n");
		 }else {
			 m.pantalla.setDisplay(String.valueOf(m.timer));
		 }
		return m;
	}
	@Override
	protected Microwave power_dec(Microwave m) {
		if (m.power>0) {
			if (m.power==1) {
				//cambia el estado a no cocinando 
				m.estado.cooking_stop(m);
			}
			m.power-=1;
		}
		return m;
	}
	@Override
	protected Microwave power_reset(Microwave m) {
		m.power=0;
		m.estado.cooking_stop(m);
		return m;
	}
	@Override
	protected Microwave setTimer(Microwave m,int i) {
		
		if (i==0) {
			m=this.timer_reset(m);
		}
		m.timer=i;
		m.estado.cooking_stop(m);
		return m;
	}
}
