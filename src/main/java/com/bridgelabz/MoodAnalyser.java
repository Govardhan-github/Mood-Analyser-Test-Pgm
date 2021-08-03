package com.bridgelabz;
//Declaring MoodAnalyser Class
public class MoodAnalyser {
    //Declaring analyseMood Method
    public String analyseMood(String Message) {
        //If Condition To Check Message Contains Sad Print Sad
        if(Message.contains("Sad"))
            return "SAD";
        else//Else Print Happy
            return "HAPPY";
    }
}