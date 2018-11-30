package trufas.carioca.service;

import trufas.carioca.domain.Contato;

import java.util.List;

public interface ContatoService {

    Contato registerContato(Contato contato);

    List<Contato> getAllContatos();
}
