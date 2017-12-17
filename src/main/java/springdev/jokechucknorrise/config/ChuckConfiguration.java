package springdev.jokechucknorrise.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by oleht on 17.12.2017
 */
@Configuration
public class ChuckConfiguration {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
