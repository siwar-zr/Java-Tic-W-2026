package abstraction;

//Une classe peut etre abstraite mais avec aucune methode abstraite --> pour ne pas etre instanciée
abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
abstract class BMW extends Car{


}

class AdvBMW extends BMW{  //Classe Concrete
    public void drive(){
        System.out.println("Driving BMW...");
    }
    public void fly(){
        System.out.println("Flying..");
    }
}
public class Test {
    public static void main(String[] args) {
        AdvBMW obj = new AdvBMW();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
