package com.arthurandrade.atividade1.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "table_item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 64)
    private String nome;
    private String observacao;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="emprestimo_id")
    private Emprestimo emprestimo;
    @OneToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;
}