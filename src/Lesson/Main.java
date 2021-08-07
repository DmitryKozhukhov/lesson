package Lesson;

public class Main {

    /**
     * Entry-point
     */
    public static void main(String[] args) {
        System.out.println(checkWorkingDay(1));
        System.out.println(checkWorkingDay(6));
        System.out.println(checkWorkingDay(2));
        System.out.println(checkWorkingDay(7));
    }

    static boolean checkWorkingDay(int day) {
        return day == 1 || day == 2 || day == 3 || day == 4 || day == 5;
    }

    static void doLogicalAndOperatorDemo() {
        System.out.println(isReadyToJoinArmy(18));
        System.out.println(isReadyToJoinArmy(17));
        System.out.println(isReadyToJoinArmy(27));
        System.out.println(isReadyToJoinArmy(31));
    }

    static boolean isReadyToJoinArmy(int age) {
        return age >= 18 && age <= 27;
    }

    static void doOptWayDemo() {
        optWay(1);
        optWay(4);
    }

    static void doLogicalOperatorDemo() {
        boolean safeDivision1 = isSafeDivision(0);
        System.out.println("Safe division 1: " + safeDivision1);

        boolean safeDivision2 = isSafeDivision(5);
        System.out.println("Safe division 2: " + safeDivision2);
    }

    static void doMethodsDemo() {
        doDataTypesDemo();
        int result = plusAandB();
        System.out.println("Sum: " + result);

        double result2 = calcSum(10, 2.5);
        System.out.println("Result1: " + result2);

        result2 = calcSum(7.5, 7.5);
        System.out.println("Result2: " + result2);

        int mod = calcMod(11, 3);
        System.out.println("Mod: " + mod);
    }

    static void optWay(int number) {
        if (number == 1) {
            System.out.println("Go straight forward!");
        } else if (number == 2) {
            System.out.println("Go left!");
        } else if (number == 3) {
            System.out.println("Go right!");
        } else {
            System.out.println("Go back!");
        }
    }

    /**
     * Basic arithmetical-logical operators:
     * >, >=, <, <=, ==, !=
     */
    static boolean isSafeDivision(double value) {
        boolean isSafe = value != 0;
        System.out.println("Is safe: " + isSafe);

        if (isSafe) {
            return true;
        }
        return false;
    }

    static int calcMod(int value, int delimeter) {
        return value % delimeter;
    }

    /**
     * Basic arithmetical operations:
     * <p>
     * +, -, *, /, %
     */
    static double calcSum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    static int plusAandB() {
        int a = 1;
        int b = 1;
        int sum = a + b;
        return sum;
    }

    static void doDataTypesDemo() { // Start of STACK
        /**
         * Primitive data types
         *
         * Integral digits
         * byte, short, int, long, char (symbol)
         *
         * Decimal (float-pointing)
         * float, double
         *
         * Logical
         * boolean
         */

        byte var1 = -128; // 1 byte memory, -128 - 127 (inclusive)
        int var2 = 124619246; // 4 bytes memory

        float var3 = 1;
        float var4 = 1.5F;
        double var5 = 1;
        double var6 = 1.5F;


        char var7 = 'c';
        char var8 = 123;

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(var7);
        System.out.println(var8);

        String helloWorld = "Hello, world!";

        System.out.println(helloWorld);
    } // End of STACK


}