package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    public void shouldInitFields(){
        Radio radio = new Radio();

        assertEquals("noname", radio.getName());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getCurrentVolume());
        assertFalse(radio.isOn());
    }

    @Test
    public void validateChangeVolumeOverMax(){
        Radio radio = new Radio(10, 100);
        radio.highVolume();
        assertEquals(100,radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeUnderMin(){
        Radio radio = new Radio(10, 0);
        radio.lowVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeHigh() {
        Radio radio = new Radio(10, 0);
        radio.highVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeLow() {
        Radio radio = new Radio(10, 5);
        radio.lowVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void validateChangeStationOverMax(){
        Radio radio = new Radio(10, 100);
        radio.nextStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void validateChangeToNextStation(){
        Radio radio = new Radio(5, 100);
        radio.nextStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    public void validateChangeToPrevStation(){
        Radio radio = new Radio(5, 100);
        radio.prevStation();
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    public void validateChangeStationUnderMin(){
        Radio radio = new Radio(0, 100);
        radio.prevStation();
        assertEquals(10,radio.getCurrentStation());
    }

    @Test
    public void validateChangeStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5,radio.getCurrentStation());
    }


}