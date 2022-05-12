package by.javalearning.homework.theme1;

import java.util.Random;

//1.Basics of software code developement
//Линейные программы
//Задача 1. Вычислить значение выражения z=((a-3)*b/2)+c

public class BasicsLinearEx1 {

    public static void main(String[] args) {
	Random r = new Random();
        double a = r.nextDouble()*100;
        double b = r.nextDouble()*100;
        double c = r.nextDouble()*100;
        System.out.println("a=" + a);
        System.out.println("b=" + b);        
        System.out.println("c=" + c);
        double z = ((a-3)*b/2)+c;
        System.out.println("The result is: " + z);
    }
}
