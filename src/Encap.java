import java.util.Scanner;

class Human{
    private int age;
    private String name;

    public Human(){
        age = 12;
        name = "Mark";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encap {

    public static void main(String[] args) {

//        Human h1 = new Human(12, "Mark");
//        Human h2 = new Human(50, "John");
//
//        System.out.println(h1.getName() + " : " + h1.getAge());
//        System.out.println(h2.getName() + " : " + h2.getAge());
//        h1.age = 29;
//        h1.name="John";
//        h1.setAge(29);
//        h1.setName("John");
//
//        System.out.println(h1.getName() + " : " + h1.getAge());
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre age : ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Entrez votre nom : ");
        String name = sc.nextLine();



        Human h3 = new Human(age, name);
        System.out.println(h3.getName() + " : " + h3.getAge());


    }
}
