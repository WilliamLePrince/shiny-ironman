package model.school;

import java.io.Serializable;
import java.util.Vector;

public class Course implements Serializable {

	private static final long serialVersionUID = 1049657773644600139L;

	protected String name;
	protected Professor professor;
	protected Vector<Major> majors;
	protected Vector<Student> students;

	public Course(String nom) {
		name = nom;
		majors = new Vector<Major>();
		students = new Vector<Student>();
	}

	protected void setProfessor(Professor p) {
		professor = p;
	}

	protected boolean addStudents(Student s) {
		if (students.contains(s))
			return false;
		students.add(s);
		return true;
	}



	protected void delStudent(Student s) {
		students.remove(students.indexOf(s));
	}
	
	protected void addMajor(Major m) {
		majors.remove(majors.indexOf(m));
	}
	
    public String toString() {
    	return getName();
    }

	public String getName() {
		return name;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Vector<Major> getMajors() {
		return majors;
	}

	public Vector<Student> getStudents() {
		return students;
	}

}
