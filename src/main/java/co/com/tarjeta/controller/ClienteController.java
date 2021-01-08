package co.com.tarjeta.controller;

import co.com.tarjeta.dto.ClienteDTO;
import co.com.tarjeta.service.impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ClienteController {

    private ClienteServiceImpl service;

    @Autowired
    public ClienteController(ClienteServiceImpl service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/clientes")
    public List<ClienteDTO> getClientes() {
        List<ClienteDTO> response = service.getCliente();
        return response;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/cliente/{id}")
    public ClienteDTO getClienteById(@PathVariable(value = "id") long id) {
        ClienteDTO response = service.getClienteById(id);
        return response;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/cliente")
    @ResponseBody
    public ClienteDTO getClienteByName(@RequestParam String name) {
        ClienteDTO response = service.getClienteByName(name);
        return response;
    }
}
