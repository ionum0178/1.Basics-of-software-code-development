package by.javalearning.homework.theme1;

import java.util.Random;

/*
 * 1.Basics of software code developement
 * Ветвления 
 * Задача 2. Найти max{min(a, b), min(c, d)}
 */

public class BasicsBranchingEx2 {

    public static void main(String[] args) {

	Random r = new Random();
	int a = r.nextInt(1000);
	int b = r.nextInt(1000);
	int c = r.nextInt(1000);
	int d = r.nextInt(1000);

	System.out.println("These are four numbers:");
	System.out.println("a=" + a);
	System.out.println("b=" + b);
	System.out.println("c=" + c);
	System.out.println("d=" + d);

	int z = Math.max(Math.min(a, b), Math.min(c, d));
	System.out.println("The result is " + z);
    }

}
