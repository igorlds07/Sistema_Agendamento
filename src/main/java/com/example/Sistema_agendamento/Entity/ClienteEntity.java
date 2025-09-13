package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ClienteEntity extends PessoaEntity{

    @Email
    @Column(name = "email", nullable = false, unique = true,  length = 100)
    private String email;

    @NotBlank
    @Column(name = "telefone")
    private String telefone;


}
