package sample1;
 class Man {
    public String name;
    protected int age;
    private String Socialsecuritynumber;
    String address;
Man(String name,int age,String Socialsecuritynumber,String address){
    this.name=name;
    this.age=age;
    this.Socialsecuritynumber=Socialsecuritynumber;
    this.address=address;

    System.out.println("man constructor running");

}
}
 class ConstantValues{
     final double pi=3.14;
}

class Value extends ConstantValues{

}

class Employee extends Man{
     Employee(String name,int age,String Socialsecuritynumber,String address){
         super(name,age,Socialsecuritynumber,address);
         System.out.println("this is subclass");
     }

}
public class Person{
     public static void main(String[] args){
         Employee a1=new Employee("stark",25,"fjsdfgusgf21213","thanj");
         System.out.println(a1.name);
         System.out.println(a1.age);
         //System.out.println(a1.Socialsecuritynumber);
         System.out.println(a1.address);

     }

}