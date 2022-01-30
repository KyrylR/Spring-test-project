package ua.univ;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    public ClassicalMusic() {
        songs.add("ClassicalMusic 1");
        songs.add("ClassicalMusic 2");
        songs.add("ClassicalMusic 3");
    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Init ClassicalMusic");
    }

    public void doMyDestroy() {
        System.out.println("Destroy ClassicalMusic");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}
