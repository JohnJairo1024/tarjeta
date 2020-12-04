package co.com.tarjeta.repository;

import co.com.tarjeta.entity.ClienteEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepositorio extends JpaRepository<ClienteEntidad, Long> {

    List<ClienteEntidad> getClienteEntidadBy();

    ClienteEntidad getClienteEntidadByIdCliente(Long id);

    ClienteEntidad getClienteEntidadByNombresCliente(String name);

}
