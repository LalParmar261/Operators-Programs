package operators;

import java.util.Scanner;

public class RelationalOpr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("True/False: " + (a<b));
		System.out.println("True/False: " + (a>b));
		System.out.println("True/False: " + (a<=b));
		System.out.println("True/False: " + (a>=b));
		System.out.println("True/False: " + (a==b));
		System.out.println("True/False: " + (a!=b));
		
	}
}
