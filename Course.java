package school;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course (String courseName) {
		this.courseName = courseName;
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
	public void addStudent (String student) {
		int a = students.length;
		students[a] = student;
	}
	public void dropStudent (String student) {
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (student.equals(students[i])) {
				index = i;
				break;
			}
		}
		for (int j = index;j < students.length; j++) {
			if (j != students.length) {
				students[j] = students[j + 1];
			}else {
				students[j] = null;
			}
		}
	}
}
