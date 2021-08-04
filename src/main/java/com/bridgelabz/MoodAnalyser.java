package com.bridgelabz;
//Declaring MoodAnalyser Class
public class MoodAnalyser {
    //Declaring message Variable AS Private
    private  String message;
    //Default Constructor
    public MoodAnalyser(){
    }
    //Parametarized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }
    //Declaring analyseMood Method With Throws Of MoodAnalyserException
    public String analyseMood(String message) throws MoodAnalyserException {
        //If Condition To Compare The Message Is Null Throw Exception Message
        if(this.message == null ) {
            throw new MoodAnalyserException ("Please enter Valid Mood");
      }
        //If Condition To Check Message Contains Sad Print Sad
        if(this.message.contains("Sad"))
            return "SAD";
        else//Else Print Happy
            return "HAPPY";
    }
}