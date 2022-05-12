package by.javalearning.homework.theme1;

/*1.Basics of software code developement
 * Циклы 
 * Задача 3. Найти сумму квадратов первых ста чисел.
 */

public class BasicsCyclesEx3 {

    public static void main(String[] args) {
	int res = 0;
        for (int i = 1; i <= 100; i++)
            res += Math.pow(i, 2);
        System.out.println("Sum of the squares of the first hundred numbers is: " + res);

    }

}
