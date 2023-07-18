package ru.maxima.spring;

class DachaRadio implements Radio {
    private String name;

    public DachaRadio() {
        System.out.println("dachaRadio create bean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSong() {
        return "Ruki Vverx - kroshka moya";
    }
}
