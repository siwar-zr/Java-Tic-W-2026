package Exceptions;

//1) Compile Time Error
//2) Runtime Error -> Exception Handling
//3) Logical Error
public class Demo {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try{
            j = 18/i; //Ligne critique
            System.out.println(str.length()); //Ligne critique
            System.out.println(nums[1]);
            System.out.println(nums[5]); //Ligne critique
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in ur limits");
        }
        catch(Exception e){
            System.out.println("Something went wrong.. " + e);
        }

        System.out.println(j);

    }
}
