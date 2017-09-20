package com.commandline;

import java.util.Scanner;
import static com.commandline.ApplicationHelper.getOption;
import static com.commandline.ApplicationHelper.performOperation;
/**]
 *
 * Application controller
 */
public class TodoApp {
    public static void main( String[] args ){
        System.out.println("Welcome to the TODO List app. This application will help you in organizing the TODO list");
        Scanner inputScanner = new Scanner(System.in);
        try{
            //Display menu and get the option.
            int selectedOption = getOption(inputScanner);
            System.out.println("The selected option is"+selectedOption);
            //TODO yet to implement.
            performOperation(selectedOption);
        }finally {
            if(inputScanner !=  null){
                inputScanner.close();
            }
        }
    }
}
