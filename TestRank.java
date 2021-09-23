package assignment22092021;

public class TestRank extends TestMark {
	@Override
	public double calRank(String name, double mark1, double mark2, double mark3) {
		// TODO Auto-generated method stub
		System.out.println("Student Name : " +name);
		System.out.println("Student Mark1 : " +mark1);
		System.out.println("Student Mark2 : " +mark2);
		System.out.println("Student Mark3 : " +mark3);
		System.out.println("Student Total Mark : " +(mark3+mark2+mark1));
		if((mark1+mark2+mark3)*.01>80) {System.out.println("Distinction");}
		if((mark1+mark2+mark3)*.01>60 &&(mark1+mark2+mark3)*.01<70) {System.out.println("First Class");}
		if((mark1+mark2+mark3)*.01>50 &&(mark1+mark2+mark3)*.01<60) {System.out.println("Second Class");}
		if((mark1+mark2+mark3)*.01<50) {System.out.println("Third Class");}
		return 0;
	}
}
