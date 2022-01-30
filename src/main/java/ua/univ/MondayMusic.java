package ua.univ;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MondayMusic implements Music{
    private List<String> songs = new ArrayList<>();

    public MondayMusic() {
        songs.add("MondayMusic 1");
        songs.add("MondayMusic 2");
        songs.add("MondayMusic 3");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
