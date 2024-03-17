package entities;

public class Student {
	private String name;
	private double grade1;
	private double grade2;
	private boolean approved;
	
	public Student(String name, double grade1, double grade2, boolean approved) {
		super();
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.approved = approved;
	}

	public String getName() {
		return name;
	}

	public double getGrade1() {
		return grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public boolean isApproved() {
		return approved;
	}
	
	
}
