package ru.maxima.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Homework {
    public static void main(String[] args) {
  //      ClassPathXmlApplicationContext context =
  //              new ClassPathXmlApplicationContext("ApplicationContext.xml");

/*  Создать лист бинов в applicationContext.xml (надо погуглить).
    Выводить в методе playMusic() все песни, которые играют
    на всех радиостанциях.
 */
        ApplicationContext context =
                 new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();


    }
}
