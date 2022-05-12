package by.javalearning.homework.theme1;

import java.util.Random;

/* 1.Basics of software code developement
 * Циклы 
 * Задача 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
 * модуль которых больше или равен заданному е. Общий член ряда имеет вид
 * An=1/2^n + 1/3^n
 */

public class BasicsCyclesEx5 {

    public static void main(String[] args) {
	
	Random r = new Random();
	double e = r.nextDouble();
	System.out.println("e=" + e);
	System.out.println("The number of members of the series n=1000");
	int n = 1000;
	
	double res = 0;
	double a = 0;
	for (int i = 1; i <= n; i++) {
	    a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
	    if (Math.abs(a) >= e)
		res += a;
	}
	System.out.println("The result is: " + res);
    }

}
