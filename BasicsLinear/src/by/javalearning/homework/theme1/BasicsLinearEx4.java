package by.javalearning.homework.theme1;

import java.util.Random;

//1.Basics of software code developement
//Линейные программы
//Задача 4. Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях). 
//Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class BasicsLinearEx4 {

    public static void main(String[] args) {
	Random r = new Random();
	double a = r.nextDouble()*1000;
	System.out.printf("a=%.3f\n", a);
	
	int b = (int) a;
	double c = (a - b) * 1000;
	int c1 = (int) Math.round(c);
	double d = (b + 0.0) / 1000;
	System.out.println(c1 + d);

    }

}
