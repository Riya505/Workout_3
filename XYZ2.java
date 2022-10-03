import java.util.*;
class Student{
	private int rollno;	
	private int percentage;
	
	Student(){
		rollno=0;
		percentage=0;
	}
	
	Student(int rollno, int percentage){
		this.rollno=rollno;
		this.percentage=percentage;
	}
	
	void show(){
		System.out.println("\nRoll Number: "+rollno+"\nPercentage: "+percentage);
	}
}

class CollegeStudent extends Student{
	String semester;
	
	CollegeStudent(){
		semester=null;
	}
	
	CollegeStudent(String semester, int rollno, int percentage){
		super(rollno, percentage);
		this.semester=semester;
	}
	
	void show(){
		super.show();
		System.out.println("Semester: "+semester);
	}
}

class SchoolStudent extends Student{
	String className;
	
	SchoolStudent(){
		className=null;
	}
	
	SchoolStudent(String className, int rollno, int percentage){
		super(rollno, percentage);
		this.className=className;
	}
	
	void show(){
		super.show();
		System.out.println("Class Name: "+className);
	}
}

class XYZ2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[5];
		arr[0] = new CollegeStudent("Semester 1",87,77);
		arr[1] = new CollegeStudent("Semester 2",91,85);
		arr[2] = new SchoolStudent("Standard 4th", 45, 92);
		arr[3] = new SchoolStudent("Standard 6th", 59, 89);
		arr[4] = new SchoolStudent("Standard 9th", 62, 82);
		for(int i=0;i<5;i++){
			arr[i].show();
		}
	}
}


