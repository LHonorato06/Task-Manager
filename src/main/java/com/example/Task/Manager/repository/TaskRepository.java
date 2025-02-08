package com.example.Task.Manager.repository;

import com.example.Task.Manager.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
                                        //Permite operações como buscar, salvar e deletar tarefas
                                        //sem precisar escrever SQL manualmente.
}
