package com.example.Task.Manager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Indica que essa classe será uma tabela no banco de dados.
@Data  //(do Lombok) → Gera automaticamente getters, setters, toString e equals.
@NoArgsConstructor  //Criam construtores automáticos.
@AllArgsConstructor //Criam construtores automáticos.
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Define o ID como chave primária auto incrementável.
    private Long id;

    private String titulo;
    private String descricao;
    private boolean completado;

}
