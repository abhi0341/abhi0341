package com.anz.action;

import com.anz.models.Robot;
import com.anz.models.SquareTable;
import com.anz.service.AppService;

import java.util.Scanner;

/**
 * Author: Abhirup Das
 * Description: Application Starter
 */
public class ANZRobotStarter {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        AppService app = new AppService();
        app.setTable(new SquareTable(5));
        app.setToyRobot(new Robot());

        String inputString;
        while (true) {
            System.out.println("Enter Valid command:");
            System.out.println("PLACE X,Y,NORTH|SOUTH|EAST|WEST, MOVE, LEFT, RIGHT, REPORT or EXIT");

            inputString = console.nextLine();
            if("EXIT".equalsIgnoreCase(inputString))
                break;
            app.doAction(inputString);
        }
        System.out.println("Application Exited !!!");

    }

}
