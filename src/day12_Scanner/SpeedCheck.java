package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current speed limit");
        int currentLimit = input.nextInt();

        input.close();


        int speedLimit = 90;

        int overLimit= currentLimit - speedLimit;

        if (speedLimit < currentLimit){
            System.out.println("You are drving" + overLimit+  "mph over te limit. Slown Down!");
        }

    }
}
/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

 */