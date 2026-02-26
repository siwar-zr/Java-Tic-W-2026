public class Conditions {
    public static void main(String[] args) {

//        int x = 8;
//
//        if(x > 10 && x <= 20) // 11 -> 20
//            System.out.println("Hello !");
//        else
//            System.out.println("Bye !");

//        int x = 18;
//        int y = 10;
//        int z = 43;
//
//        if(x > y && x > z)
//            System.out.println(x);
//        else if (y > z)
//            System.out.println(y);
//        else
//            System.out.println(z);

//        int age = 19;
//        boolean tr = false;
//
//        //Méthode 1
//        if (age < 18)
//            System.out.println("Mineur");
//        else if (tr)
//            System.out.println("Majeur et travaille");
//        else
//            System.out.println("Ne travaille pas !");


        //Méthode 2
//        if (age < 18)
//            System.out.println("Mineur");
//        else{
//            if (tr)
//                System.out.println("Majeur et travaille");
//            else
//                System.out.println("Ne travaille pas !");
//        }
        //Methode 3
//        String msg = "";
//        msg = age < 18 ? "Mineur" : tr ? "Majeur et travaille ": "Ne travaille pas !";
//        System.out.println(msg);


//        int n = 10;
//        int result = 0;

//        if (n%2 == 0)
//            result = 10;
//        else
//            result = 20;

        // Ternary Operator
        // var = condition ? val si true : val si false
        // var = condition 1 ? val si true : condition 2 ? val si true : val si false
//        result = n%2 == 0 ? 10 : 20;
//        System.out.println(result);

        int n = 5;

//        if (n==1)
//        System.out.println("Sunday");
//        else if (n==2)
//        System.out.println("Monday");
//        else if (n==3)
//        System.out.println("Tuesday");
//        else if (n==4)
//        System.out.println("Wednesday");
//        else if (n==5)
//        System.out.println("Thursday");
//        else if (n==6)
//        System.out.println("Friday");
//        else
//        System.out.println("Saturday");

        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid number !");


        }

    }


}
