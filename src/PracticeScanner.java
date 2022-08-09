import java.util.Scanner;

public class PracticeScanner {

	public static void main(String[] args) {

		Scanner BirthMonth = new Scanner(System.in);
		System.out.println("What is your birth Month?");
		String month = BirthMonth.nextLine();

		if (month == "March" || month == "April" || month == "May") {
			System.out.println("You were born in the Spring season");}
		
	else if (month == "January" || month == "February" || month == "December") {
				System.out.println("You were born in the Winter season");
			}else {
				System.out.println("You were born in the Winter summer");
			}
		} 
	}

}
