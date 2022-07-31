package proyectFrmClass;

public class hjsCuaderno extends pdrUtiles {

    public hjsCuaderno(int posicion, String producto, int cant) {
        super(posicion, producto, cant);
    }
    
    public void PrecioUni() {
        switch(producto) {
            case "Cuadernos Loro":
                $Uni = 3.50;
                break;
            case "Cuadernos Standford":
                $Uni = 5.50;
                break;
            case "Cuadernos College":
                $Uni = 10.90;
                break;
        }
    }
}
