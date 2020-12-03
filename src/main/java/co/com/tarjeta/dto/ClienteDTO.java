package co.com.tarjeta.dto;


import lombok.Data;


@Data
public class ClienteDTO {

    private String nombresCliente;
    private String apellidosCliente;
    private String telefono;
    private String lineaDireccion1;
    private String lineaDireccion2;
    private String ciudad;
    private String barrio;
    private String pais;

}
