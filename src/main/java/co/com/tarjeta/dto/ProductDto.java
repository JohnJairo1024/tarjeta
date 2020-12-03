package co.com.tarjeta.dto;

import lombok.Data;

@Data
public class ProductDto {
    private long id;
    private String name;
    private String brand;
    private int quantity;
}