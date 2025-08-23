package com.jhonathan.platformStreaming.repository;

import com.jhonathan.platformStreaming.model.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmesRepository extends JpaRepository<Long, Filmes> {
}
