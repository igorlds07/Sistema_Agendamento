package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.Entity;
import jdk.jfr.ContentType;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class AnexoEntity {
    private UUID id;
    private OrdemServicoEntity ordemServico;
    private String nomeArquivo;
    private ContentType contentType;
    private Integer tamanho;
    private LocalDate criado;

}
