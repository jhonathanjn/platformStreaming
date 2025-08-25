package com.jhonathan.platformStreaming.repository;

import com.jhonathan.platformStreaming.model.Filmes;
import com.jhonathan.platformStreaming.model.FilmesList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmesListRepository extends JpaRepository<FilmesList, Long> {
}
