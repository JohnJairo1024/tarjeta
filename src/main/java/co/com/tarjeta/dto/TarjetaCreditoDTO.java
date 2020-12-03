package co.com.tarjeta.dto;


import co.com.tarjeta.entity.ClienteEntidad;
import lombok.Data;

import java.util.Date;


@Data
public class TarjetaCreditoDTO {

    private String nombreTarjeta;
    private String numeroTarjeta;
    private Date fechaCaducidad;
    private String CCV2;
    private String contrasenaSeguridad;
    private ClienteEntidad clienteEntidad;

}
