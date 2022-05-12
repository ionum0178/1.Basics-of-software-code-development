package by.javalearning.homework.theme1;

/*1.Basics of software code developement
 * Циклы 
 * Задача 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

/* 1.Basics of software code developement
 * Циклы 
 * Задача 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
 * модуль которых больше или равен заданному е. Общий член ряда имеет вид
 * An=1/2^n + 1/3^n
 */

public class BasicsCyclesEx4 {

    public static void main(String[] args) {
	long res = 1;
        for (int i = 1; i <= 200; i++)
            res *= Math.pow(i, 2);
        System.out.println("Product of the squares of the first two hundred numbers is: " + res);
    }
}
