package ru.netology.domain;

public class Radio {
    private String name = "noname";
    private int currentStation;
    private int maxStation = 10;
    private int minStation;
    private int maxVolume = 100;
    private int minVolume;
    private int currentVolume;
    private boolean on;

    public Radio() {
    }

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
//        if(currentStation > maxStation){
//            currentStation = maxStation;
//        }
//        if(currentStation < minStation){
//            currentStation = minStation;
//        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void lowVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume--;
        }
    }

    public void highVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume++;
        }
    }
}
