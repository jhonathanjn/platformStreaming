package com.jhonathan.platformStreaming.controller;

import com.jhonathan.platformStreaming.dto.FilmesMinDto;
import com.jhonathan.platformStreaming.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/filmes")
public class FilmesController {

    @Autowired
    private FilmeService filmeService;
    @GetMapping
    public List<FilmesMinDto> findAll(){
//        List<FilmesMinDto> result = filmeService.findAll();
//        return result;

        return filmeService.findAll();
    }
}
