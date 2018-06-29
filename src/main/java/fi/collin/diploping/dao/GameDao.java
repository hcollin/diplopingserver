package fi.collin.diploping.dao;

import fi.collin.diploping.Entities.Game;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class GameDao {

    private static Map<Integer, Game> games;


    static {

        games = new HashMap<Integer, Game>() {
            {
                put(1, new Game("tre-rope", "1111", "1111", "1111", "1111", "1111", "1111", "1111"));
                put(2, new Game("tre-rope 2", "1111", "1111", "1111", "1111", "1111", "1111", "1111"));
                put(3, new Game("tre-rope 3", "1111", "1111", "1111", "1111", "1111", "1111", "1111"));
            }

        };
    }

    public Collection<Game> getGames() {
        return this.games.values();
    }

    public Game getGameById(Integer id) {
        return this.games.get(id);
    }

    public void addNewGame(Integer id, Game game) {

    }



}
