package br.com.primi.smartgames.service.impl;

import br.com.primi.smartgames.model.Game;
import br.com.primi.smartgames.repository.GameRepository;
import br.com.primi.smartgames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public void addGame(Game game) {
        repository.save(game);
    }

    @Override
    public List<Game> searchGames() {
        return repository.findAll();
    }

    @Override
    public Game searchGameById(Integer id) {
        Game game = validGameById(id);
        return game;
    }

    @Override
    public void updateGame(Integer id, Game game) {
        validGameById(id);
        game.setId(id);
        repository.save(game);
    }

    @Override
    public void deleteGame(Integer id) {
        Game game = validGameById(id);
        repository.delete(game);
    }

    //valída se objeto existe,
    //caso não exista retorna
    // mensagem de exceção
    private Game validGameById(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Invalid game id" + id));
    }
}
