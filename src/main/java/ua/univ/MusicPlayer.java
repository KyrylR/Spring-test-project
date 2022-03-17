package ua.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ua.univ.musicType.ClassicalMusic;
import ua.univ.musicType.MondayMusic;
import ua.univ.musicType.Music;
import ua.univ.musicType.RockMusic;
import ua.univ.utils.MusicGenre;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.price}")
    private int price;

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Autowired
    public void setMusic(ClassicalMusic music1, RockMusic music2, MondayMusic music3) {
        this.musicList.add(music1);
        this.musicList.add(music2);
        this.musicList.add(music3);
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(MusicGenre genre) {
        Random rand = new Random();
        int rndNum = rand.nextInt(3);
        System.out.println("Playing: " + musicList.get(genre == MusicGenre.CLASSICAL ? 0 : 1).getSongs().get(rndNum));
        //for (Music item : musicList) System.out.println("Playing: " + item.getSongs().get(rndNum));
    }

    public void testDestroy() {
        System.out.println("Dest MP");
    }
}
