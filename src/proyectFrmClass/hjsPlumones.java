package proyectFrmClass;

public class hjsPlumones extends pdrUtiles {

    public hjsPlumones(int posicion, String producto, int cant) {
        super(posicion, producto, cant);
    }
    
    public void PrecioUni() {
        switch(producto) {
            case "Plumones FaberCastle":
                $Uni = 11.60;
                break;
            case "Plumones Artezco":
                $Uni = 25.00;
                break;
            case "Plumones Generales":
                $Uni = 5.50;
                break;
        }
    }
    
}
