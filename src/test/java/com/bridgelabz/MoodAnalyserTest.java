package com.bridgelabz;
//Importing Java Packages
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
   //Test To Given Message Sad Mood Should Return Sad
    @Test
    public void givenMessage_IAmInSadMoodMessage_ShouldReturnSad(){
        //Defining moodAnalyser Object
        try{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I AM In Sad Mood");
       // try {
            //Calling AnalyseMood Method And Giving Input Message
            String mood = moodAnalyser.analyseMood("");
            //Asserting The Result As Boolean Type True Or False
            Assertions.assertEquals("SAD", mood);
            System.out.println(mood);
            //Catch Block For MoodAnalyserException Handling
        } catch(MoodAnalyserException ex){
                System.out.println(ex.getMessage());//Printing The Exception Message
                ex.printStackTrace();//Trace Where Exception Is Occuring
            }
    }
    //Test To Given Message Any Mood Should Return Happy
    @Test
    public void givenMessage_IAmInAnyMoodMessage_ShouldReturnHappy(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Any Mood");
        //Calling AnalyseMood Method And Giving Input Message
        try{
        String  mood = moodAnalyser.analyseMood("");
            //Asserting The Result As Boolean Type True Or False
            Assertions.assertEquals(mood, "HAPPY");
            System.out.println(mood);
            //Catch Block For MoodAnalyserException Handling
        }catch(MoodAnalyserException ex){
            System.out.println(ex.getMessage());//Printing The Exception Message
            ex.printStackTrace();//Trace Where Exception Is Occuring
        }
   }
    //Test To Given Message Null Mood Should Throw Exception
    @Test
    public void givenMessage_NullMood_ShouldReturnHappy(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        //Calling AnalyseMood Method And Giving Input Message
        try {
         String mood = moodAnalyser.analyseMood("");
            Assertions.assertEquals("HAPPY", mood);
            System.out.println(mood);
            //Catch Block For MoodAnalyserException Handling
        }catch(MoodAnalyserException ex){
            System.out.println(ex.getMessage());//Printing The Exception Message
            ex.printStackTrace();//Trace The Where Exception Is Occuring
        }
    }
}