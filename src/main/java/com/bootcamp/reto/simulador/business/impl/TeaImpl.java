package com.bootcamp.reto.simulador.business.impl;

import com.bootcamp.reto.simulador.business.TeaService;
import com.bootcamp.reto.simulador.controller.dto.TeaDto;
import com.bootcamp.reto.simulador.repository.TeaRepository;
import com.bootcamp.reto.simulador.repository.entity.Tea;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TeaImpl implements TeaService {

    private final TeaRepository teaRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<TeaDto> obtenerListaTea() {
        List<Tea> teas = this.teaRepository.findAll();
        return modelMapper.map(teas, new TypeToken<List<TeaDto>>() {}.getType());
    }
}
