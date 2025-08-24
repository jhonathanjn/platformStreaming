package com.jhonathan.platformStreaming.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_movies_list")
public class FilmesList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public FilmesList(){
    }

    public FilmesList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
