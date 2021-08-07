package Homework;

public class Homework {

    public static void main(String[] args) {
        doDataTypesDemo();
        System.out.println(calcMethod());
        System.out.println(checkingMethod(10, 10));
        determiningMethod(0);
        System.out.println(returnMethod(-1));
        outputMethod("Макс");
        leapYear(200);
    }

    static void doDataTypesDemo() {                                    // 2 задание

        /**
         * Primitive data types
         *
         * Integral digits
         * byte, short, int, char (symbol)
         *
         * Decimal (float-pointing)
         * float, double
         *
         * logical
         * boolean
         */

        byte var1 = 100;
        short var2 = 12412;
        int var3 = 1231231;
        long var4 = 1234235555;
        char var5 = 'C';
        char var6 = 145;

        float var7 = 45.5F;
        double var8 = 1.12344;

        boolean isTrue = true;
        boolean isFalse = false;

        String helloWorld = "Hello, world";

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
        System.out.println(isTrue);
        System.out.println(isFalse);
        System.out.println(helloWorld);
    }

    static float calcMethod() {                                         // 3 задание
        float a = 1;
        float b = 2;
        float c = 12;
        float d =4;
        float result = a * (b + (c / d));
        return result;
    }

    static boolean checkingMethod(int value1, int value2) {             // 4 задание
        int result1 = value1 + value2;
        return result1 >= 10 && result1 <= 20;
    }

    static void determiningMethod (int number) {                        // 5 задание
        if (number >= 0) {
            System.out.println("Число положительное");
        } else
            System.out.println("Число отрицательное");
    }

    static boolean returnMethod (int number1) {                         // 6 задание
        if (number1 >= 0) {
            return false;
        } else
            return true;
    }

    static void outputMethod(String Name) {                             // 7 задание
        System.out.println("Привет, " + Name);
    }

    static void leapYear(float age) {                                   // 8* задание
        if (age % 4 != 0) {
            System.out.println("Невисокосный год");
        } else if (age >= 400 && age % 400 != 0){
            System.out.println("Невисокосный год");
        } else if (age >= 100 && age % 100 == 0 && age % 400 != 0){
            System.out.println("Невисокосный год");
        } else
            System.out.println("Високосный год");
    }
}
