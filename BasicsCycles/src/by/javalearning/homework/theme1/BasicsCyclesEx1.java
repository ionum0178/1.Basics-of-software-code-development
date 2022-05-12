package by.javalearning.homework.theme1;

import java.util.Scanner;

/*1.Basics of software code developement
 * Циклы 
 * Задача 1. Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class BasicsCyclesEx1 {

    public static void main(String[] args) {

	Scanner x1 = new Scanner(System.in);
	int x;
	while (true) {
	    System.out.println("Please enter any positive integer x:");
	    if (x1.hasNextInt()) {
		x = x1.nextInt();
		if (x > 0)
		    break;
	    } else
		x1.next();
	}
	int res = 0;
	for (int i = 1; i <= x; i++)
	    res += i;
	System.out.println("The result is: " + res);
	x1.close();
    }

}
