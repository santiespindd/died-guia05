package problema01;

public class Coordenada {
	
	private double latitud;
	private double longitud;
	
	/*Constructores*/
	public Coordenada() {
		
	}
	
	public Coordenada(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
   public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/*Redifinir equals method*/
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null) return false;
		Coordenada cor = new Coordenada();
		if(cor.latitud == this.latitud && cor.longitud == this.longitud) return true;
		return false;
	}
   
	@Override
	public String toString() {
		return "Coordenada [latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
	
}
