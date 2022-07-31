package proyectFrmClass;

public class hjsPortafolio extends pdrUtiles {

    public hjsPortafolio(int posicion, String producto, int cant) {
        super(posicion, producto, cant);
    }
    
    public void PrecioUni() {
        switch (producto) {
            case "Portafolio Basic":
                $Uni = 4.90;
                break;
            case "Portafolio Standford":
                $Uni = 8.50;
                break;
            case "Portafolio Artesco":
                $Uni = 13.99;
                break;
        }
    }
}
