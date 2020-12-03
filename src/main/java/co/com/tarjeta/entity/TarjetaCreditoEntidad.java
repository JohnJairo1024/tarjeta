package co.com.tarjeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TARJETA_CREDITO_TBL")
public class TarjetaCreditoEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TARJETA_CREDITO")
    private Long idTarjetaCredito;

    @Column(name = "NOMBRE_TARJETA")
    private String nombreTarjeta;

    @Column(name = "NUMERO_TARJETA")
    private String numeroTarjeta;

    @Column(name = "FECHA_CADUCIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCaducidad;

    @Column(name = "CCV2")
    private String CCV2;

    @Column(name = "CONTRASENA_SEGURIDAD")
    private String contrasenaSeguridad;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
    private ClienteEntidad clienteEntidad;

    public TarjetaCreditoEntidad(String nombreTarjeta, String numeroTarjeta, Date fechaCaducidad, String CCV2, String contrasenaSeguridad, ClienteEntidad clienteEntidad) {
        this.nombreTarjeta = nombreTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
        this.CCV2 = CCV2;
        this.contrasenaSeguridad = contrasenaSeguridad;
        this.clienteEntidad = clienteEntidad;
    }
}