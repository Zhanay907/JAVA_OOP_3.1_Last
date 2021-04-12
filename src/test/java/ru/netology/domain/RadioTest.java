package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void test() {
        Radio fm = new Radio(11, 55, 0,
                25, 55, 0);

        fm.setCurrentSoundVolume(5);
        fm.setCurrentRadioStation(50);
        assertEquals(5, fm.getCurrentSoundVolume());
        assertEquals(50, fm.getCurrentRadioStation());

        System.out.println(fm.getCurrentSoundVolume());
        System.out.println(fm.getCurrentRadioStation());


    }

    @Test
    public void changSoundVolume() {
        Radio fm = new Radio(1, 50,
                0, 5,
                20, 0);

        fm.setCurrentSoundVolume(7);
        assertEquals(7, fm.getCurrentSoundVolume());
        System.out.println(fm.getCurrentSoundVolume());
    }

    @Test
    public void changSoundVolume1() {
        Radio fm = new Radio(100, 0);
        fm.setCurrentSoundVolume(-10);
        assertEquals(0, fm.getCurrentSoundVolume());

        System.out.println(fm.getCurrentSoundVolume());

    }

    @Test
    public void changSoundVolume2() {
        Radio fm = new Radio(100, 0);

        fm.setCurrentSoundVolume(105);
        assertEquals(100, fm.getCurrentSoundVolume());

        System.out.println(fm.getCurrentSoundVolume());

    }

    @Test
    public void changRadioStation() {
        Radio fm = new Radio(5, 10, 0);
        fm.setCurrentRadioStation(-5);
        assertEquals(0, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

        fm.setCurrentRadioStation(7);
        assertEquals(7, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

        fm.setCurrentRadioStation(15);
        assertEquals(10, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStation() {
        Radio fm = new Radio(5, 10, 0);

        fm.setCurrentRadioStation(10);
        fm.nextCurrentStation();
        assertEquals(0, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

        fm.setCurrentRadioStation(9);
        fm.nextCurrentStation();
        assertEquals(10, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

    }

    @Test
    public void prevRadioStation() {
        Radio fm = new Radio(5, 10, 0);

        fm.setCurrentRadioStation(7);
        fm.prevCurrentStation();

        assertEquals(6, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

        fm.setCurrentRadioStation(0);
        fm.prevCurrentStation();
        assertEquals(10, fm.getCurrentRadioStation());
        System.out.println(fm.getCurrentRadioStation());

    }

}
