public class Main {
    public static void main(String[] args) {
        int a =46;
        int b = 5;


        if (a < b) System.out.println("a < b");
        if (a > b) System.out.println("a > b");
        if (a == b)  System.out.println("a > b");

        if ( (a + b) % 2 == 0) {System.out.println("maybe a and b are even");}
                else {System.out.println("some variable is odd");}

        if (a > 10) System.out.println("a > 10");
        if (a < 100) System.out.println("a < 100");
        if (a / 2 < 20) System.out.println("a / 2 is more then 20");
        if (a >= 5 && a <= 40) {System.out.println("a is between 5 and 40");}
                else {System.out.println("a is than 5, or more then 40");}
    }
}