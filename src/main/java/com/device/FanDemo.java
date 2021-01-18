package com.device;

import com.device.fan.CeilingFan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FanDemo {

    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan();

        System.out.print("Choose a number : \n 1 (Speed change), 2 (Direction change), 3 (Print current state), 4 (Exit)\n" );
        String input;

        while (true) {
            input = getLine();
            if (input.equals("1")) {
                ceilingFan.pullSpeedCord();
                System.out.println("Fan speed is changed.");
            } else if (input.equals("2")){
                ceilingFan.pullDirectionCord();
                System.out.println("Fan direction is changed.");
            } else if (input.equals("3")) {
                System.out.println("Current state of Fan");
            } else if (input.equals("4")) {
                System.out.println("Exiting the Application");
                System.exit(0);
            } else {
                System.out.println("Choose a number between 1 to 4");
            }
            ceilingFan.display();
        }
    }

    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
