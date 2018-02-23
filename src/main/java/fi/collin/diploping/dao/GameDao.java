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
            }

        };
    }

    public Collection<Game> getGames() {
        return this.games.values();
    }

    public Game getGameById(Integer id) {
        return this.games.get(id);
    }



}
