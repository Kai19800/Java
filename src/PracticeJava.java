
public class PracticeJava {

	public static void main(String[] args) {

		int num = 100;
		num = num + 100;
		System.out.println(num);
		num = num + 50;
		System.out.println(num);
		num += 100;
		System.out.println(num);

		String num1 = "100";
		System.out.println(num1);
		int a = 10;
		int b = 20;
		String c = "hello";
		String d = "Khalid";

		System.out.println(a + b + c + d);
		System.out.println(d + c + b + a);
		System.out.println(d + c + (b + a));

		int box1 = 10;
		int box2 = 20;
		System.out.println(box1 > box2);
		System.out.println(box1 < box2);
		System.out.println(box1 == box2);
		System.out.println(box1 = box2);

		boolean result = 100 > 200;
		System.out.println(result);

		double MortgageRate = 5.5;

		if (MortgageRate < 5) {
			System.out.println("Buy a house");
		} else {
			System.out.println("Do not buy a house");
		}

		String browser = "chrome";
		if (browser == "chrome") {
			System.out.println("All test cases will be executed");
		}else {System.out.println("No tests will be executed");}
		
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
		
		
	}

}
