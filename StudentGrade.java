// Program asks the user total marks and calculate final grade of a student.

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String studentGrade;
		String finalExamAttendance;
		int marks;
		
		System.out.print("Did student attend to final exam? (Reply y/n): ");
		finalExamAttendance = scnr.nextLine();
		
		System.out.print("Please enter the total marks: ");
		marks = scnr.nextInt();
		
			if(finalExamAttendance.equalsIgnoreCase("y")) {
				if(marks >= 90) {
					studentGrade = "A";
					System.out.println("The student's letter grade is: " + studentGrade);
				}
				else if(marks >= 80) {
					studentGrade = "B";
					System.out.println("The student's letter grade is: " + studentGrade);
				}	
				else if(marks >= 70) {
					studentGrade = "C";
					System.out.println("The student's letter grade is: " + studentGrade);
				}
				else if(marks >= 60) {
				studentGrade = "D";
				System.out.println("The student's letter grade is: " + studentGrade);
				}
				else {
					studentGrade = "F";
					System.out.println("The student's letter grade is: " + studentGrade);
				}	
			}
			else if(finalExamAttendance.equalsIgnoreCase("n")) {
				System.out.println("Student grades F.");
			}
		}
	}
