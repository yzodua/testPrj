package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        showdo();
        System.out.println( (new Main()).defineColor(100));
    }

    public static String test(int speed, int fuelLevel) {
        if (speed > 50) {
            System.out.println("Speed exceeds the limit!");
        } else if (speed < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Acceptable speed");
        }

        return fuelLevel == 70 ^ fuelLevel > 100 ? "Continue refuel" : "Stop refuel";

    }

    public String defineColor(int colorCode) {
        int[] newArray = new int[5];
        int[] fixedArray = {0, 1, 2, 3};
        int[] sameReference = fixedArray;

        newArray[0] = 100_000;
        newArray[2] = fixedArray[2];
        sameReference[3] = -10;

        String[] arguments = {"one", "two", "three"};
        System.out.println(arguments[1]);

        int sum = 0;
        for (int counter = 0; counter <= 100; counter++) {
            System.out.println(counter);
            sum += counter;
        }
        System.out.println(sum);

        float number = 253.78f;
        while (number > 0.8) {
            System.out.println(number);
            number -= 0.4;
        }

        char[] letters = {'F', 'i', 'n', 'i', 's', 'h'};
        int index = 0;
        String word = "";
        do {
            word = word + letters[index++];
        } while (index < letters.length);



        String colorName;
        switch (colorCode) {
            case 587 ->  colorName = "Dark blue";
            case 234 ->  colorName = "Light green";
            default  ->  colorName = "Unknown color";
        }
        return colorName;
    }

    public static void showdo() {
        char[] letters = {'F', 'i', 'n', 'i', 's', 'h'};
        int index = 0;
        String word = "";
        do {
            word = word + letters[index++];
        } while (index < letters.length);
        System.out.println(word);
    }
}