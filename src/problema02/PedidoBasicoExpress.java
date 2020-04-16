package problema02;
import java.time.LocalDate;
public class PedidoBasicoExpress extends PedidoBasico{
	
	public PedidoBasicoExpress(LocalDate fecha){
		super(fecha);
	}
	@Override 
	public  double precio() {
		double precioPedido=0;
		for(int i=0; i< super.productosPedidos.size(); i++){
			precioPedido+= super.productosPedidos.get(i).getCosto();
		}
		return  precioPedido * 1.25;
	}
	
}
