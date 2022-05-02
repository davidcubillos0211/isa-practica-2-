package Triestable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	public void Triestable() {
	Semaforo a  = new Semaforo();
	
	assertEquals(a.getState(),estadoEnum.ROJO);
	a.abrir();
	assertEquals(a.getState(),estadoEnum.AMARILLO);
	a.abrir();
	
	assertEquals(a.getState(),estadoEnum.VERDE);
	a.cerrar();
	
	
	
	assertEquals(a.getState(),estadoEnum.AMARILLO);
	a.cerrar();
	
	assertEquals(estadoEnum.ROJO, a.getState());
	
	}
}