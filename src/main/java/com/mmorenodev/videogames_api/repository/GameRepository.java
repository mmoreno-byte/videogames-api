package com.mmorenodev.videogames_api.repository;

import com.mmorenodev.videogames_api.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByGenreIgnoreCase(String genre);
    List<Game> findByPlatformIgnoreCase(String platform);
    List<Game> findByTitleContainingIgnoreCase(String title);
}