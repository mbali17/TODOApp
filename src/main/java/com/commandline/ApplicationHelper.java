package com.commandline;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ALI on 9/19/2017.
 * This class consists of utility methods.
 */
public class ApplicationHelper {
    /**
     * Displays the  menu.
     * @param inputScanner
     * @return {@code int} selectedOtion the option selected by the user.
     */
    public static int getOption(Scanner inputScanner) {
        try{
            System.out.println("Please select one of the options and enter the number associated with it.");
            System.out.println("Add task =1");
            System.out.println("List task =2");
            System.out.println("Remove task =3");
            System.out.println("Search task = 4");
            System.out.println("Sort task = 5");
            System.out.println("Quit = 6");
            /*
            Check if the user input is an integer.If integer return other wise keep prompting for selecting the right option
             */
            if (inputScanner.hasNextInt()) {
                return inputScanner.nextInt();
            }else {
                // http://stackoverflow.com/questions/16040601/why-is-nextline-returning-an-empty-string --
                // reference for adding this extra line inpScanner.next().
                // nextInt() does not read end of line and subsequent next() call.
                //leads to reading an empty string .Leading to an infinite loop or ArrayIndexOutOfBoundException.
                inputScanner.next();
                System.out.println("The entered option is incorrect");
                getOption(inputScanner);
            }
        }catch(InputMismatchException mismatchException){
            System.out.println("java.util.InputMismatchException while accepting user input.");
        }
        return 6;
    }

    /**
     * Performs the selected operation.
     * @param slectedOption
     */
    public  static void performOperation(int slectedOption){
        //TODO complete implementation
    }
}
