package by.javalearning.homework.theme1;

import java.util.Random;

/* 1.Basics of software code developement
 * Циклы 
 * Задача 2. Вычислить значения функции на отрезке [а,b] c шагом h
 * y = x если x>2;
 * y = -x если x<=2.
 */

public class BasicsCyclesEx2 {

    public static void main(String[] args) {
        Random r = new Random();	
	int a1 = r.nextInt(40)-20;
	int b1 = r.nextInt(40)-20;
	int h = r.nextInt(5);
	int a = Math.min(a1, b1);
        int b = Math.max(a1, b1);
	
	System.out.println("The interval [a, b] is [" + a + ", " + b + "]");
        System.out.println("The step h is " + h);
        
        for (int i = a; i <= b; i = i + Math.abs(h)) {
            if (i > 2)
                System.out.print(i + "; ");
            else
                System.out.print(-i + "; ");
        }
    }
}
