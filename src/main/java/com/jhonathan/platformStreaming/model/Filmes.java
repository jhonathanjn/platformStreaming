package com.jhonathan.platformStreaming.model;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tb_filmes")
public class Filmes {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "game_year")
    private Integer year;
    private String elenco;
    private String genero;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Filmes(){
    }

    public Filmes(Long id, String name,Integer year, String elenco, String genero, String description) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.elenco = elenco;
        this.genero = genero;
        this.description = description;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filmes filmes = (Filmes) o;
        return Objects.equals(id, filmes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
