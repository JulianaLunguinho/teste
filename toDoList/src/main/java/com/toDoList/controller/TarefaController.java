package com.toDoList.controller;

import com.toDoList.entity.Tarefa;
import com.toDoList.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lista")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping
    public List<Tarefa> getTodasTarefas() {
        return service.listarTarefas();
    }

    @GetMapping("/{id}")
    public Tarefa getTarefasID(@PathVariable("id") Integer id){
        return service.getTarefaById(id);
    }

    @GetMapping("/ativas")
    public List<Tarefa> getTarefasNaoConcluidas(){
        return service.listarNaoConcluidas();
    }

    @PostMapping
    public ResponseEntity<Tarefa> salvarTarefa(@RequestBody Tarefa tarefa) {
        service.salvarTarefa(tarefa);
        return ResponseEntity.ok(tarefa);
    }
}
