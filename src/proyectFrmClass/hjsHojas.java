package proyectFrmClass;

public class hjsHojas extends pdrUtiles {

    public hjsHojas(int posicion, String producto, int cant) {
        super(posicion, producto, cant);
    }

    public void PrecioUni() {
        switch (producto) {
            case "Hoja Bond":
                $Uni = 0.10;
                break;
            case "Hoja Colores":
                $Uni = 0.50;
                break;
            case "Hoja Bond Cien":
                $Uni = 9.50;
                break;
            case "Hoja Colores Cien":
                $Uni = 16.50;
                break;
        }
    }

}
