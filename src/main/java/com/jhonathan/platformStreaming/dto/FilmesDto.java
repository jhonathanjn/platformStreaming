package com.jhonathan.platformStreaming.dto;

import com.jhonathan.platformStreaming.model.Filmes;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

public class FilmesDto {
    private Long id;
    private String name;
    private Integer year;
    private String elenco;
    private String genero;
    private String imgUrl;
    private String score;
    private String description;

    public FilmesDto(){}

    public FilmesDto(Filmes entity){
        BeanUtils.copyProperties(entity, this);
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
