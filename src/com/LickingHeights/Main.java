package com.LickingHeights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("There's old nursery rhyme that is supposed to tell you what you're like,");
        System.out.println("Depending on the day you were born.");
        System.out.println("It goes:");
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go.");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("but the child born  on the Sabbath Day,");
        System.out.println("is fair and wise and good in every way.");
        System.out.println(" ");

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.println("To find out exactly what day you were born on, insert the month you were born on in a number");
        int month = keyboard.nextInt();
        System.out.println("What year were you born on?");
        int year = keyboard.nextInt();
        monthYear(month, year );


    }
    public static int monthYear(int month, int year) {
        switch (month) {
            case 1:
                System.out.println("You were born on January .This month has 31 days.");
                break;
            case 3:
                System.out.println("You were born on March .This month has 31 days.");
                break;
            case 5:
                System.out.println("You were born on May. This month has 31 days.");
                break;
            case 7:
                System.out.println("You were born on July. This month has 31 days.");
                break;
            case 8:
                System.out.println("You were born on August. This month has 31 days.");
                break;
            case 10:
                System.out.println("You were born on  October. This month has 31 days.");
                break;
            case 12:
                System.out.println("You were born on December. This month has 31 days.");
                break;
            case 4:
                System.out.println("You were born on April. This month has 30 days.");
                break;
            case 6:
                System.out.println("You were born on June. This month has 30 days.");
                break;
            case 9:
                System.out.println("You were born on September. This month has 30 days.");
                break;
            case 11:
                System.out.println("You were born on November. This month has 30 days.");
                break;
           
            default:
                System.out.println("Not a month");
        }
        return 0;
    }








}
