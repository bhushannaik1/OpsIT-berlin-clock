package com.ubs.opsit.interviews;

/**
 * Created by VNAIKBH on 1/13/2015.
 */
public class TimeConverterImpl implements  TimeConverter{

    @Override
    public String convertTime(String aTime) {

        if (!aTime.matches("\\d\\d:\\d\\d:\\d\\d")) {
            throw new IllegalArgumentException("Time must be in the format HH:MM:SS");
        }

        StringBuilder timeSB = new StringBuilder();
        String[] timeElements = aTime.split(":");

        timeSB.append(new LampsSecondImpl().getLamps(Integer.parseInt(timeElements[2]))).append("\r\n");
        timeSB.append(new LampsHourImpl().getLamps(Integer.parseInt(timeElements[0]))).append("\r\n");
        timeSB.append(new LampsMinuteImpl().getLamps(Integer.parseInt(timeElements[1])));

        //System.out.println("****Bhushan****"+timeSB.toString().trim());
        return timeSB.toString();

    }
}
