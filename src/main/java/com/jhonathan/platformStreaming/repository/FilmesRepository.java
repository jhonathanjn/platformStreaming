package com.jhonathan.platformStreaming.repository;

import com.jhonathan.platformStreaming.model.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmesRepository extends JpaRepository<Filmes, Long> {
    List<Filmes> findByNameContainingIgnoreCase(String name);


}
