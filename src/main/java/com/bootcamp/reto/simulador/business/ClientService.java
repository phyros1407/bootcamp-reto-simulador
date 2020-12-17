package com.bootcamp.reto.simulador.business;

import com.bootcamp.reto.simulador.controller.dto.SimulacionRequestDto;
import com.bootcamp.reto.simulador.controller.dto.SimulacionResponseDto;

public interface ClientService {

    SimulacionResponseDto simulacion(SimulacionRequestDto simulacionRequestDto) throws Exception;

}
