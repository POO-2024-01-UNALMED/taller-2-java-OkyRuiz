package test;

public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	public void cambiarColor(String color) {
		if (color.equals("rojo") || color.equals("verde") || color.equals("amarillo") || color.equals("blanco") || color.equals("negro")) {
			this.color= color;
		}
	}

}
