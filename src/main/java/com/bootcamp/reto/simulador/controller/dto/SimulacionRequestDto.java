package com.bootcamp.reto.simulador.controller.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SimulacionRequestDto {
    private String dni;
    private int tarjetaId;
    private String moneda;
    private double monto;
    private int cuota;
    private double tea;
    private int diaPago;
}
