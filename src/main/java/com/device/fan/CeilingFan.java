package com.device.fan;

import com.device.control.DirectionChangeable;
import com.device.control.SpeedChangeable;

public class CeilingFan implements Fan, SpeedChangeable, DirectionChangeable {
    public final FanState fanState;

    public FanState getFanState() {
        return fanState;
    }

    public CeilingFan() {
        this.fanState = new FanState();
    }

    public CeilingFan(FanState fanState) {
        this.fanState = fanState;
    }

    public void display () {
        String direction = this.fanState.isReverseDirection() ? "Reverse" :  "Forward";
        System.out.println("Speed is " + this.fanState.getSpeed() + " and Fan Direction is " + direction);
    }

    public void changeSpeed() {
        FanState.Speed currentSpeed = this.getFanState().getSpeed();

        switch(currentSpeed) {
            case OFF:
                this.getFanState().setSpeed(FanState.Speed.LOW);
                break;
            case LOW:
                this.getFanState().setSpeed(FanState.Speed.MEDIUM);
                break;
            case MEDIUM:
                this.getFanState().setSpeed(FanState.Speed.HIGH);
                break;
            case HIGH:
                this.getFanState().setSpeed(FanState.Speed.OFF);
                break;
        }
    }

    public void changeDirection() {
        this.getFanState().setReverseDirection(!this.getFanState().isReverseDirection());
    }

    public void pullSpeedCord() {
        this.changeSpeed();
    }

    public void pullDirectionCord() {
        this.changeDirection();
    }

}
