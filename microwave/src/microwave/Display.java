package microwave;

public class Display {
	private String display; 
	public Display() {
		display="";
	}
	public void clearDisplay() {
		display="";
	}
	
	public void setDisplay(String p) {
		display=p;
	}
	public String getDisplay() {
		return this.display;
	}	
}
