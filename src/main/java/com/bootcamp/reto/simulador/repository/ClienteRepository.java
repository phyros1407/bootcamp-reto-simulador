package com.bootcamp.reto.simulador.repository;


import com.bootcamp.reto.simulador.repository.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author barbb
 * @created 11/12/2020 - 18:20
 * @project simulador
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query(value = "SELECT c.* FROM Cliente c "
            + "WHERE c.dni =:dni ", nativeQuery = true)
    Optional<Cliente> findClienteByDni(String dni);

}
