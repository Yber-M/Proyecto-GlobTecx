package proyectFrmClass;

public class hjsLapiz extends pdrUtiles {

    public hjsLapiz(int posicion, String producto, int cant) {
        super(posicion, producto, cant);
    }
    
    public void PrecioUni() {
        switch(producto) {
            case "Lapiz Mongol":
                $Uni = 0.50;
                break;
            case "Lapiz Artezco":
                $Uni = 1.00;
                break;
            case "Lapiz Lorito":
                $Uni = 1.50;
                break;
        }
    }
}
