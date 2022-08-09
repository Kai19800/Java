import java.util.Scanner;

public class PracticeRandom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the year?");
		int year = input.nextInt();

		System.out.println("What is the number of month?");
		int month = input.nextInt();

		if (year == 2016 && month == 1) {
			System.out.println("the number of days in January is 30 days");
		} else if (year == 2016 && month == 2) {
			System.out.println("The number of days in Feb is 28");
		} else if (year == 2016 && month == 3) {
			System.out.println("The number of days in March is 30");
		} else if (year == 2016 && month == 4) {
			System.out.println("The number of days in April is 30");
		} else if (year == 2016 && month == 5) {
			System.out.println("The number of days in May is 31");
		}

	}
}
