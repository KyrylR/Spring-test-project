package ua.univ.musicType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
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

    @PostConstruct
    public void doMyInit() {
        System.out.println("Init ClassicalMusic");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy ClassicalMusic");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}
