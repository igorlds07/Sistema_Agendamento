package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Servico")
public class ServicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String nome;


    @Column(nullable = false, length = 500)
    private String descricao;


    private Duration duracaoPadrao;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal precoBase;
}
