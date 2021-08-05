package com.bridgelabz;
import javax.swing.*;
/*
Declaring MoodAnalyser Class
 */
public class MoodAnalyser {
    //Declaring message Variable AS Private
    private String message;
    //Default Constructor
    public MoodAnalyser() {
    }
    /*
    Parametarized Constructor
    Initializing The Variables
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }
    /*
    Declaring analyseMood Method With Throws Of MoodAnalyserException
    If Condition To Compare The Message Is Null Throw Exception Message
     */
    public String analyseMood(String message) throws MoodAnalyserException {
        try {
            if (this.message.isEmpty())
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter Valid Mood");
            //If Condition To Check Message Contains Sad Print Sad
             if (this.message.contains("Sad")) {
                return "SAD";
            }  //Else Print Happy
            else {
                return "HAPPY";
            }
        }catch (NullPointerException e) {
            //If Null Point Of Exception Is Occur Print The Exception Type And Message
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Please enter Valid Mood");
        }
    }
}