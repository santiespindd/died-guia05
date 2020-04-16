package problema01;
import java.util.ArrayList;
import java.util.List;

import problema01.Coordenada;

public class Camino {
	ArrayList<Coordenada> camino = new ArrayList<>();
	
	
	public void agregar(Coordenada c) {
		camino.add(c);
	}
	public void agregar(double lat, double lng) {
		Coordenada aux = new Coordenada(lat , lng);
		
		camino.add(aux);
	}
	public void agregar(int mtsLt,int mtsLn){
		double pi = Math.PI;
		int radioTierra = 6378;
		Coordenada previa = new Coordenada();
		previa = camino.get(camino.size() - 1);
		double nuevaLatitud  = previa.getLatitud() + (mtsLt / radioTierra) * (180 / pi);
		double nuevaLongitud = previa.getLongitud() + (mtsLn / radioTierra) * (180 / pi) / Math.cos(previa.getLatitud() * pi/180);
		
		Coordenada aux = new Coordenada( nuevaLatitud, nuevaLongitud);
	

		camino.add(aux);
		
	}
	public List<Coordenada> buscar(Coordenada no,Coordenada se){
		ArrayList<Coordenada> encontrados = new ArrayList<>();
		
		for(int i=0; i< camino.size() ; i++){
			if(camino.get(i).getLatitud() <= no.getLatitud() && camino.get(i).getLongitud() >= no.getLongitud()){
				if(camino.get(i).getLatitud() >= se.getLatitud() && camino.get(i).getLongitud() <= se.getLongitud()){
					encontrados.add(camino.get(i));	
				}
			}
		}
			
		return encontrados;
	}
	public List<Coordenada> buscar(Coordenada c ,int met){
		List<Coordenada> encontrados = new ArrayList<>();

        Coordenada no,se;
        	no = new Coordenada(c.getLatitud()+(double)((met/1000)/111),c.getLongitud()-(double)((met/1000)/111));
        	se = new Coordenada(c.getLatitud()-(double)((met/1000)/111),c.getLongitud()+(double)((met/1000)/111));
        
         encontrados = buscar(no, se);
      

		return encontrados;
	}
	
}
