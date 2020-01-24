package test;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter mark " + (i + 1) + " : ");
			int m = sc.nextInt();
			
			int[] marks = s.getMarks();
			marks[i] = m;
		}
		
		System.out.println();
		s.display();
		
		sc.close();
	}
}
