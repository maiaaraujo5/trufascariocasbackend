package trufas.carioca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trufas.carioca.domain.Contato;
import trufas.carioca.repository.ContatoRepository;

import java.util.List;

@Service
public class ContatoImpl implements ContatoService {

    @Autowired
    ContatoRepository contatoRepository;

    @Override
    public Contato registerContato(Contato contato) {
        return contatoRepository.save(contato);
    }

    @Override
    public List<Contato> getAllContatos() {
        return contatoRepository.findAll();
    }
}
