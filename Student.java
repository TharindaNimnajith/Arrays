package test;

public class Student {
	private int marks[];

	public Student() {
		for(int i = 0; i < marks.length; i++) 
			marks[i] = 0;
	}

	public int[] getMarks() {
		return marks;
	}
	
	public void display() {
		for(int i : marks)
			System.out.println(i);
	}
}
