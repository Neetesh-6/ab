import java.util.Scanner;

class Airthmatic 
{
public static void main(String[] args) {
//creating scanner object to take from user
	Scanner sc= new Scanner (System.in);
//geeting input value from user
	System.out.println("enter first number'");
	int num1= sc.nextInt();
System.out.println("enter second number'");
int num2= sc.nextInt();
System.out.println("enter third number'");
int num3= sc.nextInt();
//writting opration
int add,sub,mul,div,mod;
add= num1+num2+num3;
sub= num1-num2-num3;
mul=num1*num2*num3;
div=num1/num2/num3;
mod=num1%num2%num3;
//getting a resultsys
System.out.println("addition is :"+add);
System.out.println("subtraction is :"+sub);
System.out.println("multipication is :"+mul);
System.out.println("divisiion is :"+div);
System.out.println("mudulo is :"+mul);
}
}