package by.javalearning.homework.theme1;

/* 1.Basics of software code developement
 * Циклы 
 * Задача 6. Вывести на экран соответствий между символами и их численными 
 * обозначениями в памяти компьютера.
 */

public class BasicsCyclesEx6 {

    public static void main(String[] args) {
	 for (char c = ' '; c <= 'z'; c++) {
	            System.out.print("'" + c + "'=" + (int) c + '\t');
	        }
    }
}
