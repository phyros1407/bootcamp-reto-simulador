package com.bootcamp.reto.simulador.repository;

import com.bootcamp.reto.simulador.repository.entity.ClienteTarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteTarjetaRepository extends JpaRepository<ClienteTarjeta, Long> {

    @Query(value = "SELECT c.* FROM ClienteTarjeta c "
            + "WHERE c.cliente_id =:clientId ", nativeQuery = true)
    Optional<List<ClienteTarjeta>> findClienteTarjetaByClientId(int clientId);


}
