package trufas.carioca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import trufas.carioca.domain.Trufas;
import trufas.carioca.service.TrufasService;

import java.util.List;

@RestController
@RequestMapping(value = "/trufas")
@CrossOrigin
public class TrufasController {

    @Autowired
    TrufasService trufasService;

    @GetMapping
    public List<Trufas> getAllTrufas(){
      return trufasService.getAllTrufas();
    }

    @PostMapping
    public Trufas registerTrufa(@RequestBody Trufas trufas){
        return trufasService.registerTrufa(trufas);
    }

}
