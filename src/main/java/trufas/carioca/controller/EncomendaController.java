package trufas.carioca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import trufas.carioca.domain.Encomenda;
import trufas.carioca.service.EncomendaService;

import java.util.List;

@RestController
@RequestMapping(value = "/encomenda")
@CrossOrigin
public class EncomendaController {

    @Autowired
    EncomendaService encomendaService;

    @PostMapping
    public Encomenda registerEncomenda(@RequestBody Encomenda encomenda){
         return encomendaService.registerEncomenda(encomenda);
    }

    @GetMapping
    public List<Encomenda> listAllEncomendas(){
        return encomendaService.getAllEncomendas();
    }
}
