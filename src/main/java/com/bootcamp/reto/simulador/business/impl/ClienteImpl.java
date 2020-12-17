package com.bootcamp.reto.simulador.business.impl;

import com.bootcamp.reto.simulador.business.ClientService;
import com.bootcamp.reto.simulador.controller.dto.SimulacionRequestDto;
import com.bootcamp.reto.simulador.controller.dto.SimulacionResponseDto;
import com.bootcamp.reto.simulador.repository.ClienteRepository;
import com.bootcamp.reto.simulador.repository.ClienteTarjetaRepository;
import com.bootcamp.reto.simulador.repository.entity.Cliente;
import com.bootcamp.reto.simulador.repository.entity.ClienteTarjeta;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClienteImpl implements ClientService {

    private final ClienteRepository clienteRepository;
    private final ClienteTarjetaRepository clienteTarjetaRepository;

    @Override
    public SimulacionResponseDto simulacion(SimulacionRequestDto simulacionRequestDto) throws Exception {
        Optional<Cliente> clienteOptional = this.clienteRepository.findClienteByDni(simulacionRequestDto.getDni());
        if (clienteOptional.isEmpty())
            throw new Exception("Cliente no presente");

        Cliente cliente = clienteOptional.get();
        Optional<List<ClienteTarjeta>> optionalClienteTarjetas = this.clienteTarjetaRepository.findClienteTarjetaByClientId(cliente.getClienteId());
        if (optionalClienteTarjetas.isEmpty())
            throw new Exception("Cliente no tiene tarjetas");

        List<ClienteTarjeta> clienteTarjetas = optionalClienteTarjetas.get();
        boolean flag = clienteTarjetas.stream().anyMatch(p -> p.getTarjetaId() == simulacionRequestDto.getTarjetaId());

        if (!flag)
            throw new Exception("La tarjeta indicada no es del usuario");

        return SimulacionResponseDto.builder()
                .estado("aceptado")
                .moneda(simulacionRequestDto.getMoneda())
                .cuota(simulacionRequestDto.getMonto()/ simulacionRequestDto.getCuota())
                .primeraCuota("2021-12-"+)
                .build();
    }
}
