package com.bootcamp.reto.simulador.repository;

import com.bootcamp.reto.simulador.repository.entity.Tea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeaRepository extends JpaRepository<Tea, Long> {
}
