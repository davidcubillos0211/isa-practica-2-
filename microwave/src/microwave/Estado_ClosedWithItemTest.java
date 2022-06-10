package microwave;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Estado_ClosedWithItemTest {
	private Microwave m;
	@BeforeEach	
	void inicialize_ci() {
     m = new Microwave();
     m.door_opened();;
     m.item_placed();
     m.door_closed();
	}
	@Test
	void door_opened() {
		m.door_opened();
		assert(m.isDoorOpen());
		assertEquals ("OpenWithItem", m.getEstado().fase.toString());
	}
	@Test
	void cooking_start() {
		m.cooking_start();
		assert(!m.isCooking());
		m.setTimer(3);
		m.power_inc();
		m.power_inc();
		m.power_inc();
		assert(m.getTimer()>0);
		assert(m.getPower()>0);
		m.cooking_start();
		assert(m.isCooking());
		try {
				int a =Integer.parseInt(m.getPantalla().getDisplay());
		}
		catch (NumberFormatException nfe) {			
				fail();// asi nos aseguramos de que esta imprimiendo el numero de segundos restantes en la pantalla
		}
		assertEquals ("Cooking", m.getEstado().fase.toString());	
	}
	@Test
	void ClosedWithItemTest() {
		assertEquals("ClosedWithItem",m.getEstado().fase());
		assert(!m.isDoorOpen() );
		assert( !m.getCalor().isHeating() );
		assert( m.isWithItem() );
		assert( !m.getGira().isMoving() );
		assert( !m.getLampara().isLampOn());
		assert(	!m.isCooking());
	}
}
