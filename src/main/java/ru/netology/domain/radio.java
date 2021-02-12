package ru.netology.domain;

public class radio {
    private static String name;
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private boolean next;
    private boolean prev;
    private boolean on;

    public static String getName() {
        return name;
    }

    public static void setName(String newName) {
        name = newName;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation > maxStation){
            currentStation = minStation;
        }
        if(currentStation < minStation){
            currentStation = maxStation;
        }
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
        if(currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if(currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isNext() {
        return next;
    }

    public void setNext(boolean next) {
        if(next = true){
            setCurrentStation(currentStation + 1);
        }
        this.next = next;
    }

    public boolean isPrev() {
        return prev;
    }

    public void setPrev(boolean prev) {
        if(prev = true){
            setCurrentStation(currentStation - 1);
        }
        this.prev = prev;
    }
}
