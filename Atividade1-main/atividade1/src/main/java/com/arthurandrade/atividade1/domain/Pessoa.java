package com.arthurandrade.atividade1.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "table_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome", length = 64)
    private String nome;
    private Instant dataNascimento;
    @Column(name = "Cpf", length = 255)
    private String cpf;
    @Column(name = "Telefone", length = 255)
    private String telefone;
    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}
