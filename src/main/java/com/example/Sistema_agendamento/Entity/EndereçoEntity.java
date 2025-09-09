package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.UUID;

@Entity
public class EndereçoEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEndereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String referencia;
}
