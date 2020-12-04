package co.com.tarjeta.service.impl;

import co.com.tarjeta.config.OrikaMapper;
import co.com.tarjeta.dto.ProductDto;
import co.com.tarjeta.entity.ProductEntity;
import co.com.tarjeta.repository.ProductRepositorio;
import co.com.tarjeta.service.ProductService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepositorio repository;
    private MapperFacade facade = new OrikaMapper();


    public List<ProductDto> getProducts() {
        List<ProductEntity> entity = repository.getProductEntitiesBy();
        List<ProductDto> domain = new ArrayList<>();
        entity.stream().forEach((product) -> {
            domain.add(facade.map(product, ProductDto.class));
        });
        return domain;
    }

    public ProductDto getProductById(long id) {
        ProductDto domain = new ProductDto();
        ProductEntity entity = repository.getProductById(id);
        domain = facade.map(entity, ProductDto.class);
        return domain;
    }

    public ProductDto getProductByName(String name) {
        ProductDto domain = new ProductDto();
        ProductEntity entity = repository.getProductByName(name);
        domain = facade.map(entity, ProductDto.class);
        return domain;
    }

}
