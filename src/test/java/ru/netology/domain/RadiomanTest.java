package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    public void increaseVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(5);
        radioman.increaseVolume();
        int expected = 6;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        radioman.increaseVolume();
        int expected = 0;

        assertEquals(expected, radioman.getMinVolume());
    }

    @Test
    public void increaseVolumeMax() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(10);
        radioman.increaseVolume();
        int expected = 10;

        assertEquals(expected, radioman.getMaxVolume());
    }

    @Test
    public void decreaseVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        radioman.decreaseVolume();
        int expected = 0;

        assertEquals(expected, radioman.getMinVolume());
    }

    @Test
    public void decreaseVolumeMax() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(10);
        radioman.decreaseVolume();
        int expected = 10;

        assertEquals(expected, radioman.getMaxVolume());
    }

    @Test
    public void decreaseVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(5);
        radioman.decreaseVolume();
        int expected = 4;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(5);
        int expected = 5;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMax() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(10);
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnder() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOver() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(15);
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void nextRadioStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(6);
        radioman.nextRadioStation();
        int expected = 7;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(6);
        radioman.prevRadioStation();
        int expected = 5;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(6);
        int expected = 6;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMax() {
        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(0);
        radioman.prevRadioStation();
        int expected = 9;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMin() {
        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(9);
        radioman.nextRadioStation();
        int expected = 0;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationUnder() {
        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationOver() {
        Radioman radioman = new Radioman();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(15);
        int expected = 9;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }
}