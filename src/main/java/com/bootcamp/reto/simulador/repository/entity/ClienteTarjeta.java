package com.bootcamp.reto.simulador.repository.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author barbb
 * @created 11/12/2020 - 18:20
 * @project simulador
 */
@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ClienteTarjeta", schema = "dbo")
public class ClienteTarjeta {

    @Id
    @Column(name = "cliente_tarjeta_id")
    private int clienteTarjetaId;

    @Column(name = "cliente_id")
    private int clienteId;

    @Column(name = "tarjeta_id")
    private int tarjetaId;
}
