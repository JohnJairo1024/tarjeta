package co.com.tarjeta.service.impl;

import co.com.tarjeta.config.OrikaMapper;
import co.com.tarjeta.dto.TarjetaCreditoDTO;
import co.com.tarjeta.entity.TarjetaCreditoEntidad;
import co.com.tarjeta.repository.TarjetaCreditoRepositorio;
import co.com.tarjeta.service.TarjetaInfoService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarjetaInfoServiceImpl implements TarjetaInfoService {

    @Autowired
    private TarjetaCreditoRepositorio repository;
    private MapperFacade facade = new OrikaMapper();


    public List<TarjetaCreditoDTO> getTarjetaInfo() {
        List<TarjetaCreditoEntidad> entity = repository.getTarjetaCreditoEntidadBy();
        List<TarjetaCreditoDTO> domain = new ArrayList<>();
        entity.stream().forEach((cliente) -> domain.add(facade.map(cliente, TarjetaCreditoDTO.class)));
        return domain;
    }

    public TarjetaCreditoDTO getTarjetaInfoById(Long id) {
        TarjetaCreditoDTO domain;
        TarjetaCreditoEntidad entity = repository.getTarjetaCreditoEntidadByIdTarjetaCredito(id);
        domain = facade.map(entity, TarjetaCreditoDTO.class);
        return domain;
    }

    public TarjetaCreditoDTO getTarjetaInfoByName(String name) {
        TarjetaCreditoDTO domain;
        TarjetaCreditoEntidad entity = repository.getTarjetaCreditoEntidadByNombreTarjeta(name);
        domain = facade.map(entity, TarjetaCreditoDTO.class);
        return domain;
    }

}
