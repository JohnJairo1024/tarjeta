package co.com.tarjeta.repository;

import co.com.tarjeta.entity.ClienteEntidad;
import co.com.tarjeta.entity.TarjetaCreditoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarjetaCreditoRepositorio extends JpaRepository<TarjetaCreditoEntidad, Long> {

    List<TarjetaCreditoEntidad> getTarjetaCreditoEntidadBy();

    TarjetaCreditoEntidad getTarjetaCreditoEntidadByIdTarjetaCredito(Long id);

    TarjetaCreditoEntidad getTarjetaCreditoEntidadByNombreTarjeta(String name);


}
