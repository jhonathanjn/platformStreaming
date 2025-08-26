package com.jhonathan.platformStreaming.services;

import com.jhonathan.platformStreaming.dto.FilmesDto;
import com.jhonathan.platformStreaming.dto.FilmesListDto;
import com.jhonathan.platformStreaming.dto.FilmesMinDto;
import com.jhonathan.platformStreaming.model.Filmes;
import com.jhonathan.platformStreaming.model.FilmesList;
import com.jhonathan.platformStreaming.repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmesRepository filmesRepository;
    @Transactional(readOnly = true)
    public List<FilmesMinDto> findAll(){
        List<Filmes> result = filmesRepository.findAll();
        return result.stream().map(x -> new FilmesMinDto(x)).toList();

    }

    @Transactional(readOnly = true)
    public FilmesDto findById(Long id){
        Filmes result = filmesRepository.findById(id).get();
        return new FilmesDto(result);
    }

    @Transactional(readOnly = true)
    public List<FilmesDto> findByNomeParcial(String name) {
        List<Filmes> filmes = filmesRepository.findByNameContainingIgnoreCase(name);
        return filmes.stream().map(FilmesDto::new).toList();
    }



}
