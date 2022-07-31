package proyectFrmClass;

public class hjsCartuchera extends pdrUtiles {

    public hjsCartuchera(int posicion, String producto, int cant) {
        super(posicion, producto, cant);
    }
    
    public void PrecioUni() {
        switch (producto) {
            case "Cartuchera Basic":
                $Uni = 3.90;
                break;
            case "Cartuchera 2 Cierres":
                $Uni = 8.00;
                break;
            case "Cartuchera 3 Cierres":
                $Uni = 12.00;
                break;
            case "Cartuchera 4 Cierres":
                $Uni = 14.99;
                break;
        }
    }
}
