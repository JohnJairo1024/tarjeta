package co.com.tarjeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CLIENTES_TBL")
public class ClienteEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "NOMBRES_CLIENTE")
    private String nombresCliente;

    @Column(name = "APELLIDOS_CLIENTE")
    private String apellidosCliente;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "DIRECCION_UNO")
    private String lineaDireccion1;

    @Column(name = "DIRECCION_DOS")
    private String lineaDireccion2;

    @Column(name = "CIUDAD")
    private String ciudad;

    @Column(name = "BARRIO")
    private String barrio;

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;


    public ClienteEntidad(String nombresCliente, String apellidosCliente, String telefono, String lineaDireccion1, String lineaDireccion2, String ciudad, String barrio, String pais, Date fechaRegistro) {
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.telefono = telefono;
        this.lineaDireccion1 = lineaDireccion1;
        this.lineaDireccion2 = lineaDireccion2;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.pais = pais;
        this.fechaRegistro = fechaRegistro;
    }
}