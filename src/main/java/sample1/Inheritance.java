package sample1;

abstract class   Animal{
    String name;
    int age;
    void makesound()
    {
        System.out.print("sample1.Animal make sound");
    }

}
class Dog extends Animal{
    String breed;
 void makesound(){
        System.out.print("sample1.Dog barks");
    }

    void fetch(){
        System.out.print("sample1.Dog is fetching");
    }
}
class Cat extends Animal{
    String color;
    void makesound(){
        System.out.print("cat meows");
    }
    void climb()
    {
        System.out.print("cat is climbing");
    }
}
public class Inheritance{
    public static void main(String[] args)
    {
        Dog obj1=new Dog();
        obj1.name="monti";
        obj1.age=3;
        obj1.breed="dog breed";
        Cat obj2=new Cat();
        obj2.color="brown";
        obj2.climb();
        obj1.fetch();

    }
}