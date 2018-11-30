package trufas.carioca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trufas.carioca.domain.Trufas;
import trufas.carioca.repository.TrufasRepository;

import java.util.List;

@Service
public class TrufasServiceImpl implements TrufasService {

    @Autowired
    private TrufasRepository trufasRepository;

    @Override
    public List<Trufas> getAllTrufas() {
        return trufasRepository.findAll();
    }

    @Override
    public Trufas registerTrufa(Trufas trufas) {
        return trufasRepository.save(trufas);
    }
}
