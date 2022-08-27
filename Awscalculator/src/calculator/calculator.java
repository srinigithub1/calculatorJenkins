package calculator;

import java.util.Scanner;

public class calculator {

	static int firstno1 = 10, secondno1 = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		calculator objcalculator = new calculator();

		Scanner scan = new Scanner(System.in);



		System.out.println("1: Addition");
		System.out.println("2: Muliplication");
		System.out.println("3: Substraction");
		System.out.println("4: Division");
		System.out.println("Enter code of opeation to Perform: ");
		int code = scan.nextInt();
		
		System.out.println("Etner first No: ");
		int firstno = scan.nextInt();
		System.out.println("Etner Second No: ");
		int secondno = scan.nextInt();
		

		if (code == 1) {
			System.out.println("Addion of two no is: "+objcalculator.addition(firstno, secondno));
		} else if (code == 3) {
			System.out.println("Substraction of two no is: "+objcalculator.Substraction(firstno, secondno));
		} else if (code == 2) {
			System.out.println("Multiplicaiton of two no is: "+objcalculator.Multiplicaiton(firstno, secondno));
		} else if (code == 4) {
			System.out.println("Division of two no is: "+objcalculator.divistion(firstno, secondno));
		}
//		int restult = display1();
//
//		System.out.println(restult);
	}

	public static int display1() {

		int temp = firstno1 + secondno1;
		System.out.println("this is static method");
		return temp;
	}

	public int addition(int a, int b) {
		int temp = a + b;
		return temp;

	}

	public int Substraction(int a, int b) {

		int temp = a - b;
		return temp;
	}

	public int Multiplicaiton(int a, int b) {

		int temp = a * b;
		return temp;
	}

	protected int protectedMultiplicaiton(int a, int b) {

		int temp = a * b;
		return temp;
	}

	public int divistion(int a, int b) {

		int temp = a / b;
		return temp;
	}

}
