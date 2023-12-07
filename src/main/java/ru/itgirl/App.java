package ru.itgirl;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayOfWeekENG = sc.nextLine();
        String dayOfWeekRU = null;
        if (dayOfWeekENG.equalsIgnoreCase("monday")) {
            dayOfWeekRU = "понедельник";
        } else if (dayOfWeekENG.equalsIgnoreCase("tuesday")){
            dayOfWeekRU = "вторник";
        } else if (dayOfWeekENG.equalsIgnoreCase("sunday")){
            dayOfWeekRU = "воскресенье";
        }else if (dayOfWeekENG.equalsIgnoreCase("wednesday")){
            dayOfWeekRU = "среда";
        }else if (dayOfWeekENG.equalsIgnoreCase("thursday")){
            dayOfWeekRU = "четверг";
        }else if (dayOfWeekENG.equalsIgnoreCase("friday")){
            dayOfWeekRU = "пятница";
        }else if (dayOfWeekENG.equalsIgnoreCase("saturday")){
            dayOfWeekRU = "суббота";
        } else {
            dayOfWeekRU = "Error! Input word is not a day of week";
        }
        System.out.println(dayOfWeekRU);
    }
}
