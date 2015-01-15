package com.ubs.opsit.interviews;

/**
 * Created by VNAIKBH on 1/14/2015.
 */
public class LampsMinuteImpl implements Lamps {



    @Override
    public String getLamps(int unit) {

        //third row, 5 minute each row , (3rd 15 min, 6th 30 min , 9th 45 min - red)
        int minutesDividedBy5 = unit / MULTIPLE_OF_FIVE;

        //fourth row, 1 minute each row
        int minutesModulus5 = unit % MULTIPLE_OF_FIVE;

        return getLampsForMinutesMultiplesOfFive(minutesDividedBy5) + "\r\n" + getLampsForSingleMinutes(minutesModulus5);
    }

    private String getLampsForMinutesMultiplesOfFive(int minutes) {

        //initialize lights O, third row
        StringBuilder lamps = new StringBuilder(ALL_ELEVEN_LIGHTS_OFF);

        for (int i = 0; i < minutes; i++) {
            if (0 == (i + 1) % MINUTES_INTERVAL) {
                lamps.replace(i, i + 1, RED_LIGHT);
            } else {
                lamps.replace(i, i + 1, YELLOW_LIGHT);
            }
        }
        return lamps.toString();
    }

    private String getLampsForSingleMinutes(int minutes) {

        //initialize lights O ,fourth row
        StringBuilder lamps = new StringBuilder(ALL_FOUR_LIGHTS_OFF);

        for (int i = 0; i < minutes; i++) {
            lamps.replace(i, i + 1, YELLOW_LIGHT);
        }
        return lamps.toString();
    }
}
