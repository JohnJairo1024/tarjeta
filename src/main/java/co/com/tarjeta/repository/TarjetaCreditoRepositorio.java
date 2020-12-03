package co.com.tarjeta.repository;

import co.com.tarjeta.entity.TarjetaCreditoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaCreditoRepositorio extends JpaRepository<TarjetaCreditoEntidad, Long> {

}
