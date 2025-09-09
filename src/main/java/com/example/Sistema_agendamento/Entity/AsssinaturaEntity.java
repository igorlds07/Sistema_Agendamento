package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class AsssinaturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private OrdemServicoEntity ordemServico;
    private String nomeAssinante;
    private String imagem;
    private LocalDateTime dataHora;
}
