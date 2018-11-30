package trufas.carioca.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Encomenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String celular;

    @Embedded
    private Endereco endereco;

    @Column
    private int quantidadeTrufas;

    @Column
    private String sabores;

    @Column
    private String dataEntrega;

    @Column
    boolean embaladas;

    @Column
    private String observacoes;

    private Encomenda() {}

}
