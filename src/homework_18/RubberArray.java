package homework_18;

import java.util.Arrays;

public class RubberArray {
    int[] array;

    public RubberArray() {
        this.array = new int[0];
    }

    public void add(int value) {
        extractArray();
        array[array.length - 1] = value;
    }

    public void extractArray() {
        array = Arrays.copyOf(array, array.length + 1);
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");

            }
        }
        System.out.println("]");
        System.out.println();
    }

    public int size() {
        return array.length;
    }

    public int sumOfValues() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public int min() {
        if (array.length == 0) return Integer.MIN_VALUE;
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int max() {
        if (array.length == 0) return Integer.MIN_VALUE;
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;

    }

    public void deleteByIndex(int index) {
        if (array.length >= 1) {

            int[] result = new int[array.length - 1];

            for (int i = 0; i < result.length; i++) {

                if (i < index) {
                    result[i] = array[i];
                } else {
                    result[i] = array[i + 1];

                }
            }
            //System.out.println("result"  + Arrays.toString(result));
            array = result;
        }
    }

    public int searchValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) return i;
        }
        return -1;
    }
}













