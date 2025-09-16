package com.example.Sistema_agendamento.Repository;

import com.example.Sistema_agendamento.Entity.TecnicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TecnicoRepository extends JpaRepository<TecnicoEntity, UUID> {


    Optional<TecnicoEntity> findByMatricula(String matricula);

    List<TecnicoEntity> findByEspecialidade(String especialidade);

    boolean existsByMatricula(String matricula);
}
