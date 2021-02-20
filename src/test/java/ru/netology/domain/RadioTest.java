package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    public void validateChangeVolumeOverMax(){
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);
        radio.highVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeUnderMin(){
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        radio.lowVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeHidh(){
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        radio.highVolume();
        assertEquals(6,radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeLow(){
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        radio.lowVolume();
        assertEquals(4,radio.getCurrentVolume());
    }

    @Test
    public void validateChangeStationOverMax(){
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void validateChangeStationToNext(){
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    public void validateChangeStationUnderMin(){
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.prevStation();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    public void validateChangeStationToPrev(){
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(5);
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    public void validateChangeStation(){
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setCurrentStation(5);
        assertEquals(5,radio.getCurrentStation());
    }


}