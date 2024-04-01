package br.com.primi.smartgames.service;

import br.com.primi.smartgames.model.Game;

import java.util.List;

//Contrato para implementação
// de GameService
public interface GameService {
    void addGame(Game game);

    List<Game> searchGames();

    Game searchGameById(Integer id);

    void updateGame(Integer id, Game game);

    void deleteGame(Integer id);
}
