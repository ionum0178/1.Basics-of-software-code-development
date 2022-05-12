package by.javalearning.homework.theme1;

import java.util.Random;

/* 1.Basics of software code developement
 * Линейные программы
 * Задача 6. Для данной области составить линейную программу, которая печатает
 * true, если точка с координатами (х, у) принадлежит закрашенной области,
 * и false — в противном случае
 */

public class BasicsLinearEx6 {

    public static void main(String[] args) {
	
	Random r = new Random();
	int x = r.nextInt(10);
	int y = r.nextInt(10);
        System.out.println("The coordinates of the point are:");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        
        boolean res = true;
        if (x > 2 && y > 0)
            res = false;
        if (x < -2 && y > 0)
            res = false;
        if (x >= 4 && y <= 0)
            res = false;
        if (x <= -4 && y <= 0)
            res = false;
        if (y > 4 || y < -3)
            res = false;
        System.out.println(res);
    }
}
