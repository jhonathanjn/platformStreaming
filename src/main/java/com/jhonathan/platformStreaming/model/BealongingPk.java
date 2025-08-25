package com.jhonathan.platformStreaming.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BealongingPk {

    @ManyToOne
    @JoinColumn(name = "filmes_id")
    private Filmes filmes;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private FilmesList list;

    public BealongingPk(){}

    public BealongingPk(Filmes filmes, FilmesList list){
        this.filmes = filmes;
        this.list = list;
    }

    public Filmes getFilmes() {
        return filmes;
    }

    public void setFilmes(Filmes filmes) {
        this.filmes = filmes;
    }

    public FilmesList getList() {
        return list;
    }

    public void setList(FilmesList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BealongingPk that = (BealongingPk) o;
        return Objects.equals(filmes, that.filmes) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmes, list);
    }
}
