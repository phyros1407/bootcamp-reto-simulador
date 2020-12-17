package com.bootcamp.reto.simulador.repository.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author barbb
 * @created 11/12/2020 - 18:18
 * @project simulador
 */
@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Cliente", schema = "dbo")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private int clienteId;

    @Column(name = "dni")
    private String dni;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(targetEntity = ClienteTarjeta.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id")
    private List<ClienteTarjeta> clienteTarjetas;


}
