package trufas.carioca.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    private String email;

    @Column
    private String assunto;

    @Column
    private String mensagem;

    private Contato(){}
}
