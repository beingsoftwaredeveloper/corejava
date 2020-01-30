import java.util.Date;

public class Professor extends Person {

	private int profId;
	private String subjectsToTeach;
	public int getProfId() {
		return profId;
	}
	public void setProfId(int profId) {
		this.profId = profId; 
	}
	public String getSubjectsToTeach() {
		return subjectsToTeach;
	}
	public void setSubjectsToTeach(String subjectsToTeach) {
		this.subjectsToTeach = subjectsToTeach;
	}
	public Professor(int profId, String subjectsToTeach, String firstName, String lastName, Date dateOfBirth) {
		super(firstName, lastName, dateOfBirth);
		// TODO Auto-generated constructor stub
		this.profId = profId;
		this.subjectsToTeach = subjectsToTeach;
	}
	
	
}
