package co.com.tarjeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "USER_TBL")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String userName;
    private String password;
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    public UserEntity(String userName, String password, String email, Date fechaRegistro) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
    }
}
