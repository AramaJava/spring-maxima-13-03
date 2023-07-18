package ru.maxima.spring;

class RetroRadio implements Radio {
    private String name;

    public RetroRadio() {
        System.out.println("retroRadio create bean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSong() {
        return "Abba - Mama Mia";
    }
}
