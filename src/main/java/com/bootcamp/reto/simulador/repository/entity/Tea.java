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
@Table(name = "Tea", schema = "dbo")
public class Tea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tea_id")
    private int teaId;


    @Column(name = "valor")
    private double valor;


}
