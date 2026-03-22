package com.mmorenodev.videogames_api.service;

import com.mmorenodev.videogames_api.model.Game;
import com.mmorenodev.videogames_api.repository.GameRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    public Game findById(Long id) {
        return gameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Videojuego no encontrado con id: " + id));
    }

    public List<Game> findByGenre(String genre) {
        return gameRepository.findByGenreIgnoreCase(genre);
    }

    public List<Game> findByPlatform(String platform) {
        return gameRepository.findByPlatformIgnoreCase(platform);
    }

    public List<Game> findByTitle(String title) {
        return gameRepository.findByTitleContainingIgnoreCase(title);
    }

    public Game save(Game game) {
        return gameRepository.save(game);
    }

    public Game update(Long id, Game updated) {
        Game existing = findById(id);
        existing.setTitle(updated.getTitle());
        existing.setGenre(updated.getGenre());
        existing.setStudio(updated.getStudio());
        existing.setReleaseYear(updated.getReleaseYear());
        existing.setRating(updated.getRating());
        existing.setPlatform(updated.getPlatform());
        existing.setDescription(updated.getDescription());
        return gameRepository.save(existing);
    }

    public void delete(Long id) {
        gameRepository.deleteById(id);
    }
}