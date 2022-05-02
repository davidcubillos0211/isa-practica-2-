package poliestable;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaforo a = new Semaforo(); 
		
		System.out.println(a.getState());
		a.abrir();
		System.out.println(a.getState());
		a.abrir();
		System.out.println(a.getState());
		
		a.cambio();
		a.cerrar();
		System.out.println(a.getState());


		
		
	}

}
