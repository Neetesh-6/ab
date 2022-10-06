package CoreJava;
import java.util.Scanner;
 class Subjects {
	 private static Object sub;

	public static void main(String[] args) {
			// creating Scanner class
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first subj1 :");
			int sub1 = sc.nextInt();
			System.out.println("Enter second subj2 :");
			int sub2 = sc.nextInt();
			System.out.println("Enter third subj3 :");
			int sub3 = sc.nextInt();
			System.out.println("Enter fourth subj4 :");
			int sub4 = sc.nextInt();
			System.out.println("Enter five subj5 :");
			int sub5 = sc.nextInt();
			float per;
			per=(sub1+sub2+sub3+sub4+sub5)*100/500;
	 if (per>=60)
	 {
		 System.out.println("First class pass");//if result is 60+
	 }
	  else if(per<=60 && per>=33) 
	 {
    System.out.println("second division");//if result is 60-
	 }
	  else
	  {System.out.println("Fail");// per is less than 33
	 }	
	}
 }