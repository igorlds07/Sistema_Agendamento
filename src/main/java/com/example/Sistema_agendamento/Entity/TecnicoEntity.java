package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(
        name = "tecnicos",
        indexes = {
                @Index(name = "idx_tecnico_matricula", columnList = "matricula", unique = true)
        }
)
public class TecnicoEntity extends PessoaEntity {

    @Column(name = "matricula", nullable = false, unique = true)
    private String matricula;

    @Size(min = 5, max = 50)
    private String especialidade;
}
