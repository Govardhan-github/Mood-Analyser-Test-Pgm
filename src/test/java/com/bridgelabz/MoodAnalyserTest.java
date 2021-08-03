package com.bridgelabz;
//Importing Java Packages
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    //Test To Given Message Invalid Mood Should Return Sad By Using Exception Handling
    @Test
    public void givenMessage_IAmInSadMoodMessage_ShouldReturnSad(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        //Calling AnalyseMood Method And Giving Input Message
        String   mood = moodAnalyser.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    //Test To Given Message Invalid Mood Should Return Happy By Using Exception Handling
    @Test
    public void givenMessage_IAmInAnyMoodMessage_ShouldReturnHappy(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        //Calling AnalyseMood Method And Giving Input Message
        String   mood = moodAnalyser.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(mood, "HAPPY");
        System.out.println(mood);
    }
}