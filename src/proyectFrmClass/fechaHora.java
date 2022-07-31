package proyectFrmClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class fechaHora {

    Date dato = new Date();

    //FECHA Y HORA
    SimpleDateFormat formatPMam = new SimpleDateFormat();

    String pmAm = formatPMam.format(dato);

    String hourComplet = pmAm;

}
