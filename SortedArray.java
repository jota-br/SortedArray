import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        int[] myArray = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        for(int i = 0; i < size; ) {
            if(scanner.hasNextInt()) {
                myArray[i] = scanner.nextInt();
                i++;
            }
        }
        scanner.close();
        return myArray;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] myArray = new int[array.length];
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            myArray[i] = array[array.length-1-i];
        }

        return myArray;
    }
}