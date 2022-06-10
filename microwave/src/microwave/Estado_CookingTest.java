package microwave;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Estado_CookingTest {
	private Microwave m;

	@BeforeEach	
	void inicialize_cooking() {
	
     m = new Microwave();
     m.door_opened();;
     m.item_placed();
     m.door_closed();
     m.setTimer(300);
     m.power_inc();
     m.power_inc();
     m.power_inc();
     m.power_inc();
     m.power_inc();
     m.power_inc();
     m.power_inc();
     m.power_inc();
     m.power_inc();
     m.power_inc();
     m.power_inc();
     m.cooking_start();
     this.cooking();
	}
	@Test
	void door_opened() {
		m.door_opened();
		assert(m.isDoorOpen());
		
		assertEquals("OpenWithItem",m.getEstado().fase());
		
	}
	
	@Test
	void cooking_stop() {
		m.cooking_stop();
		assert(!m.isDoorOpen() );
		assert(!m.getCalor().isHeating() );
		assert( m.isWithItem() );
		assert(!m.getGira().isMoving() );
		assert(!m.getLampara().isLampOn());
		assert(!m.isCooking());
		assertEquals("ClosedWithItem",m.getEstado().fase());
		try {
				int a =Integer.parseInt(m.getPantalla().getDisplay());
				fail();
		}
		catch (NumberFormatException nfe) {			
				
			assert(true);
		}
	}
	@Test
	void timer_dec() {
		int tempPrv= m.getTimer();
		m.timer_dec();
		assertEquals(tempPrv, m.getTimer()+1);
		try {
			int a =Integer.parseInt(m.getPantalla().getDisplay());
			assertEquals(tempPrv-1, a);// vemos que la pantalla muestra un segundo menos.
		}
		catch (NumberFormatException nfe) {			
			fail();// asi nos aseguramos de que esta imprimiendo el numero de segundos restantes en la pantalla
		}
		
		m.setTimer(1);
		m.timer_dec();
		assertEquals("ClosedWithItem",m.getEstado().fase());
		// al ifual que en la propia implementacion, se ha reusado el codigo de 
		// dejar de cocinar para cada accion que la invoca.
		this.cooking_stop();
		
		
		
	}	
	@Test
	void timer_reset() {
		 m.timer_reset();
		 assertEquals(0,m.getTimer());
		 this.cooking_stop();
	}
	@Test
	void power_dec() {
		assertEquals(5,m.getPower());// comprobamos que power sea como maximo 5, por ejemplo
		m.power_dec();
		assertEquals(4, m.getPower());
		m.power_dec();
		assertEquals(3, m.getPower());
		m.power_dec();
		m.power_dec();
		assertEquals(1, m.getPower());
		m.power_dec();
		assertEquals(0, m.getPower());
		this.cooking_stop();
	}
	
	@Test
	void power_reset() {
		 m.power_reset();
		 assertEquals(0,m.getPower());
		 this.cooking_stop();
	}

	@Test
	void cooking() {
		// para un microondas cerrado se deberia cumplir que :
		
		
		assertEquals("Cooking",m.getEstado().fase());
		
		assert(!m.isDoorOpen() );
		assert( m.getCalor().isHeating() );
		assert( m.isWithItem() );
		assert( m.getGira().isMoving() );
		assert( m.getLampara().isLampOn());
		assert( m.isCooking());
	}
	@Test
	void setTimer() {
		m.setTimer(3);
		assertEquals(3, m.timer);
	
	}
	@Test
	void Cooking() {
		assertEquals("Cooking",m.getEstado().fase());
		assert(!m.isDoorOpen() );
		assert( m.getCalor().isHeating() );
		assert( m.isWithItem() );
		assert( m.getGira().isMoving() );
		assert( m.getLampara().isLampOn());
		assert(	m.isCooking());
	}
	
}
