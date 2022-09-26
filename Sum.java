class Sum
{
//creating methood
 public int sum (int a,int b)
{
int c;
c =a+b;
return(c);
}
//creating method sum {

public int sum(int a,int b ,int n)
{
return(a+b+n);
}
public double sum(double a,double b)
{
double c;
c=a+b;
return c;
}
public static void main(String[]args)
{
Sum s=new Sum();
System.out.println(s.sum(10,20));
//calling method
System.out.println(s.sum(10,20,30));
System.out.println(s.sum(4.5,33.7));
}
}
