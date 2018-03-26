//package Lab7;
import java.util.Arrays;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course (String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent (String student) {
		if (numberOfStudents < students.length) { 
			students[numberOfStudents] = student;
			numberOfStudents++;
		} else if (numberOfStudents >= students.length) {
			String[] students2 = new String[numberOfStudents+1];
			for (int i = 0; i < numberOfStudents; i++) {
				students2[i] = students[i];
			}
			students = students2;
			numberOfStudents++;
		}
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent (String studentName) {
		for (int z = 0; z < this.students.length; z++) {
			if (this.students[z] == studentName) {
				String[] students2 = new String[this.students.length - 1];
				for (int i = 0, j = 0; i < students2.length; i++, j++) {
					if (i == z) {
						j++;
					}
					students2[i] = students[j];					
				}
				this.students = students2;
				numberOfStudents--;
			}
		}
	}
	
	public void clear() {
		for (int v = 0; v <= this.students.length; v++) {
			this.students[v] = ""; 
		}
		numberOfStudents = 0;
		students = new String[100];
	}
	
	public static void main (String[] args) {
			
		Course cs = new Course("Software Development 1");
			
		cs.addStudent("Andrew");
		cs.addStudent("Nkanyiso");
		cs.addStudent("Jordan");
		cs.dropStudent("Andrew");
			
		
		System.out.println(cs.getNumberOfStudents());		
	}
}


