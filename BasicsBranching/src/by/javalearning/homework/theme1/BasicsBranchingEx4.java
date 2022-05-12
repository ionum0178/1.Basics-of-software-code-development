package by.javalearning.homework.theme1;

import java.util.Random;

/*
 * 1.Basics of software code developement
 * Ветвления 
 * Задача 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие.
 */

public class BasicsBranchingEx4 {

    public static void main(String[] args) {

	Random r = new Random();
	int a = r.nextInt(20);
	int b = r.nextInt(20);
	int x = r.nextInt(20);
	int y = r.nextInt(20);
	int z = r.nextInt(20);

	System.out.println("These are the hole dimensions:");
	System.out.println("a=" + a);
	System.out.println("b=" + b);
	System.out.println("These are the brick dimensions:");
	System.out.println("x=" + x);
	System.out.println("y=" + y);
	System.out.println("z=" + z);

	if (x <= a && y <= b || y <= a && x <= b || x <= a && z <= b || z <= a && x <= b || z <= a && y <= b
		|| y <= a && z <= b)
	    System.out.println("This brick successfully passed the hole!");
	else {
	    System.out.println("This brick is too big to pass the hole!");
	}
    }
}
