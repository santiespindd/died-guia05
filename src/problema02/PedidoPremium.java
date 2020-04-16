package problema02;

import java.time.LocalDate;

public class PedidoPremium extends Pedido{
	
	public PedidoPremium(LocalDate fecha) {
		super(20,fecha);
	}
	@Override 
	public  double precio() {
		double precioPedido=0;
		
		for(int i=0; i< super.productosPedidos.size(); i++){
			precioPedido+= super.productosPedidos.get(i).getCosto();
		}
		if(super.productosPedidos.size() <= 5){
		return  precioPedido * 1.20;
		}
	
		return precioPedido * 1.30;
	}
	@Override
	public double comision(){
		if(LocalDate.now().isAfter(super.fecha)){
			if(super.productosPedidos.size() > 10){
				return (this.precio() *0.15 + 50);
			}
			return this.precio() *0.15;
		}
		return 0;
	}
}
