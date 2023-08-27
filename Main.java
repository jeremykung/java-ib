import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        int myValue = 10000;
        System.out.println(myValue);
        int minInt = Integer.MIN_VALUE;
        System.out.println("int min value: " + minInt);
        System.out.println("int max value: " + Integer.MAX_VALUE);
        String me = "Jeremy";
        System.out.println(me);
        float myFloat = 1.2F;
        System.out.println(myFloat);

        // Arrays
        System.out.println("twoDArray");
        int[][] twoDArray = {
            {1, 2},
            {4, 6}
        };

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + "\t");
            }
            System.out.println("end of row");
        }

        // Test Questions
        int[] randomNums = {5, 9, 2, 4, 12, 7};
        getHighestNumber(randomNums);

        int[] straightNums = {1, 2, 3, 4, 5};
        reverseArray(straightNums);

    }

    static int[] reverseArray(int[] array) {
        System.out.println("Reversing array:");
        System.out.println(Arrays.toString(array));

        int[] reversedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - (1 + i)];
            System.out.println(Arrays.toString(reversedArray));
        }

        System.out.println("Reversed array:" + Arrays.toString(reversedArray));
        return reversedArray;
    }

    static int getHighestNumber(int[] array) {
        System.out.println("Getting highest number from array:");
        System.out.println(Arrays.toString(array));

        int highestNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highestNum) {
                highestNum = array[i];
            }
        }

        System.out.println("Highest number: " + highestNum);
        return highestNum;
    }
}