//class Computer{
//    public void playMusic(){
//        System.out.println("Music Playing..");
//    }
//
//    public String giveMeSmthg(int cost){
//        if (cost >= 5){
//            return "Something";
//        }
//        return "Nothing";
//    }
//}
class Calculator{
    int num = 5;
    //Method overloading / Surchage des méthodes
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public int add(int a, int b){
        return a + b;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
//    public double add(int n1, int n2){
//        return n1 + n2;
//    }

}
public class POO {

    public static void main(String[] args) {
//        int num1 = 4;
//        int num2 = 5;

        int data = 10;

        Calculator calc = new Calculator();
        int r1 = calc.add(3,4,1);
        int r2 = calc.add(1,2);
        //System.out.println(r1);
        calc.num = 8;
        Calculator calc2 = new Calculator();
        System.out.println(calc.num);
        System.out.println(calc2.num);

//        int result = num1 + num2;
//        System.out.println(result);
//        Computer obj = new Computer();
//        obj.playMusic();
//        String str = obj.giveMeSmthg();
//        System.out.println(obj.giveMeSmthg(10));
    }

}
