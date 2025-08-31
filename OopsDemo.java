//abstraction 
interface  pet {
   void run();
   void sound();
    
}
abstract class animal {
    abstract void sleep();
    
    void eat(){
        System.out.println("animal is eating");
    }
}

//Encapsulation
class person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
//Polymorphism
class Student {
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    double add(double a, double c){
        return a + c;
    }
}
//inheritance
class dog extends animal {
    void sleep(){
        System.out.println("dog is sleeping");
   
    }
    void bark(){
        System.out.println("the dog barking ");
    }
    @Override 
    void eat(){
        System.out.println("its eating ");
    }
}
class cat implements pet {
   public  void run(){
        System.out.println("cat is running");
    }
    public void sound(){
        System.out.println("cat mewos");
    }
}

public class OopsDemo {
    public static void main(String[] args) {
       //Encapsulation
        person p = new person();
        p.setName("sandeep");
        p.setAge(23);
        System.out.println("your name is " + " " +p.getName() + " your age is " + " "+p.getAge());
        //defines the polymorphism
        Student s = new Student();
        System.out.println(s.add(10,20));
        System.out.println(s.add(20,30,40));
        System.out.println(s.add(5.5,2.5));

        //abstract and  run time compilation methods is calling 
        dog d = new dog();
        d.sleep();
        d.bark();
        d.eat();
        //calling the interface methods 
        cat c = new cat();
        c.run();
        c.sound();
        
    }
}
