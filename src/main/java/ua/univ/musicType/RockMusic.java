package ua.univ.musicType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("RockMusic 1");
        songs.add("RockMusic 2");
        songs.add("RockMusic 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
