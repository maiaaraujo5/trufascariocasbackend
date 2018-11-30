package trufas.carioca.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Endereco {

    @Column
    private String endereco;

    @Column
    private String cep;
}
