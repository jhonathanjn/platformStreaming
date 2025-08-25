package com.jhonathan.platformStreaming.dto;

import com.jhonathan.platformStreaming.model.Filmes;
import com.jhonathan.platformStreaming.projection.FIlmesMinProjection;
import jakarta.persistence.Column;

public class FilmesMinDto {
    private Long id;
    private String name;
    private String imgUrl;

    public FilmesMinDto(){}

    public FilmesMinDto(Filmes entity){
        id = entity.getId();
        name = entity.getName();
        imgUrl = entity.getImgUrl();
    }

    public FilmesMinDto(FIlmesMinProjection projection){
        id = projection.getId();
        name = projection.getName();
        imgUrl = projection.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
