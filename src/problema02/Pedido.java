package problema02;

import java.util.ArrayList;
import java.time.LocalDate;


public class Pedido implements Comisionable {

	protected int cantProductosMax;
	protected ArrayList<Producto> productosPedidos = new ArrayList<Producto>();
	protected LocalDate fecha;
	
	public Pedido(int cantProductosMax , LocalDate fecha) {
		this.cantProductosMax = cantProductosMax;
		this.fecha = fecha;
	}
	
	final boolean agregarProducto(Producto p){
		
		if(productosPedidos.size() < this.cantProductosMax){
			productosPedidos.add(p);
			return true;
		}
		return false;	
	}
	public  double precio() {
		return 0;
	}
    public  double comision() {
		return 0;
	}

	
	
}
