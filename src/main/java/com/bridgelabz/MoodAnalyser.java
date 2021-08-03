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
    //Declaring analyseMood Method
    public String analyseMood() {
        //Try Catch Block For Exception Handling
        try {
            //If Condition To Check Message Contains Sad Print Sad
            if (this.message.contains("Sad"))
                return "SAD";
            else//Else Print Happy
                return "HAPPY";
            //Executing The NullPointerException
        } catch (NullPointerException ex) {
            return "HAPPY";
        }
    }
}