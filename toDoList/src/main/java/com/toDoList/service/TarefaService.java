package com.toDoList.service;

import com.toDoList.entity.Tarefa;
import com.toDoList.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public void salvarTarefa(Tarefa tarefa) {
        repository.save(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return (List<Tarefa>) repository.findAll();
    }

    public Tarefa getTarefaById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Tarefa> listarNaoConcluidas(){
        return repository.findByActiveTrue();
    }

    public List<Tarefa> listarConcluidas(){
        return repository.findByActiveFalse();
    }

    public void removeTarefaById(Integer id){
        repository.deleteById(id);
    }
}
