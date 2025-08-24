package com.jhonathan.platformStreaming.services;

import com.jhonathan.platformStreaming.dto.FilmesDto;
import com.jhonathan.platformStreaming.dto.FilmesMinDto;
import com.jhonathan.platformStreaming.model.Filmes;
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
        return result.stream().map(FilmesMinDto::new).toList();
    }

}
