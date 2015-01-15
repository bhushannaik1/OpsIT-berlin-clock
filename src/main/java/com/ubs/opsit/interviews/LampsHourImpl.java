package com.ubs.opsit.interviews;

/**
 * Created by VNAIKBH on 1/14/2015.
 */
public class LampsHourImpl implements Lamps {



    @Override
    public String getLamps(int unit) {

        //first row, 5 hours each
        int hoursDividedBy5 = unit / MULTIPLE_OF_FIVE;

        //second row, 1 hours each
        int hoursModulus5 = unit % MULTIPLE_OF_FIVE;

        return getLampsForHoursOfFive(hoursDividedBy5) + "\r\n" + getLampsForHoursOfFive(hoursModulus5);

    }

    public String getLampsForHoursOfFive(int hours) {

        //initialize lights O
        StringBuilder lamps = new StringBuilder(ALL_LIGHTS_OFF);

        for (int i = 0; i < hours; i++) {
            lamps.replace(i, i + 1, RED_LIGHT);
        }
        return lamps.toString();
    }

}
