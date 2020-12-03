package co.com.tarjeta.service.impl;

import co.com.tarjeta.config.OrikaMapper;
import co.com.tarjeta.dto.ClienteDTO;
import co.com.tarjeta.service.ClienteService;
import co.com.tarjeta.entity.ClienteEntidad;
import co.com.tarjeta.repository.ClienteRepositorio;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepositorio repository;
    private MapperFacade facade = new OrikaMapper();


    public List<ClienteDTO> getCliente() {
        List<ClienteEntidad> entity = repository.getClienteEntidadBy();
        List<ClienteDTO> domain = new ArrayList<>();
        entity.stream().forEach((cliente) -> domain.add(facade.map(cliente, ClienteDTO.class)));
        return domain;
    }

    public ClienteDTO getClienteById(long id) {
        ClienteDTO domain;
        ClienteEntidad entity = repository.getClienteEntidadByIdCliente(id);
        domain = facade.map(entity, ClienteDTO.class);
        return domain;
    }

    public ClienteDTO getClienteByName(String name) {
        ClienteDTO domain;
        ClienteEntidad entity = repository.getClienteEntidadByNombresCliente(name);
        domain = facade.map(entity, ClienteDTO.class);
        return domain;
    }

}
