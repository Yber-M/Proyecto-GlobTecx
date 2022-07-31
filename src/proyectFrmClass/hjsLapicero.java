package proyectFrmClass;

public class hjsLapicero extends pdrUtiles {

    public hjsLapicero(int posicion, String producto, int cant) {
        super(posicion, producto, cant);
    }
    
    public void PrecioUni() {
        switch(producto) {
            case "Lapicero FaberCastle":
                $Uni = 1.00;    
                break;
            case "Lapicero Artezco":
                $Uni = 1.50;
                break;
            case "Lapicero Stabilo":
                $Uni = 0.50;
                break;
            case "Lapicero Pilot":
                $Uni = 2.00;
                break;
        }
    }
}
