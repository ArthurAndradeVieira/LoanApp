package com.arthurandrade.atividade1.domain;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    import lombok.AllArgsConstructor;
    import java.util.List;
    import javax.persistence.*;
    import java.time.Instant;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity(name = "table_emprestimo")
    public class Emprestimo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "pessoa_id")
        private Pessoa pessoa; 
        private Instant dataInicio;
        private Instant dataFinal;
        @OneToMany(cascade = CascadeType.ALL, mappedBy = "emprestimo")
        private List<Item> item; 
        
    }
