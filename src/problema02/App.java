package problema02;
import java.time.LocalDate;
import java.time.LocalTime;

public class App {

	public static void main(String[] args) {
		Producto[] productos = { new Producto("Pizza", 200) ,  
								new Producto("Fugazza", 150) ,  
								new Producto("Empanadas", 250) ,  
								new Producto("Hamburguesas", 100),  
								new Producto("Papas Fritas", 60) , 
								new Producto("Tarta", 250)};

		Pedido pedido1 = new PedidoBasico(LocalDate.parse("2020-04-12"));
		Pedido pedido2 = new PedidoBasicoExpress(LocalDate.parse("2020-04-12"));
		Pedido pedido3 = new PedidoPremium(LocalDate.parse("2020-04-12"));
		
		Tramite tramite1 = new Tramite("Pagar factura de luz", "Boulevard 1234", LocalDate.parse("2020-04-12"), LocalTime.parse("16:30"));
		Tramite tramite2 = new Tramite("Pagar Cablevideo", "Gorriti 1234", LocalDate.parse("2020-04-12"), LocalTime.parse("16:45"));
		
		for(int i=0; i < productos.length ; i++){
			pedido1.agregarProducto(productos[i]);
			pedido2.agregarProducto(productos[i]);
			pedido3.agregarProducto(productos[i]);
		}
		
		System.out.println("Costo Pedido Basico: " + pedido1.precio());
		System.out.println("Costo Pedido Basico Express: " + pedido2.precio());
		System.out.println("Costo Pedido Premium: " + pedido3.precio());
		System.out.println("---------------------------------------");
		Cadete lukitasPro = new Cadete();
		
		lukitasPro.agregarPedido(pedido1);
		lukitasPro.agregarPedido(pedido2);
		lukitasPro.agregarPedido(pedido3);
		lukitasPro.agregarPedido(tramite1);
		lukitasPro.agregarPedido(tramite2);
		
		System.out.println("Costo tramite1: " + tramite1.precio());
		System.out.println("Costo tramite2: " + tramite2.precio());
		
		System.out.println("---------------------------------------");
		System.out.println("Comision pedido Basico: " + pedido1.comision());
		System.out.println("Comision pedido Basico Express: " + pedido2.comision());
		System.out.println("Comision pedido Premium: " + pedido3.comision());
		
		System.out.println("---------------------------------------");
		
		System.out.println("Comision Tramite1: " + tramite1.comision());
		System.out.println("Comision Tramite2: " + tramite2.comision());
		
		System.out.println("---------------------------------------");
		
		System.out.println("LukitasPro gano: " + lukitasPro.comisiones());
		
		
	}

}
