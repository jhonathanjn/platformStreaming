package com.jhonathan.platformStreaming.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BealongingPk id = new BealongingPk();

    private Integer position;

    public Belonging(){}

    public Belonging(Filmes filmes, FilmesList list, Integer position){
        id.setFilmes(filmes);
        id.setList(list);
        this.position = position;
    }

    public BealongingPk getId() {
        return id;
    }

    public void setId(BealongingPk id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
