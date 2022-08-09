package com.syntax.loops;

public class ForLoop {

	private Object system;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x <= 9; x++) {
			System.out.println("Hello");
		}
		int[] grades = { 98, 100, 93, 89, 85 };
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		for (int i = 0; i <= 15; i++) {
			System.out.println(i);
		}

		for (int i = 5; i <= 40; i += 5) {
			System.out.println(i + "");
		}

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " ");
		}
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
			
		}
		for (int i = 20; i >= 1; i-=2) {
			System.out.println(i);
			
		}
		for (int i = 2; i <= 20; i+=2) {
			System.out.print(i+" ");
			
		}
		for (int i = 20; i <= 50; i+=1) {
			System.out.print(i+" ");
			
		}
	}

}
