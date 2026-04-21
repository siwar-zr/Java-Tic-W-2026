package enums;

enum Status{
    Running,Failed,Success,Pending
}
public class Demo {
    public static void main(String[] args) {

        int i = 5;
        //Status s = Status.Pending;
        //System.out.println(s);
        //System.out.println(s.ordinal());
        Status[] ss = Status.values();
        //System.out.println(ss);
        for(Status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }

    }
}
