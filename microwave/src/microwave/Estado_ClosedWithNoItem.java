package microwave;

public class Estado_ClosedWithNoItem extends Estado_Microondas {
	  // todas las operaciones basicas de la clase microondas
	public Estado_ClosedWithNoItem () {
		fase= state.ClosedWithNoItem;
		}
	@Override
	public Microwave door_opened (Microwave m) {
		// cambio de estado y cambio de micro
		m.estado= new Estado_OpenWithNoItem();
		m.lampara.lamp_on();
		m.doorOpen= true;
		return m;
	}
}



