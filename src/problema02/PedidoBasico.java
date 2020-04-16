package problema02;
import java.time.LocalDate;
public class PedidoBasico extends Pedido {

	public PedidoBasico(LocalDate fecha) {
		super(5, fecha);
		}
	@Override 
	public  double precio() {
		double precioPedido=0;
		for(int i=0; i< super.productosPedidos.size(); i++){
			precioPedido+= super.productosPedidos.get(i).getCosto();
		}
		return  precioPedido * 1.05;
	}
	@Override
	public double comision(){
		if(LocalDate.now().isAfter(super.fecha)){
			return this.precio() *0.10;
		}
		return 0;
	}
}
