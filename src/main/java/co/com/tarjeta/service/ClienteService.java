package co.com.tarjeta.service;

import co.com.tarjeta.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {

    List<ClienteDTO> getCliente();

    ClienteDTO getClienteById(long id);

    ClienteDTO getClienteByName(String name);
}
