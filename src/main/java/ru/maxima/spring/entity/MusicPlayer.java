package ru.maxima.spring.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${nameOfRadioFrequency}")
    private String nameOfRadioFrequency;

    private final List<Radio> radioList;

    @Value("${startRadio}")
    private double startRadio;

    @Value("${endRadio}")
    private double endRadio;

    public MusicPlayer(List<Radio> radioList) {
        this.radioList = radioList;
    }


    public String playMusic() {
        Random random = new Random();
        Radio randomRadio = radioList.get(random.nextInt(radioList.size()));
        String randomSong = randomRadio.getSong();
        return "В эфире радио: " + randomRadio.getName() + ", на волнах которой звучит случайная песня: " + randomSong;
    }

}
