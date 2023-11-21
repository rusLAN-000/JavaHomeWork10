package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void howManyStations() {
        radio.setCurrentStation(11);
        int expected = 10;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void randomStation() {
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinStation() {
        Radio radio = new Radio(12);

        radio.setCurrentStation(-1);
        int expected = 11;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStation() {
        Radio radio = new Radio(12);

        radio.setCurrentStation(13);
        int expected = 11;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        radio.setCurrentStation(3);
        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {
        radio.setCurrentStation(10);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMin() {
//        Radio radio = new Radio();
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
    public void shouldSetPrevVolume() {
        radio.setVolume(45);
        radio.turnDownTheVolume();

        int expected = 44;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolumeZero() {
        radio.setVolume(0);
        radio.turnDownTheVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

}