package ru.netology.services;

import lombok.Getter;

public class Radio {
    @Getter
    private int maxStation;
    @Getter
    private int currentStation;
    private int currentVolume;

    public Radio(int amountStation) {
        this.maxStation = amountStation - 1;
    }

    public Radio() {
        this.maxStation = 10;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            newCurrentStation = 0;
        }
        if (newCurrentStation <= 0) {
            newCurrentStation = maxStation;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation < maxStation) {
            currentStation--;
        } else {
            currentStation = maxStation - 1;
        }
    }


    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            newVolume = 100;
        }
        if (newVolume < 0) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownTheVolume() {
        if (currentVolume > 0) {
            currentVolume--; // или сurrentVolume = currentVolume - 1; но тогда без else
        } else {
            currentVolume = 0;
        }
    }

}
