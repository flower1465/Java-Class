package day0601_1;

public class Student {

	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.name = name;
		this.sno = sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return sno == student.sno; // && (name.equals(student.name))
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return sno; // + name.hashCode()
	}
}
