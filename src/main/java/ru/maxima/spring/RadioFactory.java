package ru.maxima.spring;

import java.util.ArrayList;
import java.util.List;

public class RadioFactory {
    public Radio createRockRadio() {
        return new RockRadio();
    }
    public Radio createRetroRadio() {
        return new RetroRadio();
    }
    public Radio createDachaRadio() {
        return new DachaRadio();
    }



}
