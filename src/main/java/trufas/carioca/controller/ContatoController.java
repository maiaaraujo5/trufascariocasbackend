package trufas.carioca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import trufas.carioca.domain.Contato;
import trufas.carioca.service.ContatoService;

import java.util.List;

@RestController
@RequestMapping(value = "/contato")
@CrossOrigin
public class ContatoController {

    @Autowired
    ContatoService contatoService;

    @PostMapping
    public Contato registerContato(@RequestBody Contato contato){
        return contatoService.registerContato(contato);
    }

    @GetMapping
    public List<Contato> getAllContatos(){
          return contatoService.getAllContatos();
    }
}
