package com.mmorenodev.videogames_api.controller;

import com.mmorenodev.videogames_api.model.Game;
import com.mmorenodev.videogames_api.service.GameService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<Game> getAll() {
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> getById(@PathVariable Long id) {
        return ResponseEntity.ok(gameService.findById(id));
    }

    @GetMapping("/genre/{genre}")
    public List<Game> getByGenre(@PathVariable String genre) {
        return gameService.findByGenre(genre);
    }

    @GetMapping("/platform/{platform}")
    public List<Game> getByPlatform(@PathVariable String platform) {
        return gameService.findByPlatform(platform);
    }

    @GetMapping("/search")
    public List<Game> search(@RequestParam String title) {
        return gameService.findByTitle(title);
    }

    @PostMapping
    public ResponseEntity<Game> create(@Valid @RequestBody Game game) {
        return ResponseEntity.ok(gameService.save(game));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Game> update(@PathVariable Long id,
                                       @Valid @RequestBody Game game) {
        return ResponseEntity.ok(gameService.update(id, game));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        gameService.delete(id);
        return ResponseEntity.noContent().build();
    }
}