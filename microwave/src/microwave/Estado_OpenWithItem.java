package microwave;

import microwave.Estado_Microondas.state;

public class Estado_OpenWithItem extends Estado_Microondas {
	protected Estado_OpenWithItem () {
		fase= state.OpenWithItem;
	}
	@Override
	protected Microwave item_removed(Microwave m) {
		m.estado= new Estado_OpenWithNoItem();
		m.withItem= false;
		return m;
	}
	@Override
	protected Microwave door_closed (Microwave m) {
		m.doorOpen= false; 
		m.lampara.lamp_off();
		m.estado= new Estado_ClosedWithItem();
		return m;
	}
	

}
