package by.javalearning.homework.theme1;

import java.util.Random;

/*
 * 1.Basics of software code developement
 * Линейные программы
 * Задача 5. Дано  натуральное  число Т, которое  представляет  длительность 
 * прошедшего  времени  в  секундах. Вывести данное значение длительности в часах,
 * минутах и секундах в следующей форме:ННч ММмин SSc.
 */

public class BasicsLinearEx5 {

    public static void main(String[] args) {

        Random x1 = new Random();
        int sec = x1.nextInt(1000000);
        System.out.println("Number of seconds: " + sec);
        
        int seconds = sec % 60;
        int minutes = sec / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        minutes = minutes - (hours * 60);
        hours = hours - (days * 24);
        
        System.out.println(
                "The result is: " + days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }

}
