package trufas.carioca.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Trufas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    private String nome;

    @Column
    private String preco;

    @Column
    private String foto;

    private Trufas(){}
}
