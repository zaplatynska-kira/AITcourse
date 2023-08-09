package homework_18;

public class HW18 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();

        ra.printArray();
        ra.add(7);
        ra.add(10);
        ra.add(25);
        ra.add(-20);
        ra.add(-5);
        ra.printArray();
        int raSize = ra.size();
        System.out.println("Сейчас в масиве  " + raSize + "  элементов");
        System.out.println("Сумма значений элементов массива " + ra.sumOfValues());
        ra.printArray();
        System.out.println(" min в массиве:  " + ra.min());
        System.out.println(" max в массиве:  " + ra.max());
        ra.deleteByIndex(3);
        ra.printArray();
        System.out.println("удаление элемента по индексу  ");
        ra.printArray();
        RubberArray rubberArray1 = new RubberArray();
        System.out.println("нахождение элемента по значению  ");
        System.out.println(ra.searchValue(25));
        ra.printArray();

    }
}
