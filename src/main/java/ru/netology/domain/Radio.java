package ru.netology.domain;

public class Radio {

    private int currentSoundVolume=53;
    private int maxSoundVolume=100;
    private int minSoundVolume=0;
    private int currentRadioStation=7;
    private int maxRadioStation=10;
    private int minRadioStation=0;

    public Radio(int currentSoundVolume,
                 int maxSoundVolume,
                 int minSoundVolume,
                 int currentRadioStation,
                 int maxRadioStation,
                 int minRadioStation) {
        this.currentSoundVolume = currentSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
    }

    public Radio(int maxSoundVolume, int minSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
    }

    public Radio(int currentRadioStation, int maxRadioStation, int minRadioStation) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
    }

    //    public Radio() {
//    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }


    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }


    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            this.currentSoundVolume = maxSoundVolume;
            return;
        } else if (currentSoundVolume < minSoundVolume) {
            this.currentSoundVolume = minSoundVolume;
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        } else if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextCurrentStation() {
        if (currentRadioStation + 1 > maxRadioStation) {
            this.currentRadioStation = minRadioStation;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevCurrentStation() {
        if (currentRadioStation - 1 < minRadioStation) {
            this.currentRadioStation = maxRadioStation;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }

    }


}


