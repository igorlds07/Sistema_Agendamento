package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class AssinaturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "ordem_servico_id", nullable = false, unique = true)
    private OrdemServicoEntity ordemServico;

    @Column(nullable = false, length = 100)
    @NotBlank
    private String nomeAssinante;

    @Column(columnDefinition = "TEXT")
    private String imagem;

    @NotNull
    @Column(name = "data_hora", nullable = false)
    private LocalDateTime dataHora;
}
