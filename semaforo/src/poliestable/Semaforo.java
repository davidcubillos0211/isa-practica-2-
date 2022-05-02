package poliestable;


public class Semaforo {

	private estadoEnum state ;
	private Observador obs;
	
	public Semaforo () {
		state= estadoEnum.ROJO;
		
		obs= new Observador();
	}
	private Color instacias () {
		Color instancia = null;
		
		if (this.getState().equals(estadoEnum.ROJO)) {
			instancia = new Rojo();	
		} if (this.getState().equals(estadoEnum.VERDE)) {// suponemos el verde 
			instancia = new Verde();
		}
		if (this.getState().equals(estadoEnum.AMARILLO)) {
			instancia = new Amarillo();
		}
		return instancia;
	}
	
	public void abrir () {
		Color inst= this.instacias();
		inst.setMode(obs);
		inst.abrir();
		this.state= inst.getState();
	
	}
	public void cerrar () {
		Color inst= this.instacias();
		inst.setMode(obs);
		inst.cerrar();
		this.state= inst.getState();
	
			
		}
	public estadoEnum getState () {
		
		return state;
	}
	public void cambio() {
		obs.actualizacion();
}
		
		
	}


