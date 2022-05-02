package poliestable;

public class Rojo extends Color {
	public Rojo () {
		this.stateColor= estadoEnum.ROJO;
	}
		
		public void abrir () {
			if (this.bies) {
				super.abrir();
			}else {
			this.stateColor= estadoEnum.AMARILLO;
			}
	}
	
	

}
