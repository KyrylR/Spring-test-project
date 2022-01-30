package ua.univ;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
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
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
