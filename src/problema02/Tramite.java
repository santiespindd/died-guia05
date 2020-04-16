package problema02;
import java.time.LocalDate;
import java.time.LocalTime;
public class Tramite implements Comisionable{
		String descripcion;
		String domicilio;
		LocalDate fecha;
		LocalTime hora;
		public Tramite(String descripcion, String domicilio, LocalDate fecha, LocalTime hora) {
			super();
			this.descripcion = descripcion;
			this.domicilio = domicilio;
			this.fecha = fecha;
			this.hora = hora;
		}
		@Override
		public double precio() {
			return 50;
		}
		@Override
		public double comision() {
			if(fecha.isBefore(LocalDate.now()) && hora.isBefore(LocalTime.now())){return 20;}
	         
			return 0;
		}
	
		
		
}
