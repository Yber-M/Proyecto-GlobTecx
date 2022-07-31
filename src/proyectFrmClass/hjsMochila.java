package proyectFrmClass;

public class hjsMochila extends pdrUtiles {

    public hjsMochila(int posicion, String producto, int cant) {
        super(posicion, producto, cant);
    }
    
    public void PrecioUni() {
        switch (producto) {
            case "Mochila Porta":
                $Uni = 99.90;
                break;
            case "Mochila School":
                $Uni = 150.00;
                break;
            case "Mochila Cyzone":
                $Uni = 199.99;
                break;
        }
    }
    
}
