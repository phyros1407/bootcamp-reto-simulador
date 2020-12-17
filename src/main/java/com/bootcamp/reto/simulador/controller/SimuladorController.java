package com.bootcamp.reto.simulador.controller;

import com.bootcamp.reto.simulador.business.ClientService;
import com.bootcamp.reto.simulador.business.TarjetaService;
import com.bootcamp.reto.simulador.business.TeaService;
import com.bootcamp.reto.simulador.controller.dto.SimulacionRequestDto;
import com.bootcamp.reto.simulador.controller.dto.SimulacionResponseDto;
import com.bootcamp.reto.simulador.controller.dto.TarjetaDto;
import com.bootcamp.reto.simulador.controller.dto.TeaDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simulador")
@Slf4j
@RequiredArgsConstructor
public class SimuladorController {

    private final TarjetaService tarjetaService;
    private final TeaService teaService;
    private final ClientService clientService;

    @GetMapping(value = "/tarjetas")
    @ResponseStatus(HttpStatus.OK)
    public List<TarjetaDto> obtenerListadoTarjetas() {
        return this.tarjetaService.obtenerListadoTarjetas();
    }

    @GetMapping(value = "/tea")
    @ResponseStatus(HttpStatus.OK)
    public List<TeaDto> obtenerListaTea() {
        return this.teaService.obtenerListaTea();
    }

    @PostMapping(value = "")
    public SimulacionResponseDto simulacion(@RequestBody SimulacionRequestDto simulacionRequestDto) throws Exception {
        log.info(simulacionRequestDto.toString());
        return this.clientService.simulacion(simulacionRequestDto);
    }

}
