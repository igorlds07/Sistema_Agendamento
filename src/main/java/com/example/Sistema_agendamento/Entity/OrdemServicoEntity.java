package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class OrdemServicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    private AgendamentoEntity agendamento;

    @Column(nullable = false, unique = true)
    private String codigoOs;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private statusOrdem status;

    @NotBlank
    @Column(name = "descricao", nullable = false, length = 1000)
    private String descricao;

    @NotNull
    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criado;

    @Column(name = "encerrado_em")
    private LocalDateTime encerrado;

    private String localExecucao;

    @PrePersist
    private void prePersist() {
        if (this.criado == null) {
            this.criado = LocalDateTime.now();
        }
        if (this.status == null) {
            this.status = statusOrdem.ABERTA;
        }
    }


    public enum statusOrdem{
        ABERTA,
        EM_EXECUCAO,
        CONCLUIDA,
        CANCELADA

    }
}
