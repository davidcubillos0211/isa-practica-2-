package beistable;
public class Semaforo {
	private estadoEnum state ;
	public Semaforo () {
		state= estadoEnum.ROJO;
		
	}
	private Color instacias () {
		Color instancia = null;
		
		if (this.getState().equals(estadoEnum.ROJO)) {
			instancia = new Rojo();	
		}  
		if (this.getState().equals(estadoEnum.VERDE)) {// suponemos el verde 
			instancia = new Verde();
			}
		return instancia;
	}
	
	public void abrir () {
		Color inst= this.instacias();
		inst.abrir();
		this.state= inst.getState();
	
	}
	public void cerrar () {
		Color inst= this.instacias();
		inst.cerrar();
		this.state= inst.getState();
	
			
		}
	public estadoEnum getState () {
		
		return state;
	}

}
