package com.ubs.opsit.interviews;

/**
 * Created by VNAIKBH on 1/14/2015.
 */
public interface Lamps {

    public static final String OFF_LIGHT = "O";
    public static final String ALL_LIGHTS_OFF = "OOOO";
    public static final String ALL_FOUR_LIGHTS_OFF = "OOOO";
    public static final String ALL_ELEVEN_LIGHTS_OFF = "OOOOOOOOOOO";

    public static final String RED_LIGHT = "R";
    public static final String YELLOW_LIGHT = "Y";
    public static final int MULTIPLE_OF_FIVE = 5;
    public static final int SECONDS_ON_OFF_TIME = 2;
    public static final int MINUTES_INTERVAL = 3;

    public String getLamps(int unit);
}
