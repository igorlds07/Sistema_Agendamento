package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Agendamentos")
public class AgendamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAgendamento;

    @ManyToOne
    private ClienteEntity idCliente;

    @OneToMany
    private TecnicoEntity idTecnico;

    @Past
    private LocalDate dataInicio;

    @Past
    private LocalDate dataFim;

    @Enumerated(EnumType.STRING)
    private enum status{
        PENDENTE,
        CONFIRMADO,
        CANCELADO,
        CONCLUIDO
    }



}
