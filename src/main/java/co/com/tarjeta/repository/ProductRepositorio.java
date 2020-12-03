package co.com.tarjeta.repository;

import co.com.tarjeta.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositorio extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity>  getProductEntitiesBy();

    ProductEntity getProductById(long id);

    ProductEntity getProductByName(String name);

}
