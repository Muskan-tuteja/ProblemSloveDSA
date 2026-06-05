package StringStart;

import java.util.Scanner;

public class StudentsInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Detalis ");
		System.out.println("Enter the name  ");
		String str = sc.nextLine();
		System.out.println("Print the name : " +str);
		
		
		System.out.println("Enter the Age ");
		String str2 = sc.nextLine();
		System.out.println("Print the age : " + str2);
		
		System.out.println("Enter the last name");
		String str3 = sc.nextLine();
		System.out.println("Print the last name  : " + str3);
		
		System.out.println("Compelted the Details");
	}

}
