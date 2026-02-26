public class Operators {

    public static void main(String[] args) {

        //Arithmetic
        //int num1 = 7;
//        int num2 = 5;
//
//        int result = num1 % num2;
        //num1 = num1 + 1;
        //num1 += 1;
        //int result = num1++; //Post-Increment
        //int result = ++num1;  //Pre-Increment
        //System.out.println(result);
        //System.out.println(num1);

        //Relational

        //> < >= >= == !=

//        int x = 6;
//        int y =6;
//
//        boolean result = x == y;
//        System.out.println(!result);

        //Logical

        // AND &     OR |     NOT !
        //     &&       ||     (shorcuts)

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y || a > b && a < 1;
        //Priority : && the ||
        System.out.println(!result);
    }
}
