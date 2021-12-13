package com.arthurandrade.atividade1.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "table_endereco")

public class Endereco {

    @OneToOne(mappedBy = "table_endereco")
    private Pessoa pessoa;
    @Column(name = "Cep", length = 255)
    private String cep;
    @Column(name = "Rua", length = 255)
    private String rua;
    @Column(name = "Bairro", length = 255)
    private String bairro;
    @Column(name = "Cidade", length = 255)
    private String cidade;
    @Column(name = "Uf", length = 255)
    private String uf;
    
}
