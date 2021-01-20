package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {

    Radioman radioman = new Radioman();

    @Test
    public void increaseVolume() {
        radioman.setCurrentVolume(5);
        radioman.increaseVolume();

        assertEquals(6, radioman.getCurrentVolume());
    }

    /*@Test
    public void increaseVolumeMin() {
        radioman.setCurrentVolume(0);
        radioman.increaseVolume();

        assertEquals(0, radioman.getMinVolume());
    }
    */

    @Test
    public void increaseVolumeMax() {
        radioman.setCurrentVolume(100);
        radioman.increaseVolume();

        assertEquals(10, radioman.getMaxVolume());
    }

    /*@Test
    public void decreaseVolumeMin() {
        radioman.setCurrentVolume(0);
        radioman.decreaseVolume();

        assertEquals(0, radioman.getMinVolume());
    }
    */

    @Test
    public void decreaseVolumeMax() {
        radioman.setCurrentVolume(100);
        radioman.decreaseVolume();

        assertEquals(100, radioman.getMaxVolume());
    }

    @Test
    public void decreaseVolume() {
        radioman.setCurrentVolume(5);
        radioman.decreaseVolume();

        assertEquals(4, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        radioman.setCurrentVolume(5);

        assertEquals(5, radioman.getCurrentVolume());
    }

    /*@Test
    public void setCurrentVolumeMin() {
        radioman.setCurrentVolume(0);

        assertEquals(0, radioman.getCurrentVolume());
    }
    */

    @Test
    public void setCurrentVolumeMax() {
        radioman.setCurrentVolume(10);

        assertEquals(10, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnder() {
        radioman.setCurrentVolume(-1);

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOver() {
        radioman.setCurrentVolume(115);

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    public void nextRadioStation() {
        radioman.setCurrentRadioStation(6);
        radioman.nextRadioStation();

        assertEquals(7, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        radioman.setCurrentRadioStation(6);
        radioman.prevRadioStation();

        assertEquals(5, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation() {
        radioman.setCurrentRadioStation(6);

        assertEquals(6, radioman.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMax() {
        radioman.setCurrentRadioStation(0);
        radioman.prevRadioStation();

        assertEquals(9, radioman.getCurrentRadioStation());
    }

    /*@Test
    public void prevRadioStationMin() {
        radioman.setCurrentRadioStation(9);
        radioman.nextRadioStation();

        assertEquals(0, radioman.getCurrentRadioStation());
    }
    */

    @Test
    public void setCurrentRadioStationUnder() {
        radioman.setCurrentRadioStation(-1);

        assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationOver() {
        radioman.setCurrentRadioStation(15);

        assertEquals(9, radioman.getCurrentRadioStation());
    }
}