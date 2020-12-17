package com.bootcamp.reto.simulador.business.impl;

import com.bootcamp.reto.simulador.business.TarjetaService;
import com.bootcamp.reto.simulador.controller.dto.TarjetaDto;
import com.bootcamp.reto.simulador.repository.TarjetaRepository;
import com.bootcamp.reto.simulador.repository.entity.Tarjeta;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TarjetaImpl implements TarjetaService {

    private final TarjetaRepository tarjetaRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<TarjetaDto> obtenerListadoTarjetas() {
        List<Tarjeta> tarjetas = this.tarjetaRepository.findAll();
        return modelMapper.map(tarjetas, new TypeToken<List<TarjetaDto>>() {}.getType());
    }



}
