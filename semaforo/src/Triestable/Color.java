package Triestable;


public abstract class Color {
	estadoEnum stateColor;
	
	public estadoEnum getState () {
		return this.stateColor;
	}
 	public void abrir () {
		this.stateColor= estadoEnum.VERDE;
		
	}
	public void cerrar() {
		this.stateColor= estadoEnum.ROJO;
	}
 
}
