package proyectFrmClass;

public class hjsColores extends pdrUtiles {

    public hjsColores(int posicion, String producto, int cant) {
        super(posicion, producto, cant);
    }
    System.out.print("PRUEBA DE QUE EXTRAEMOS LO CAMBIOS");
    public void PrecioUni() {
        switch (producto) {
            case "Colores FaberCastle":
                $Uni = 6.50;
                break;
            case "Colores Artezco":
                $Uni = 9.50;
                break;
            case "Colores KP":
                $Uni = 16.90;
                break;
        }
    }
}
