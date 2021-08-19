package com.tw.jbc.moods;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;




public class MoodAnalyserTest {

    @Test
    public void testSadMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        assertEquals("SAD", mood);
    }

    @Test
    void testHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a happy message");
        assertEquals("HAPPY", mood);
    }
}
