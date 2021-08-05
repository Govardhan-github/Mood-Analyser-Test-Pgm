package com.bridgelabz;
/*
Declaring The MoodAnalyserException extends exception
Declaring Enum Exception Type And Declaring Null And Empty
 */
public class MoodAnalyserException extends Exception {
    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY;
    }
    //Declaring Type As Variable
    ExceptionType type;
    //Using Parametarised Exception Constructor
    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
}
