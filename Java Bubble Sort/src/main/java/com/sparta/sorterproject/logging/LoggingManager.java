package com.sparta.sorterproject.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingManager {
    private static Logger logger = Logger.getLogger("Java sorter app logger");

    public static void exceptionLog(String n){
        PropertyConfigurator.configure("log4j.properties");
        logger.warn(" User did not enter an int: USER INPUT: " + n);
    }
    public static void arrayLog(String arr){
        PropertyConfigurator.configure("log4j.properties");
        logger.warn("user created an array " + arr);
    }
    public static void timeLog(double time){
        PropertyConfigurator.configure("log4j.properties");
        logger.warn("time taken for sort " + time + " seconds");
    }

}
