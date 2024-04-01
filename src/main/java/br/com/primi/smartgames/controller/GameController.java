package br.com.primi.smartgames.controller;

import br.com.primi.smartgames.model.Game;
import br.com.primi.smartgames.repository.GameRepository;
import br.com.primi.smartgames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//endpoint de requisição dos jogos
//localhost:8080/games
@CrossOrigin("*")
@RestController
@RequestMapping("games")
public class GameController {
    @Autowired
    GameService service;

    //Retorna uma lista de jogos
    @GetMapping
    public List<Game> getAllGames() {
        return service.searchGames();
    }

    //Retorna apenas o jogo
    // do id especificado no param
    @GetMapping("/get")
    public Game getGame(@RequestParam Integer id) {
        return service.searchGameById(id);
    }

    //Cria um novo jogo
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/create-game")
    public String postGame(@RequestBody Game game) {
        service.addGame(game);
        return "Success add game";
    }

    //Atualiza informações do jogo
    // do id especificado no param
    @PutMapping("/update-game/{id}")
    public String putGame(@PathVariable Integer id, @RequestBody Game game) {
        service.updateGame(id, game);
        return "Success update game";
    }

    //Remove o jogo
    // do id especificado no param
    @DeleteMapping("/delete-game/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String deleteGame(@PathVariable Integer id) {
        service.deleteGame(id);
        return "Success delete game";
    }
}
