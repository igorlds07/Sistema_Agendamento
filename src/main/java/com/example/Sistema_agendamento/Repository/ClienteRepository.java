package com.example.Sistema_agendamento.Repository;

import com.example.Sistema_agendamento.Entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<ClienteEntity, UUID> {

  Optional<ClienteEntity> findByEmail(String email);
  boolean existByEmail(String email);
}
