package co.com.tarjeta.service;

import co.com.tarjeta.dto.TarjetaCreditoDTO;

import java.util.List;

public interface TarjetaInfoService {

    List<TarjetaCreditoDTO> getTarjetaInfo();

    TarjetaCreditoDTO getTarjetaInfoById(Long id);

    TarjetaCreditoDTO getTarjetaInfoByName(String name);
}
