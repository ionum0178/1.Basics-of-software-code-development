package by.javalearning.homework.theme1;

import java.util.Scanner;

/* 1.Basics of software code developement
 * Циклы 
 * Задача 7. Для каждого натурального числа в промежутке от m до n 
 * вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class BasicsCyclesEx7 {

    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	System.out.println("Enter m: ");
	while (!in.hasNextInt()) {
	    in.next();
	}
	int m1 = in.nextInt();
	if (m1 < 1) {
	    System.out.println("Ошибка: это не натуральное число.");
	    System.exit(1);
	}
	
	System.out.println("Enter n: ");
	while (!in.hasNextInt()) {
	    in.next();
	}
	int n1 = in.nextInt();
	if (n1 < 1) {
	    System.out.println("Ошибка: это не натуральное число.");
	    System.exit(1);
	}
	int n;
	int m;
	if (n1 < m1) {
	    n = m1;
	    m = n1;
	} else {
	    n = n1;
	    m = m1;
	}
	for (int i = m; i <= n; i++) {
	    System.out.print("Делители числа " + i + ": ");
	    for (int j = 2; j <= i / 2; j++) {
		if ((i % j) == 0)
		    System.out.print(j + "; ");
	    }
	    System.out.println();
	}
	in.close();
    }

}
