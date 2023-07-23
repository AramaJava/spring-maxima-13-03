package ru.maxima.spring.entity;

import org.springframework.stereotype.Component;

@Component
public interface Radio {

    String getSong();

    String getName();
}
