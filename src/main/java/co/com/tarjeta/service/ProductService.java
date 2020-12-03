package co.com.tarjeta.service;

import co.com.tarjeta.dto.ProductDto;

import java.util.List;

public interface ProductService {

    public List<ProductDto> getProducts();

    public ProductDto getProductById(long id);

    public ProductDto getProductByName(String name);
}
