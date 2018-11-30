package trufas.carioca.service;

import trufas.carioca.domain.Trufas;

import java.util.List;

public interface TrufasService {

     List<Trufas> getAllTrufas();

     Trufas registerTrufa(Trufas trufas);
}
