package com.jhonathan.platformStreaming.controller;

import com.jhonathan.platformStreaming.dto.FilmesDto;
import com.jhonathan.platformStreaming.dto.FilmesMinDto;
import com.jhonathan.platformStreaming.model.Filmes;
import com.jhonathan.platformStreaming.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/filmes")
public class FilmesController {

    @Autowired
    private FilmeService filmeService;
    @GetMapping
    public List<FilmesMinDto> findAll(){
        List<FilmesMinDto> result = filmeService.findAll();
        return result;
    }

    @GetMapping("/busca")
    public ResponseEntity<List<FilmesDto>> buscarPorTrecho(@RequestParam String name){
        List<FilmesDto> result = filmeService.findByNomeParcial(name);
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/{id}")
    public FilmesDto findById(@PathVariable Long id){
        FilmesDto result = filmeService.findById(id);
        return result;
    }
}
