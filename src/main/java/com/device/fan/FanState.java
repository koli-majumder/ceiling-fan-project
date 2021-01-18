package com.device.fan;

public class FanState {

    Speed speed = Speed.OFF;
    boolean reverseDirection = false;

    public FanState() {
    }

    public FanState(Speed speed, boolean reverseDirection) {
        this.speed = speed;
        this.reverseDirection = reverseDirection;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public boolean isReverseDirection() {
        return reverseDirection;
    }

    public void setReverseDirection(boolean reverseDirection) {
        this.reverseDirection = reverseDirection;
    }

    public enum Speed {
        HIGH, MEDIUM, LOW, OFF
    }

}
