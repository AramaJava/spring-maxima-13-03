package ru.maxima.spring;

public class MusicPlayer {
    private Radio radio;

    private String nameOfRadioFrequency;

    private double startRadio;
    private double endRadio;

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
        System.out.println("On air: \n" +  radio.getSong());
    }

}
