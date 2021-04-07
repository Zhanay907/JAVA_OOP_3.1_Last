package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioAdvancedTest {

    @Test
    public void shouldChangeSoundVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());
        radio.setCurrentSoundVolume(7);
        assertEquals(7, radio.getCurrentSoundVolume());

    }
    @Test
    public void shouldChangeRadioStation() {
        int[] RadioStation = {0,1,2,3,4,5,6,7,8,9};
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());


    }

}
