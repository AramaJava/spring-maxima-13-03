package ru.maxima.spring.config;

import org.springframework.context.annotation.*;
import ru.maxima.spring.entity.*;

import java.util.Arrays;
import java.util.List;


/**
 * @author AramaJava 23.07.2023
 */
@Configuration
@ComponentScan("ru.maxima.spring")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(radioList());
    }

    @Bean
    public RetroRadio retroRadio() {
        List<String> trackList = Arrays.asList("ABBA - Dancing Queen","Синяя Птица - Белый теплоход","Наталья Ветлицкая - Изучай меня");
        return new RetroRadio("Ретро", trackList);
    }

    @Bean
    public RockRadio rockRadio() {
        List<String> trackList = Arrays.asList("Би-2 - Мой рок-н-ролл","Рок-острова - Белым снегом","Алиса - Все это рок-н-ролл");
        return new RockRadio("Рок", trackList);
    }

    @Bean
    public DachaRadio dachaRadio() {
        List<String> trackList = Arrays.asList("Руки Вверх - Крошка моя","Комбинация - Бухгалтер","Кай Метов - Вспомни меня");
        return new DachaRadio("Дача", trackList);
    }

    @Bean
    public List<Radio> radioList() {
        return Arrays.asList(dachaRadio(), retroRadio(), rockRadio());
    }


}
