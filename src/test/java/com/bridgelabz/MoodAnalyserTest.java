package com.bridgelabz;
//Importing Java Packages
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
   /*
   Test To Given Message Sad Mood Should Return Sad
   Defining moodAnalyser Object
    */
    @Test
    public void givenMessage_IAmInSadMoodMessage_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I AM In Sad Mood");
        try {
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
    /*
    Test To Given Message Any Mood Should Return Happy
    Giving Any Mood Message It Return Happy
     */
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
    /*
    Test To Given Message Null Mood Should Throw Exception
    And Print Exception Type
    And Print The Exception Message
     */
    @Test
    public void givenMessage_EmptyShouldReturnEmptyException(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        //Calling AnalyseMood Method And Giving Input Message
        try {
          moodAnalyser.analyseMood("");
            //Catch Block For MoodAnalyserException Handling
        }catch(MoodAnalyserException ex){
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,ex.type);
           System.out.println(ex.getMessage());//Printing The Exception Message
            ex.printStackTrace();//Trace The Where Exception Is Occuring
        }
    }

    /*
    Test To Given Message Null Mood Should Throw Exception
    And Print Exception Type
    And Print The Exception Message
     */
    @Test
    public void givenMessage_NullMessage_ShouldReturnNullException(){
        //Defining moodAnalyser Object
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        //Calling AnalyseMood Method And Giving Input Message
        try {
            moodAnalyser.analyseMood("");
            //Catch Block For MoodAnalyserException Handling
        }catch(MoodAnalyserException ex){
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,ex.type);
            System.out.println(ex.getMessage());//Printing The Exception Message
            ex.printStackTrace();//Trace The Where Exception Is Occuring
        }
    }
}