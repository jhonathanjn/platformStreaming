package com.jhonathan.platformStreaming.dto;

import com.jhonathan.platformStreaming.model.FilmesList;
import jakarta.persistence.Id;

public class FilmesListDto {
    @Id
    private Long id;
    private String name;

    public FilmesListDto(){}

    public FilmesListDto(FilmesList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
