

public class Demo {
    public static void main(String[] args) {

        String name = new String("John");
        name = name + " Doe";
        //System.out.println("Hello " + name);
//        System.out.println(name.charAt(1));
//        System.out.println(name.concat(" Doe"));
        String s1 = "john";
        String s2 = "john";

        //s1[1]='i';


        //System.out.println(s1 == s2);

        StringBuffer sb = new StringBuffer("John");
        sb.append(" Doe");
        System.out.println(sb);
        sb.deleteCharAt(2);
        //sb.insert(0,"Hello ");
        sb.setLength(30);
        String str = sb.toString();

        System.out.println(str);
        System.out.println(sb.capacity());












    }
}
