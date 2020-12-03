package co.com.tarjeta.util;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class FechaUtil {

    /**
     * @param fecha
     * @return
     */
    public static String convertirDateToString(Date fecha) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        String reportDate = formatter.format(fecha);
        return reportDate;
    }

}
