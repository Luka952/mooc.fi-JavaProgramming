
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int min = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int help = array[index1];
        array[index1] = array[index2];
        array[index2] = help;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int s = indexOfSmallestFrom(array, i);
            swap(array, s, i);
        }
    }
}
