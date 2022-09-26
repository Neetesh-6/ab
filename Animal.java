class Animal
{//methods and fields
String name;
public void eat(){
System.out.println("i can eat");
}
}
//use of extends keyword to performance inheritance
class Dog extends Animal

{//methods and fields of Animal
//methods and fields of Dog
public void display(){
System.out.println("my name is :"+name);
}
public static void main(String[] args){
//creating and object of sub class 
Dog d= new Dog();
//access fields of super class
d.name="bulldog";
d.display();
//call method of super class using object of sub class
d.eat();

}
}