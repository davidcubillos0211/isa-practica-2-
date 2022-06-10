package microwave;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Estado_ClosedWithNoItemTest {
	 private Microwave micro;
	@BeforeEach	
	void inicialize_cn() {
		micro = new Microwave();
	}

	
	
	@Test
	void door_opened() {
		micro.door_opened();
		assert(micro.doorOpen);
		assertEquals("OpenWithNoItem",micro.estado.fase());
		
	}
	
	@Test
	void afrer_build() {
		// para un microondas cerrado se deberia cumplir que :
		
		
		assertEquals("ClosedWithNoItem",micro.getEstado().fase());
		
		assert(!micro.isDoorOpen() );
		assert( !micro.getCalor().isHeating() );
		assert( !micro.isWithItem() );
		assert( !micro.getGira().isMoving() );
		assert( !micro.getLampara().isLampOn());
		assert(!micro.isCooking());
	}
	
	
	
	
	

}
