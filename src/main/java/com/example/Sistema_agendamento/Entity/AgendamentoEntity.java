package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Agendamentos")
public class AgendamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAgendamento;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteEntity idCliente;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tecnico_id", nullable = false)
    private TecnicoEntity idTecnico;

    @NotNull
    // @FutureOrPresent
    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @NotNull
    // @FutureOrPresent
    @Column(name = "data_fim", nullable = false)
    private LocalDate dataFim;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDENTE;

    @OneToOne(mappedBy = "agendamento", fetch = FetchType.LAZY)
    private OrdemServicoEntity ordemServico;

    public enum Status{
        PENDENTE,
        CONFIRMADO,
        CANCELADO,
        CONCLUIDO
    }


}
