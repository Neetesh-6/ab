import java.util.scanner;

public class Airthmatic 
{
public static void main(String[] args) {
//creating scanner object to take from user
	Scanner sc= new Scanner (system.in);
//geeting input value from user
	System.out.println("enter first number'");
	int num1= sc.nextInt();
System.out.println("enter second number'");
int num2= sc.nextInt();
//writting opration
int add,sub,mul,div,mod;
add= num1+num2;
sub= num1-num2;
mul=num1*num2;
div=num1/num2;
mod=num1%num2;
//getting a resultsys
System.out.println("addition is :"+add);
System.out.println("subtraction is :"+sub);
System.out.println("multipication is :"+mul);
System.out.println("divisiion is :"+div);
System.out.println("mudulo is :"+mul);
}
}