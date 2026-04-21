package abstraction;

//class - class : extends
//class - interface : implements
//interface - interface : extends

interface A{
    int age = 40;   //final static
    String name = "John";
    void config();    //public abstract
    void show();
}

interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
    @Override
    public void run() {
        System.out.println("Running..");
    }

}

public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.config();
        obj.show();

        Y obj1 = new B();
        obj1.run();

        //A.age = 50;

        System.out.println(A.name);

    }
}
