package com.bootcamp.reto.simulador.controller.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SimulacionResponseDto {

    private double cuota;
    private String moneda;
    private String primeraCuota;
    private String estado;

}
