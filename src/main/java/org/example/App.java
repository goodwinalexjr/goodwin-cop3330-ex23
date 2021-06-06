/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner yesno= new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");


        String a = yesno.nextLine();


        if(a.matches("y")){
            System.out.print("Are the battery terminals corroded? ");
            a = yesno.nextLine();
            if(a.matches("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
        }
        else{
            System.out.print("Does the car make a slicking noise?");
            a = yesno.nextLine();
            if(a.matches("y")){
                System.out.println("Replace the battery.");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                a = yesno.nextLine();
                if(a.matches("y")){
                    System.out.println("Check spark plug connections.");
                }
                else{
                    System.out.print("Does the engine start and then die?");
                    a = yesno.nextLine();
                    if(a.matches("y")){
                        System.out.print("Does you car have fuel injection?");
                        a = yesno.nextLine();
                        if(a.matches("y")){
                            System.out.println("Get it in for service.");
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
