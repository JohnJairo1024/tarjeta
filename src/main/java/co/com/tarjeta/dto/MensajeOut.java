package co.com.tarjeta.dto;


import lombok.Data;

@Data
public class MensajeOut {

    private String mensaje;
    private int codigoRespuesta;
    private boolean exitoso;
    
}