package proyectFrmClass;

public abstract class pdrUtiles {
    String producto;
    int cant;
    Double $Uni;
    int posicion;

    public pdrUtiles(int posicion, String producto, int cant) {
        this.producto = producto;
        this.cant = cant;
        this.posicion = posicion;
        PrecioUni();
    }
    
    public abstract void PrecioUni();
    
}
