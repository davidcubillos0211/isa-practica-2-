package beistable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	public void biestable() {
	Semaforo a  = new Semaforo();
	
	assertEquals(a.getState(),estadoEnum.ROJO);
	a.abrir();
	assertEquals(a.getState(),estadoEnum.VERDE);
	a.abrir();
	
	assertEquals(a.getState(),estadoEnum.VERDE);
	a.cerrar();
	
	
	
	assertEquals(a.getState(),estadoEnum.ROJO);
	a.cerrar();
	
	assertEquals(a.getState(),estadoEnum.ROJO);
	
	}
}