package ru.maxima.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

//        TestBean testBean = context.getBean("firstBean", TestBean.class);
//        System.out.println(testBean.getName());

//        MusicPlayer musicPlayer = new MusicPlayer(context.getBean("rockRadio", RockRadio.class));

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1 == musicPlayer2);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getNameOfRadioFrequency());
        System.out.println(musicPlayer1.getStartRadio());
        System.out.println(musicPlayer1.getEndRadio());
        

        context.close();

    }
}
