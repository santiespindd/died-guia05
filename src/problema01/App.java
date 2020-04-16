package problema01;


public class App {

	public static void main(String[] args) {
		
		Camino nuevoCamino = new Camino();
		Coordenada coor1 = new  Coordenada(1, 2);
		Coordenada coor2 = new  Coordenada(2, 2);
		Coordenada coor3 = new  Coordenada(3, 2);
		Coordenada no = new  Coordenada(4, -4);
		Coordenada se = new  Coordenada(-4, 4);
		nuevoCamino.agregar(coor1);
		nuevoCamino.agregar(coor2);
		nuevoCamino.agregar(coor3);

		
	
	
		
		System.out.println(nuevoCamino.buscar(no, se));
	}

}
