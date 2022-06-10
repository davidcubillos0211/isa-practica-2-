package microwave;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WorkflowTest {
private Microwave m ; 
	// utilizaremos las funciones usadas en las demas clases de pruebas para
	// verificar que el estado interno del microondas es  correcto
	void ClosedWithNoItem() {
		
		
		assertEquals("ClosedWithNoItem",m.getEstado().fase());
		
		assert(!m.isDoorOpen() );
		assert( !m.getCalor().isHeating() );
		assert( !m.isWithItem() );
		assert( !m.getGira().isMoving() );
		assert( !m.getLampara().isLampOn());
		assert(!m.isCooking());
	}
	void OpenWithNoItemTest() {
		assertEquals("OpenWithNoItem",m.getEstado().fase());
		assert(m.isDoorOpen() );
		assert( !m.getCalor().isHeating() );
		assert( !m.isWithItem() );
		assert( !m.getGira().isMoving() );
		assert( m.getLampara().isLampOn());
		assert(!m.isCooking());
	}
	void OpenWithItemTest() {
		assertEquals("OpenWithItem",m.getEstado().fase());
		assert(m.isDoorOpen() );
		assert( !m.getCalor().isHeating() );
		assert( m.isWithItem() );
		assert( !m.getGira().isMoving() );
		assert( m.getLampara().isLampOn());
		assert(!m.isCooking());
	}
	void ClosedWithItemTest() {
		assertEquals("ClosedWithItem",m.getEstado().fase());
		assert(!m.isDoorOpen() );
		assert( !m.getCalor().isHeating() );
		assert( m.isWithItem() );
		assert( !m.getGira().isMoving() );
		assert( !m.getLampara().isLampOn());
		assert(	!m.isCooking());
	}
	void Cooking() {
		assertEquals("Cooking",m.getEstado().fase());
		assert(!m.isDoorOpen() );
		assert( m.getCalor().isHeating() );
		assert( m.isWithItem() );
		assert( m.getGira().isMoving() );
		assert( m.getLampara().isLampOn());
		assert(	m.isCooking());
	}
	
	
	/*
	 * Simulacoin de un caso de uso comun.
	 * 	1. se inicializa el microondas
	 * 	2.se abre
	 * 	3.se introduce iten
	 * 	4.se estabelece el tiempo y la potencia
	 * 	5.Pulsa el boton de start
	 */
	@Test
	void caso_de_uso_normal() {
		m = new Microwave();
		 ClosedWithNoItem();
		m.door_opened();
		this.OpenWithNoItemTest();
		m.item_placed();
		this.OpenWithItemTest();
		m.door_closed();
		this.ClosedWithItemTest();
		m.power_inc();
		m.power_inc();
		m.power_inc();
		m.setTimer(8);
		m.cooking_start();
		this.Cooking();
		for (int i=0 ;i<30;i++) {
			m.tick();
		}
		m.power_reset();
		assertEquals(0,m.power);
		this.ClosedWithItemTest();
		
	
		
		
	
	}
}
