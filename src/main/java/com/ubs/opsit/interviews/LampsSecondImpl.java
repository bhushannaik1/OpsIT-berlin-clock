package com.ubs.opsit.interviews;

/**
 * Created by VNAIKBH on 1/14/2015.
 */
public class LampsSecondImpl implements Lamps {
    @Override
    public String getLamps(int unit) {
        if (0 == unit%SECONDS_ON_OFF_TIME) {
            return YELLOW_LIGHT;
        }

        return OFF_LIGHT;
    }
}
