package assignment3;

class Student {

	private String name;
	private long id;

	public Student(String name, long id) {
		this.name = name;
		this.id = id;
	}

	// Getter for `name`. Return the current `name` data
	public String getName() {
		return this.name;
	}

	public long getID() {
		return this.id;
	}
	
}

class Course {
	private String courseName;
	private int numberOfStudents=0; // variable number of student registering for
									// course
	private int courseCapacity = 10;
	private Student[] registeredStudents = new Student[courseCapacity];

	public Course(String courseName) {
		this.courseName = courseName;
	}

	// array of students registering course

	public Student[] getStudents() {
		return registeredStudents;
	}

	public boolean isFull() {
		if (this.numberOfStudents == this.courseCapacity) {
			return true;
		} else {
			return false;
		}
	}

	public String registerStudent(Student student) {
		if (this.isFull()) {
			String message="There is no capacity to register";
			System.out.println(message);
			return message;
		}
		else
		{
			String message="A student registered in the system in the course "+this.courseName;
			
			this.registeredStudents[this.numberOfStudents]= student;
			System.out.println("Details of student are"+student.getName()+ student.getID());
			this.numberOfStudents= this.numberOfStudents+1;
			return message;
		}
	}

}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course c = new Course("Big Data");
		Student s= new Student("Mohit",1);
		System.out.println(c.registerStudent(s));
		
		

	}

}
