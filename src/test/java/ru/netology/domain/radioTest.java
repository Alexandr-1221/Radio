package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    public void validateChangeVolumeOverMax(){
        radio radio = new radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setCurrentVolume(11);
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeUnderMin(){
        radio radio = new radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolume(){
        radio radio = new radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        assertEquals(5,radio.getCurrentVolume());
    }

    @Test
    public void validateChangeStationOverMax(){
        radio radio = new radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setCurrentStation(9);
        radio.setNext(true);
        assertTrue(radio.isNext());
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void validateChangeStationUnderMin(){
        radio radio = new radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setPrev(true);
        assertTrue(radio.isPrev());
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    public void validateChangeStation(){
        radio radio = new radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setCurrentStation(5);
        assertEquals(5,radio.getCurrentStation());
    }


}