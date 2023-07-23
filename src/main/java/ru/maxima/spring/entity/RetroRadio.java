package ru.maxima.spring.entity;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RetroRadio implements Radio {
    private final String name;


    private final List<String> trackList;

    public RetroRadio(String name, List<String> trackList) {
        this.name = name;
        this.trackList = trackList;
    }

    public List<String> getTrackList() {
        return trackList;
    }

    @Override
    public String getSong()
    {
        Random random = new Random();
        return getTrackList().get(random.nextInt(trackList.size()));
    }

    @Override
    public String getName() {
        return this.name;
    }
}
