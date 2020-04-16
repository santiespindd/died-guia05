package problema02;

import java.util.ArrayList;

public class Cadete {

    ArrayList<Comisionable> pedidos = new ArrayList<>();

    public void agregarPedido(Comisionable p){
        pedidos.add(p);
    }
    public double comisiones() {
        double comision = 0;
        for(int i=0;i < pedidos.size();i++){
            comision += pedidos.get(i).comision();
        }
        return comision;
    }
    
}
