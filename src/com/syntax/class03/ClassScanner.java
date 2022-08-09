package com.syntax.class03;

import java.util.Scanner;

public class ClassScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println(name);
		System.out.println("What's your age?");
		int age = scan.nextInt();
		System.out.println(age);

		int day = 7;

		switch (day) {
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

	}

}
