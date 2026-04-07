
class A extends Object{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int a){
        super();
        System.out.println("In A int");
    }

}
class B extends A{
    public B(){
        super(5);
        System.out.println("In B");
    }
    public B(int n){

        this();
        System.out.println("In B int");
    }

}


/*class A{
    public void show(){
        System.out.println("In A Show");
    }
    public void config(){
        System.out.println("In A Config");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
}*/



public class Heritage {

    public static void main(String[] args) {

//        ScientCalc obj = new ScientCalc();
//        int r1 = obj.add(4,5);
//        int r2 = obj.sub(7,3);
//        int r3 = obj.multi(2,5);
//        int r4 = obj.div(10,5);
//        double r5 = obj.power(4,2);
//        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

        B obj = new B(5);

/*        B obj = new B();
        obj.show();
        obj.config();*/

//        AdvCalc obj = new AdvCalc();
//        System.out.println(obj.add(3,2));

    }
}
