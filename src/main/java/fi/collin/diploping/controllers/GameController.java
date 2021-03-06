package fi.collin.diploping.controllers;

import fi.collin.diploping.Entities.Game;
import fi.collin.diploping.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @RequestMapping(method = RequestMethod.GET)
    public Collection<Game> getAllGames() {
        System.out.print("GET GAMES");

        return gameService.getGames();
    }

    @RequestMapping(value = "/{jeejee}", method = RequestMethod.GET)
    public Game getGameById(@PathVariable("jeejee") Integer id) {
        return gameService.getGameById(id);
    }

    @RequestMapping(value = "/{id]", method = RequestMethod.DELETE)
    public void deleteGameById(@PathVariable("id") Integer id) {

    }


}
