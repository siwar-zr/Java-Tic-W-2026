class Hello{
    public static void main(String[]args){
        int num1 = 200;
        byte by = 127;
        short sh = 588;
        long l = 10000000000l;

        float f = 5.8f;
        double d = 147.258;

        char c = 'k';

        boolean b = true;

        //literals

        int num2 = 0b101;
        //System.out.println(num2);

        int num3 = 0x7f;
        //System.out.println(num3);

        long l1 = 100_00_00_000;
        //System.out.println(l1);

        double num4 = 12558e10;
        //System.out.println(num4);

        int num5 = 6;
        num5++;
        //System.out.println(num5);

        char ch = 'a';
        ch++ ;
        //System.out.println(ch);

        byte b2 = 127;
        int a = 300;

        //b2 = a; conversion explicite
        //a = b2; conversion implicite

        b2 = (byte) a; //b2 = a % range(byte)
        //System.out.println(b2);

        float fl = 5.6f;
        int x = (int)fl;

        System.out.println(x);





    }
}

