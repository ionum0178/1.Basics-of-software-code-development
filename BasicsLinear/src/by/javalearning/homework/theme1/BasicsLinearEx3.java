package by.javalearning.homework.theme1;

import java.util.Random;
import static java.lang.Math.*;

//1.Basics of software code developement
//Линейные программы
//Задача 3. Вычислить значение выражения ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y)

public class BasicsLinearEx3 {

    public static void main(String[] args) {

	Random r = new Random();
	int x = r.nextInt(360);
	int y = r.nextInt(360);
	System.out.println("x=" + x + "°");
	System.out.println("y=" + y + "°");

	double x1 = toRadians(x);
	double y1 = toRadians(y);
	if (sin(y1) == cos(x1))
	    System.out.println("Operation is not available");
	else {
	    double res = ((sin(x1) + cos(y1)) / (cos(x1) - sin(y1))) * tan(x1 * y1);
	    System.out.println("The result is: " + res);
	}
    }
}
