package ClassObjectPractice;

public class Test2 {
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student();
	
	s1.name = "John";
	s1.roll_no = 2;
	s1.phn_no = 9812345678l;
	s1.address = "KTM";
	s1.StudentInfo();
	
	s2.name = "Sam";
	s2.roll_no = 3;
	s2.phn_no = 9812343478l;
	s2.address = "KTM";
	s2.StudentInfo();
}
	
}
