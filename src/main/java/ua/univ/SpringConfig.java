package ua.univ;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.univ")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public MondayMusic mondayMusic() {
        return new MondayMusic();
    }
}
