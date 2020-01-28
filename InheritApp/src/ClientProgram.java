import java.util.Date;

public class ClientProgram {

	public static void main(String[] args) {

		Student student = new Student(1,6,"Rama", "Achalla", new Date());
		System.out.println("Roll no - " + student.getRollNo());
		System.out.println("Name - " + student.getFirstName() + " " + student.getLastName());
		System.out.println("Grade - " + student.getGrade());
		System.out.println("Date of Birth - " + student.getDateOfBirth());
		
		Professor professor = new Professor(1,"Physics", "Rama", "Achalla", new Date());
		System.out.println("Prof Id - " + professor.getProfId());
		System.out.println("Name - " + professor.getFirstName() + " " + professor.getLastName());
		System.out.println("Subjects to teach - " + professor.getSubjectsToTeach());
		System.out.println("Date of Birth - " + professor.getDateOfBirth());
		
	}

}
