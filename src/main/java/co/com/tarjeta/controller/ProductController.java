package co.com.tarjeta.controller;

import co.com.tarjeta.dto.ProductDto;
import co.com.tarjeta.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProductController {

    private ProductServiceImpl service;

    @Autowired
    public ProductController(ProductServiceImpl service){
        this.service = service;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value= "/products")
    public List<ProductDto> getProducts(){
        List<ProductDto> response = service.getProducts();
        return response;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/products/{id}")
    public ProductDto getProductById(@PathVariable(value="id", required = true)long id){
        ProductDto response = service.getProductById(id);
        return response;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/product")
    @ResponseBody
    public ProductDto getProductByName(@RequestParam String name){
        ProductDto response = service.getProductByName(name);
        return response;
    }
}
