package com.device.test;

import com.device.fan.CeilingFan;
import com.device.fan.FanState;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCeilingFan {

    @Test
    public void testCeilingFanSpeedChange() {
        //Initially setting Speed to OFF state
        FanState currentFanState = new FanState(FanState.Speed.OFF, false);
        CeilingFan ceilingFan_1 = new CeilingFan(currentFanState);

        //Changing Speed
        ceilingFan_1.pullSpeedCord();

        Assertions.assertEquals(FanState.Speed.LOW, ceilingFan_1.getFanState().getSpeed());
        Assertions.assertNotEquals(FanState.Speed.MEDIUM, ceilingFan_1.getFanState().getSpeed());

        //Setting Speed to HIGH state
        currentFanState.setSpeed(FanState.Speed.HIGH);
        CeilingFan ceilingFan_2 = new CeilingFan(currentFanState);

        //Changing Speed
        ceilingFan_2.pullSpeedCord();

        Assertions.assertEquals(FanState.Speed.OFF, ceilingFan_1.getFanState().getSpeed());
        Assertions.assertNotEquals(FanState.Speed.MEDIUM, ceilingFan_1.getFanState().getSpeed());
    }

    @Test
    public void testCeilingFanDirectionChange() {
        //Initially setting Direction to reverse state
        FanState currentFanState = new FanState(FanState.Speed.OFF, true);
        CeilingFan ceilingFan_1 = new CeilingFan(currentFanState);

        //Changing direction
        ceilingFan_1.changeDirection();

        Assertions.assertEquals(false, ceilingFan_1.getFanState().isReverseDirection());
        Assertions.assertNotEquals(true, ceilingFan_1.getFanState().isReverseDirection());

        //Changing direction from forward to reverse
        ceilingFan_1.changeDirection();

        Assertions.assertEquals(true, ceilingFan_1.getFanState().isReverseDirection());
        Assertions.assertNotEquals(false, ceilingFan_1.getFanState().isReverseDirection());
    }

}
