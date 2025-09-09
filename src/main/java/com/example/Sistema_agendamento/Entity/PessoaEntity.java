package com.example.Sistema_agendamento.Entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass
public abstract class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    @Size(min = 3, max = 100)
    @Column(nullable = false)
    private String nome;

    @Past
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;
    private String cpf;

    private String telefone;

}
