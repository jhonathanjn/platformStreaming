package com.jhonathan.platformStreaming.services;

import com.jhonathan.platformStreaming.dto.FilmesListDto;
import com.jhonathan.platformStreaming.dto.FilmesMinDto;
import com.jhonathan.platformStreaming.model.Filmes;
import com.jhonathan.platformStreaming.model.FilmesList;
import com.jhonathan.platformStreaming.repository.FilmesListRepository;
import com.jhonathan.platformStreaming.repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class FIlmesListService {

    @Autowired
    private FilmesListRepository filmesListRepository;

    @Autowired
    private FilmesRepository filmesRepository;

    @Transactional(readOnly = true)
    public List<FilmesListDto> findAll(){
        List<FilmesList> result = filmesListRepository.findAll();
        return result.stream().map(x -> new FilmesListDto(x)).toList();
    }

    @Transactional(readOnly = true)
    public FilmesListDto findById(Long id){
        FilmesList result = filmesListRepository.findById(id).get();
        return new FilmesListDto(result);
    }



}
