package com.syntax.loops;

public class WhileLoops {

	public static void main(String[] args) {
	
		int day = 7;

		switch(day) {
		case 1:
		System.out.println("Monday");
		case 2:
		System.out.println("Tuesday");
		case 3:
		System.out.println("Wednesday");
		case 4:
		System.out.println("Thursday");
		case 5:
		System.out.println("Friday");
		}

		int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;
        System.out.println(a);
        System.out.println(b);
	}

}
