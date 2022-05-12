package by.javalearning.homework.theme1;

import java.util.Random;

/* 1.Basics of software code developement
 * Ветвления 
 * Задача 5. Вычислить значение функции 
 * F(x) = x^2-3x+9 если x<=3;
 * F(x) = 1/(x^3+6) если x>3.
 */

public class BasicsBranchingEx5 {

    public static void main(String[] args) {
        Random r = new Random();	
        double x = r.nextDouble()*10-5;	
	System.out.println("x=" + x);
	
        double f;
        if (x <= 3d)
            f = Math.pow(x, 2) - 3 * x + 9;
        else
            f = 1 / (Math.pow(x, 3) + 6);
        System.out.println("The result is: " + f);
    }
}


