package Tarefas.Tarefas.Controler;

import Tarefas.Tarefas.Model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tarefas")


public class TarefaController {
    private final List<Tarefas> tarefas_lista = new ArrayList<>();

    @GetMapping
    public List<Tarefas> getAllTarefas(){
        return tarefas_lista;
    }
    @PostMapping
    public Tarefas addTarefas(@RequestBody Tarefas tarefas) {
        tarefas_lista.add(tarefas);
        return tarefas;
    }

    



}

