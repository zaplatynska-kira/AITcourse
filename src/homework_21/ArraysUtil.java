package homework_21;

public class ArraysUtil {

    public static int linearSearch(int[] array, int searchValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    private static int minIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    private static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }
    }

    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;  // 0
        int endIndex = array.length - 1; // 12
        int middleIndex;

        int counter = 0;

        while (startIndex <= endIndex) {
            counter++;

            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == searchValue) {
                //counter = 3
                System.out.println("Найден за " + counter + " шагов");
                return middleIndex;
            }

            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                // 1. startIdx = 7 (6 + 1)
                // 2. startIdx = 10 (9 +1)
                startIndex = middleIndex + 1;
            }
        }

        System.out.println("Ничего не найдено! Шагов сделано: " + counter);
        System.out.println("startIdx: " + startIndex + " endIdx: " + endIndex);
        return -1;
    }
    public static void printArray( int[] array) {
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
}
