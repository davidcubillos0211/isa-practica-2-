package microwave;

public class Estado_ClosedWithItem extends Estado_Microondas {
	protected Estado_ClosedWithItem() {
		fase= state.ClosedWithItem;
	}
	@Override
	protected Microwave cooking_start(Microwave m) {
		if (m.timer>0 && m.power>0) {
			m.cooking= true; 
			m.estado= new Estado_Cooking();
			m.calor.heating_on();
			m.gira.turntable_start();
			m.lampara.lamp_on();
			m.pantalla.setDisplay(String.valueOf(m.timer));
		}	
		return m;
	}
	@Override
	protected Microwave door_opened(Microwave m) {
		m.doorOpen= true; 
		m.estado= new Estado_OpenWithItem();
		m.lampara.lamp_on();
		return m;
	}
	
	
}
