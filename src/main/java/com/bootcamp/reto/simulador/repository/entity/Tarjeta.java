package com.bootcamp.reto.simulador.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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
@Table(name = "Tarjeta", schema = "dbo")
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tarjeta_id")
    private int tarjetaId;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(targetEntity = ClienteTarjeta.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "tarjeta_id", referencedColumnName = "tarjeta_id")
    private List<ClienteTarjeta> clienteTarjetas;


}
