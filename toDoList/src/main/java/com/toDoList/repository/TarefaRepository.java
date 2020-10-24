package com.toDoList.repository;

import com.toDoList.entity.Tarefa;
import org.springframework.data.repository.CrudRepository;

public interface TarefaRepository extends CrudRepository<Tarefa, Integer> {
}
