package guru.qa;

public class FirstApp {
    public static void main(String[] args) {
        char symbol = 's';
        boolean flag = false;

        byte a = 12; // -128...127
        short c = 450; // -32768...32767
        int b = 657893; // -2147483648...2147483647
        long l = 14576893056L; // –9223372036854775808...9223372036854775807

        float f = 8.5F; //-3.4E+38...3.4E+38
        double d = 12.5D, D, x1, x2; //-1.7E+308...1.7E+308

        String thought = "When we realized that we are broke, " +
                "and nothing mends we can drop under the surface";

        char[] arrayCh = new char[]{'l','o','x'};
        double[][] TwoDimArray = new double[][] {{1,2,3},{5,6,7}};

        //вычислим дискриминант
        D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("X1 = " + x1 + "    " + "X2 = " + x2);
        } else {
            System.out.println("invalid data D < 0: " + D);
        }

        // посмотрим операции над разными типами переменных
        System.out.println();
        System.out.println("Sum Examples:");
        System.out.println("byte + int = " + (a+b));
        System.out.println("short + float = " + (c+f));
        System.out.println("double + float = " + (d+f));
        System.out.println();

        System.out.println("Subtraction Examples:");
        System.out.println("long - float = " + (l-f));
        System.out.println("byte - short = " + (a-c));
        System.out.println("double - int = " + (d-b));
        System.out.println();

        System.out.println("Multiplication Examples:");
        System.out.println("byte * float = " + a*f);
        System.out.println("short * long = " + c*l);
        System.out.println("double * float = " + d*f);
        System.out.println();

        System.out.println("Division Examples:");
        System.out.println("double/byte = " + d/a);
        System.out.println("The remainder of (double/byte) = "+ d%a);
        System.out.println("int/float = " + b/f);
        System.out.println("The remainder of (int/float) = "+ b%f);
        System.out.println("long/short = " + l/c);
        System.out.println("The remainder of (long/short) = "+ l%c);
        System.out.println();

        System.out.println("Increment Examples:");
        System.out.println("a++ = " + (a++)); //сначала возвращает значение, потом выполняет инкремент
        System.out.println("++a= " + (++a)); //сначала выполняет инкремент, потом возвращает значение
        System.out.println();

        System.out.println("Decrement Examples:");
        System.out.println("c-- = " + (c--));
        System.out.println("--c = " + (--c));
        System.out.println();

        //переполнение в min и max стороны
        byte bmax = Byte.MAX_VALUE, bmin = Byte.MIN_VALUE, bresult1,bresult2;
        bresult1 = (byte)(bmax*2);
        System.out.println("overflow to the max: bmax*2 = " + bresult1);
        bresult2 = (byte)(bmin*3);
        System.out.println("overflow to the min: bmin*3 = " + bresult2);
        System.out.println();

        // посмотрим switch
        switch (symbol){
            case 'j':
                System.out.println("The symbol is j");
                break;
            case 's':
                System.out.println("The symbol is s");
                break;
        }
        System.out.println();

        //посмотрим логические операторы
        if ((a < b) && (a!=c)){
            System.out.println(thought);
        }
    }
}
