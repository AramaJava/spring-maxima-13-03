package ru.maxima.spring.entity;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class DachaRadio implements Radio {
    private final String name;

    private final List<String> trackList;

    public DachaRadio(String name, List<String> trackList) {
        this.name = name;
        this.trackList = trackList;
    }

    @Override
    public String getName() {
        return this.name;
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
}
