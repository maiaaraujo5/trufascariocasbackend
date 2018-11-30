package trufas.carioca.service;

import trufas.carioca.domain.Encomenda;

import java.util.List;

public interface EncomendaService {

    Encomenda registerEncomenda(Encomenda encomenda);

    List<Encomenda> getAllEncomendas();
}
