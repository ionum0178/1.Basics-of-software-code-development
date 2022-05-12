package by.javalearning.homework.theme1;

import java.util.Random;

/*
 * 1.Basics of software code developement
 * Ветвления 
 * Задача 1. Даны два угла треугольника (в градусах). Определить, 
 * существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class BasicsBranchingEx1 {

    public static void main(String[] args) {

	Random r = new Random();
	int x = r.nextInt(180);
	int y = r.nextInt(180);
	System.out.println("These are two angle values (in degrees):");
	System.out.println("x=" + x);
	System.out.println("y=" + y);

	if ((y + x) >= 180 || x == 0 || y == 0)
	    System.out.println("Triangle doesn't exist! ");
	else {
	    System.out.print("Triangle exists!");
	    if (x + y == 90 || x == 90 || y == 90)
		System.out.println("It's a right one!");
	}

    }
}
