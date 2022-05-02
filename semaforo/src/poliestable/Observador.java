package poliestable;

public class Observador {
	private boolean biestable;
	
	 public Observador () {
		 biestable = true;
	 }
	 public Boolean getMode() {
		 return this.biestable;
	 }
	 public void actualizacion( ) {
			if (this.biestable) {
				this.biestable=false;
			}
			else {
				this.biestable=true;
			
	 }
	}

}
