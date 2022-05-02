package poliestable;

public abstract class Color {
	estadoEnum stateColor;
	boolean bies;
	
	public estadoEnum getState () {
		return this.stateColor;
	}
 	public void abrir () {
		this.stateColor= estadoEnum.VERDE;
		
	}
	public void cerrar() {
		this.stateColor= estadoEnum.ROJO;
	}
	public void setMode(Observador o) {
		this.bies= o.getMode();
		
	}
 
}
