package poliestable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	public void poliesble() {
	Semaforo a  = new Semaforo();
	//bi
	
	assertEquals(a.getState(),estadoEnum.ROJO);
	a.abrir();
	
	assertEquals(a.getState(),estadoEnum.VERDE);
	a.abrir();
	
	assertEquals(a.getState(),estadoEnum.VERDE);
	a.cambio();
	a.cerrar();
	//tri
	
	
	assertEquals(a.getState(),estadoEnum.AMARILLO);
	a.cerrar();
	
	assertEquals(estadoEnum.ROJO, a.getState());

	a.abrir();
	assertEquals(estadoEnum.AMARILLO, a.getState());
	a.cambio();
	a.abrir();
	assertEquals(a.getState(),estadoEnum.VERDE);
	
	}
} 