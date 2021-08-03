package com.bridgelabz;
//Importing Java Packages
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    //Test To Given Message Sad Mood Should Return Sad
    @Test
    public void givenMessage_IAmInSadMoodMessage_ShouldReturnSad(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        //Calling AnalyseMood Method And Giving Input Message
        String   mood = moodAnalyser.analyseMood("I Am In Sad Mood");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(mood, "SAD");
    }
}