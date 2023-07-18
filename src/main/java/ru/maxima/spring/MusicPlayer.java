package ru.maxima.spring;

import java.util.List;

public class MusicPlayer {
    private Radio radio;

    private String nameOfRadioFrequency;

    private List<Radio> radioList;
    private double startRadio;
    private double endRadio;

    public MusicPlayer() {
    }

    public List<Radio> getRadioList() {
        return radioList;
    }

    public void setRadioList(List<Radio> radioList) {
        this.radioList = radioList;
    }

    public MusicPlayer(List<Radio> radioList) {
        this.radioList = radioList;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Radio getRadio() {
        return radio;
    }

    public String getNameOfRadioFrequency() {
        return nameOfRadioFrequency;
    }

    public double getStartRadio() {
        return startRadio;
    }

    public double getEndRadio() {
        return endRadio;
    }

    public void setNameOfRadioFrequency(String nameOfRadioFrequency) {
        this.nameOfRadioFrequency = nameOfRadioFrequency;
    }

    public void setStartRadio(double startRadio) {
        this.startRadio = startRadio;
    }

    public void setEndRadio(double endRadio) {
        this.endRadio = endRadio;
    }

    public void playMusic() {
        radioList.forEach(radio1 -> System.out.println(radio1.getSong()));
    }

}
