package by.javalearning.homework.theme1;

import java.util.Random;

/*1.Basics of software code developement
 * Ветвления 
 * Задача 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой.
 */

public class BasicsBranchingEx3 {

    public static void main(String[] args) {
	
	Random r = new Random();
	int x1 = -10 + r.nextInt(20);
	int y1 = -10 + r.nextInt(20);
	int x2 = -10 + r.nextInt(20);
	int y2 = -10 + r.nextInt(20);
	int x3 = -10 + r.nextInt(20);
	int y3 = -10 + r.nextInt(20);
	
	System.out.println("These are coordinates of three points:");        
        System.out.println("x1=" + x1);        
        System.out.println("y1=" + y1);        
        System.out.println("x2=" + x2);        
        System.out.println("y2=" + y2);        
        System.out.println("x3=" + x3);        
        System.out.println("y3=" + y3);
        
        int a = y2 - y1;
        int b = x1 - x2;
        int c = x1 * (y1 - y2) + y1 * (x2 - x1);
        int z = a * x3 + b * y3 + c;
        if (z == 0)
            System.out.println("All points lie on one straight line");
        else {
            System.out.println("The points don't lie on the straight line");
        }
    }
}
