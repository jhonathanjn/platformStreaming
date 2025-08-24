package com.jhonathan.platformStreaming.dto;

import com.jhonathan.platformStreaming.model.Filmes;
import jakarta.persistence.Column;

public class FilmesMinDto {
    private Long id;
    private String name;
    private String genero;
    private String imgUrl;

    public FilmesMinDto(){}

    public FilmesMinDto(Filmes entity){
        id = entity.getId();
        name = entity.getName();
        genero = entity.getGenero();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
