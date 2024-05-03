package org.op;

/**
 * @author YZaychyk
 * @since 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("circle");
        Shape shape1 = new Shape("CIRCLE");
        String text = "dksfjdkfjdkfjdklfj";
        boolean isEquals = shape.equals(text);
        int hashcode = shape.hashCode();
        System.out.println(shape.toString());
        System.out.println(isEquals);
        System.out.println(hashcode);
    }

    public static void task3() {
        boolean a1, a2, b1, b2;

        for (int i = 0; i < 16; i++) {
            /*
             *   1111   15
             * & 1000   8
             *   1000   8
             * */
            a1 = (i & 8) > 0;
            a2 = (i & 4) > 0;
            b1 = (i & 2) > 0;
            b2 = (i & 1) > 0;
            System.out.println("a1 = " + a1 + "; a2 = " + a2 + "; b1 = " + b1 + "; b2 = " + b2);
            System.out.println("Result = " + function(a1, a2, b1, b2));
        }


    }

    public static boolean function(boolean a1, boolean a2, boolean b1, boolean b2) {
        return (a1 ^ a2) || !(b1 && b2);
    }
}
