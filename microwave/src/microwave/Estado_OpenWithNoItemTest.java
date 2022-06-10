package microwave;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Estado_OpenWithNoItemTest {
	 private Microwave m;
	 
		@BeforeEach	
		void inicialize_on() {
		
	     m = new Microwave();
	     m.door_opened();;
		}

	
	@Test
	void door_close() {
		m.door_closed();
		assert(!m.isDoorOpen());
		assertEquals ("ClosedWithNoItem", m.getEstado().fase.toString());
		
	}
	@Test
	void Itemplaced() {
		m.item_placed();
		assert(m.isWithItem());
		assertEquals ("OpenWithItem", m.getEstado().fase.toString());

	}
	
	@Test
	void OpenWithNoItemTest() {
		assertEquals("OpenWithNoItem",m.getEstado().fase());
		assert(m.isDoorOpen() );
		assert( !m.getCalor().isHeating() );
		assert( !m.isWithItem() );
		assert( !m.getGira().isMoving() );
		assert( m.getLampara().isLampOn());
		assert(!m.isCooking());
	}
	

}















