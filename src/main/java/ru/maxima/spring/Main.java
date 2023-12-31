package ru.maxima.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.maxima.spring.config.SpringConfig;
import ru.maxima.spring.entity.MusicPlayer;

public class Main {
    public static void main(String[] args) {

         /*
           Необходимо создать лист из радиостанций и подавать его в конструктор плееру.
           В каждой радиостанции необходимо крутить несколько треков (не один).
           Пусть каждый запуск радио крутится рандомная песня.

         */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close();


    }
}
