package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class ItemChecklist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ordem_servico_id", nullable = false)
    private OrdemServicoEntity ordemServicoId;

    @NotBlank
    @Column(nullable = false, length = 255)
    private String descricao;

    @Column(nullable = false)
    private boolean obrigatorio = false;

    @Column(nullable = false)
    private boolean marcado = false;

    @Column(length = 500)
    private String observacao;
}
