package co.com.tarjeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PRODUCTS_TBL")
public class ProductEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Column(name = "BRAND")
    private String brand;

    @NotNull
    @Column(name = "QUANTITY")
    private int quantity;

    public ProductEntity(@NotNull String name, @NotNull String brand, @NotNull int quantity) {
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
    }
}