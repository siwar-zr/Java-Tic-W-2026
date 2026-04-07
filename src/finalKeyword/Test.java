package finalKeyword;

//final - variable (constante, pas de changement de valeur),
//        method (tu ne peux pas redefinir la methode lors d'un heritage de classe),
//        class (ne peut pas etre héritée --> pas de classes filles)

final class Calc{
    public final void show(){
        System.out.println("By John");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
/*class AdvCalc extends Calc{

    public void show(){
        System.out.println("By Mark");
    }
}*/


public class Test {
    public static void main(String[] args) {
        final int num = 8;
        //num = 9;
        //System.out.println(num);

/*        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4,6);*/
    }
}
