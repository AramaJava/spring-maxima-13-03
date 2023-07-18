package ru.maxima.spring;

class RockRadio implements Radio {
    private String name;

    public RockRadio() {
        System.out.println("rockRadio create bean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSong() {
        return "Franz Ferdinand - Take me out";
    }
}
