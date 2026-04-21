package functionalInterface;

@FunctionalInterface
interface A{
//    void show(int i,int j);
    int add(int i, int j);
}

/*class B implements A{
    public void show(){
        System.out.println("In show");
    }
}*/
public class Demo {
    public static void main(String[] args) {

        /*A obj = (i,j) -> System.out.println("In show" + i);
        obj.show(5,2);*/

        A obj = (i,j) ->  i+j;



        int result = obj.add(3,6);
        System.out.println(result);

    }
}
