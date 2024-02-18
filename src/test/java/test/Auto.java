package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int c= 0;
		for (Asiento i: asientos) {
			if (i != null) {
				c++;
			}
			
		}
		return c;
	}
	
	public String verificarIntegridad() {
		if (motor.registro != registro) {
			return "Las piezas no son originales";	
		}
		for (Asiento asiento: asientos) {
			if (asiento != null) {
				if (asiento.registro!= registro) {
					return "Las piezas no son originales";
				}				
			}		
		}
		return "Auto Original";
	}

}
