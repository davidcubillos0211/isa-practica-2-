package microwave;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Estado_OpenWithItemTest {
	private Microwave m;
	 
	@BeforeEach	
	void inicialize_oi() {
	
     m = new Microwave();
     m.door_opened();;
     m.item_placed();
	}
	
	@Test
	void item_removed() {
		m.item_removed();
		assert(!m.isWithItem());
		assertEquals("OpenWithNoItem",m.getEstado().fase());
		
	}
	@Test
	void door_close() {
		m.door_closed();
		assert(!m.isDoorOpen());
		assertEquals("ClosedWithItem",m.getEstado().fase());
		
	}
	
	@Test
	
	void Estado_OpenWithItemTest() {
		assertEquals("OpenWithItem",m.getEstado().fase());
		assert(m.isDoorOpen() );
		assert( !m.getCalor().isHeating() );
		assert( m.isWithItem() );
		assert(!m.getGira().isMoving() );
		assert( m.getLampara().isLampOn());
		assert(!m.isCooking());
		
	}
	@Test
	void OpenWithItemTest() {
		assertEquals("OpenWithItem",m.getEstado().fase());
		assert(m.isDoorOpen() );
		assert( !m.getCalor().isHeating() );
		assert( m.isWithItem() );
		assert( !m.getGira().isMoving() );
		assert( m.getLampara().isLampOn());
		assert(!m.isCooking());
	}

}
