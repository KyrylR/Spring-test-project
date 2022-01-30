package ua.univ;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.setMusic(music);
        musicPlayer.playMusic();
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        secondMusicPlayer.setPrice(222);
//        System.out.println("Price: " + musicPlayer.getPrice());
//        System.out.println("Price: " + secondMusicPlayer.getPrice());
//        System.out.println("Name: " + musicPlayer.getName());

        context.close();
    }
}
