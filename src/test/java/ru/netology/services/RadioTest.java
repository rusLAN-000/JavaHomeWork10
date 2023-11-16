package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldMaxStation() {
        radio.setCurrentStation(25);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinStation() {
        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationWithinTheBorder() {
        radio.setCurrentStation(3);

        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        radio.setCurrentStation(4);

        radio.prevStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationWithinTheBorder() {
        radio.setCurrentStation(0);

        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetVolume() {
        radio.setVolume(29);
        int expected = 29;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetMaxVolume() {
        radio.setVolume(101);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetMinVolume() {
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume() {
        radio.setVolume(94);
        radio.increaseVolume();
        int expected = 95;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume100() {
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevVolume(){
        radio.setVolume(45);
        radio.turnDownTheVolume();
        int expected = 44;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetPrevVolumeZero(){
        radio.setVolume(0);
        radio.turnDownTheVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected,actual);
    }

}