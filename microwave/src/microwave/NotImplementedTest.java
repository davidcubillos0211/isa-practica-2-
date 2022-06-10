package microwave;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotImplementedTest {
	private Microwave m ;
	// en esta calse se probaran todos aquellos metodos que no se han probado en las demas clases,
	// aquellos metodos que se heredan de la calse padre Estado_Microondas.
	/*
	 * iniciaremos un microonadas en el estado cerrrado con objeto
	 */
	@BeforeEach
	void inicialize_ci() {
	     m = new Microwave();
	     m.door_opened();;
	     m.item_placed();
	     m.door_closed();
		}	
	
	@Test
	void power_inc() {
		m.power_inc();
		assertEquals(1, m.getPower());
		m.power_inc();
		m.power_inc();
		m.power_inc();
		assertEquals(4, m.getPower());
		m.power_inc();
		assertEquals(5, m.getPower());// maximo valor posible
		m.power_inc();
		m.power_inc();
		m.power_inc();
		m.power_inc();
		m.power_inc();
		assertEquals(5, m.getPower());
		
		
	}

	@Test
	void power_dec() {
		m.power_inc();
		m.power_inc();
		m.power_inc();
		m.power_inc();
		m.power_inc();
		assertEquals(5, m.getPower());
		m.power_dec();
		assertEquals(4, m.getPower());
		m.power_dec();
		m.power_dec();
		m.power_dec();
		assertEquals(1, m.getPower());
		m.power_dec();
		assertEquals(0, m.getPower());
		m.power_dec();
		m.power_dec();
		assertEquals(0, m.getPower());
	}

	@Test
	void power_reset() {
		m.power_reset();
		assert(m.power==0);
	}

	@Test
	void timer_inc() {
		m.setTimer(298);
		m.timer_inc();
		m.timer_inc();
		assertEquals(300, m.getTimer());
		m.timer_inc();
		m.timer_inc();
		m.timer_inc();
		assertEquals(300, m.getTimer());
	}
	
	@Test
	void setTimer() {
		
	}
}
