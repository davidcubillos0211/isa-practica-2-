package Triestable;

public class Verde extends Color {

	public Verde (){
		
		this.stateColor= estadoEnum.VERDE;
	}
	
	public void  cerrar () {
		this.stateColor= estadoEnum.AMARILLO;
		
	}
	
}
