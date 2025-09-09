package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;

@Entity
public class ClienteEntity extends PessoaEntity{

    @Email
    private String email;
    private String telefone;


}
