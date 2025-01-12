package observer20.java;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class Client {

    public static void main(String[] args) {
        // Create a monitor...
        SpeedMonitor monitor = new SpeedMonitor();

        // Create a speedometer and register the monitor to it...
        Speedometer speedo = new Speedometer();
        speedo.addObserver(monitor);

        // Drive at different speeds...
        speedo.setSpeed(50);
        speedo.setSpeed(70);
        speedo.setSpeed(40);
        speedo.setSpeed(100);
        speedo.setSpeed(69);

        // Now add the gearbox monitor...
        System.out.println("Monitoring gearbox...");
        speedo.addObserver(new AutomaticGearbox());
        speedo.setSpeed(5);
        speedo.setSpeed(15);
        speedo.setSpeed(29);
        speedo.setSpeed(42);
        speedo.setSpeed(82);
    }

}
