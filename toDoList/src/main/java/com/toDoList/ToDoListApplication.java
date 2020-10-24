package com.toDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApplication.class, args);
    }
}

/*
Exercício Todo list...

> Cadastrar uma tarefa
> Listar uma tarefa
> Listar todas as tarefas
> Listar todas as tarefas concluidas
> Listar todas as tarefas nao concluidas
> Remover uma tarefa
> Atualizar uma tarefa

> Criar um novo endpoint para que quando receber o request '/{id}/description' listar apenas a descrição do TODO
                                                                                                             */
