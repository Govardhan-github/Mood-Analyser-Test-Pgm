package com.bridgelabz;
//Importing Java Packages
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    //Test To Given Message Sad Mood Should Return Sad
    @Test
    public void givenMessage_IAmInSadMoodMessage_ShouldReturnSad(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Sad Mood");
        //Calling AnalyseMood Method And Giving Input Message
        String   mood = moodAnalyser.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    //Test To Given Message Any Mood Should Return Happy
    @Test
    public void givenMessage_IAmInAnyMoodMessage_ShouldReturnHappy(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Any Mood");
        //Calling AnalyseMood Method And Giving Input Message
        String   mood = moodAnalyser.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(mood, "HAPPY");
        System.out.println(mood);
    }
    //Tc2.1
    //Test To Given Message Null Mood Should Return Happy
    @Test
    public void givenMessage_NullMood_ShouldReturnHappy(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        //Calling AnalyseMood Method And Giving Input Message
        String   mood = moodAnalyser.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertSame("HAPPY",mood);
        System.out.println(mood);
    }
}