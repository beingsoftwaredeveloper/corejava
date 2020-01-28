import java.util.Date;

public class Student extends Person {

	private int rollNo;
	private int grade;
	
	
	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public Student(int rollNo, int grade, String firstName, String lastName, Date dateOfBirth) {
		super(firstName, lastName, dateOfBirth);
		this.rollNo = rollNo;
		this.grade = grade;
	}
}
