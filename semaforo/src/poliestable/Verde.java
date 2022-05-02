package poliestable;

public class Verde extends Color {

	public Verde (){
		
		this.stateColor= estadoEnum.VERDE;
	}
	
	public void  cerrar () {
		if (this.bies) {
			super.cerrar();
		}else {
		this.stateColor= estadoEnum.AMARILLO;
		}
	}
	
}
