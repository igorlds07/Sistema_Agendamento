package com.example.Sistema_agendamento.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "enderecos")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEndereco;

    @NotBlank
    @Column(name = "numero")
    private String numero;

    @Column(name = "bairro", length = 100)
    private String bairro;

    @NotBlank
    @Column(name = "cidade", length = 50)
    private String cidade;

    @NotBlank
    @Column(name = "uf", length = 2)
    private char uf;

    @NotBlank
    @Column(name = "cep", length = 8)
    private String cep;

    @Column(name = "referencia", length = 100)
    private String referencia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteEntity cliente;
}
