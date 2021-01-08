package co.com.tarjeta.controller;

import co.com.tarjeta.dto.TarjetaCreditoDTO;
import co.com.tarjeta.service.TarjetaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TarjetaInfoController {

    private TarjetaInfoService service;

    @Autowired
    public TarjetaInfoController(TarjetaInfoService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/tarjetasinfo")
    public List<TarjetaCreditoDTO> getTarjetaInfo() {
        List<TarjetaCreditoDTO> response = service.getTarjetaInfo();
        return response;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/tarjetainfo/{id}")
    public TarjetaCreditoDTO getTarjetaInfoById(@PathVariable(value = "id") Long id) {
        TarjetaCreditoDTO response = service.getTarjetaInfoById(id);
        return response;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/tarjetainfo")
    @ResponseBody
    public TarjetaCreditoDTO getTarjetaInfoByName(@RequestParam String name) {
        TarjetaCreditoDTO response = service.getTarjetaInfoByName(name);
        return response;
    }

}
