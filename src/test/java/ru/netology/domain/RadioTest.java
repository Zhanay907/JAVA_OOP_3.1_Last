package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void test() {
        Radio fm = new Radio();
        fm.setMinSoundVolume(0);
        fm.setMaxSoundVolume(10);
        fm.setCurrentRadioStation(5);

        assertEquals(10, fm.getMaxSoundVolume());

        System.out.println(fm.getCurrentRadioStation());
        System.out.println(fm.getMaxSoundVolume());
        System.out.println(fm.getMinSoundVolume());


    }

    @Test
    public void changSoundVolume() {
        Radio fm = new Radio();
        fm.setMinSoundVolume(0);
        fm.setMaxSoundVolume(10);

        assertEquals(0, fm.getCurrentSoundVolume());
        fm.setCurrentSoundVolume(-100);
        assertEquals(0, fm.getCurrentSoundVolume());

        System.out.println(fm.getMinSoundVolume());


        fm.setCurrentSoundVolume(110);
        assertEquals(10, fm.getCurrentSoundVolume());

        System.out.println(fm.getCurrentSoundVolume());

    }

    @Test
    public void changRadioStation() {
        Radio fm = new Radio();
        fm.setMinRadioStation(0);
        fm.setMaxRadioStation(9);
        assertEquals(0, fm.getCurrentRadioStation());

        fm.setCurrentRadioStation(99);
        assertEquals(9, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

        fm.setCurrentRadioStation(-10);
        assertEquals(0, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        Radio fm = new Radio();
        fm.setMinRadioStation(0);
        fm.setMaxRadioStation(9);

        fm.setCurrentRadioStation(7);
        fm.nextCurrentStation();

        assertEquals(8, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

        fm.setCurrentRadioStation(9);
        fm.nextCurrentStation();
        assertEquals(0, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

    }@Test
    public void prevRadioStation() {
        Radio fm = new Radio();
        fm.setMinRadioStation(0);
        fm.setMaxRadioStation(9);

        fm.setCurrentRadioStation(8);
        fm.prevCurrentStation();

        assertEquals(7, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

        fm.setCurrentRadioStation(0);
        fm.prevCurrentStation();
        assertEquals(9, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

    }

}
