package homework_23_r;

import lesson_23.Bus;

import java.util.Arrays;

public class BusDriver {
    private final int id;
    private String name;
    private String[] categories;
    private int age;

    static private int counter;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCategories() {
        return categories;
    }

    public void addCategories(String category) {
//        String[] temp = new String[categories.length + 1]; //Option 1
//        for (int i = 0; i < categories.length; i++) {
//            temp[i] = categories[i];
//        }
//        temp[temp.length -1] = category;
//        categories = temp;
        categories = Arrays.copyOf(categories, categories.length + 1); // Option2
        categories[categories.length - 1] = category;

    }

    public void testArrayCopy(int idx) { // Вариант 2 для удаления по индексу
        String[] strings = new String[categories.length - 1];
        if (idx < 0 || idx > categories.length - 1) return;
        System.arraycopy(categories, 0, strings, 0, idx);
        System.arraycopy(categories, idx + 1, strings, idx, strings.length - idx);

        System.out.println(Arrays.toString(strings));

    }

    public boolean removeCategory(String category) { // str.equals(str1)
        // 1. Такая строка в массиве есть?
        // 2. Нам нужен ее индекс
        // 3. Непосредственно удаление из массива
        int idx = searchCategoryValue(category);
        if (idx == -1) return false;


        String[] temp = new String[categories.length - 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < idx) {
                temp[i] = categories[i];
            } else {
                temp[i] = categories[i + 1];
            }
        }
        categories = temp;
        return true;
    }

    public void removeAllCategories() {
        categories = new String[0];
    }

    private int searchCategoryValue(String category) {
        if (category == null || category.length() == 0 || categories.length == 0) return -1;

        for (int i = 0; i < categories.length; i++) { // i < 9; i [0, 8(len-1)]
            if (category.equals(categories[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return "{id:" + id + "; name: " + name +
                "; categories: " + Arrays.toString(categories) + "}";
    }

    // метод запускающий у водителя функцию "управление автобусом"
    // в параметры метода приходит ссылка
    // на конкретный автобус, которым управляет сейчас водитель
    public void driveBus(Bus bus) {
        System.out.println("Водитель id:" + id +
                " управляет автобусом id:" + bus.getId() + " " + bus.getModel());
    }
}