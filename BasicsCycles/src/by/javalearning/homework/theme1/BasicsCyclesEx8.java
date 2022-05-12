package by.javalearning.homework.theme1;

import java.util.Scanner;

/* 1.Basics of software code developement
 * Циклы 
 * Задача 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class BasicsCyclesEx8 {

    public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        while (!in.hasNextInt()) {
	    in.next();
	}
        int a = in.nextInt();
        System.out.println("Enter b: ");
        while (!in.hasNextInt()) {
	    in.next();
	}
        int b = in.nextInt();
        
        int[] arr = new int[10];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.print(b % 10 + " ");
            b /= 10;
        }
        in.close();
    }

}
