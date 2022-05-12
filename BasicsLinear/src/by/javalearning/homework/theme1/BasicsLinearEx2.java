package by.javalearning.homework.theme1;

import java.util.Random;

//1.Basics of software code developement
//Линейные программы
//Задача 2. Вычислить значение выражения (b+sqrt(b^2+4*a*c))/(2*a)-a^3*c+b^-2

public class BasicsLinearEx2 {

    public static void main(String[] args) {

	Random r = new Random();
	double a = r.nextDouble()*100;
	double b = r.nextDouble()*100;
	double c = r.nextDouble()*100;
	System.out.println("a=" + a);
	System.out.println("b=" + b);
	System.out.println("c=" + c);

	double z = (Math.pow(b, 2)) + (4 * a * c);
	if (z < 0)
	    System.out.println("Operation is not available");
	else {
	    double res1 = ((b + Math.sqrt(z)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
	    double res2 = ((b - Math.sqrt(z)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
	    System.out.println("The results are: " + res1 + " and " + res2);
	}
    }
}
