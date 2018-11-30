package trufas.carioca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trufas.carioca.domain.Encomenda;
import trufas.carioca.repository.EncomendaRepository;

import java.util.List;

@Service
public class EncomendaImpl implements EncomendaService {

     @Autowired
     EncomendaRepository encomendaRepository;

    @Override
    public Encomenda registerEncomenda(Encomenda encomenda) {
        return encomendaRepository.save(encomenda);
    }

    @Override
    public List<Encomenda> getAllEncomendas() {
        return encomendaRepository.findAll();
    }
}
