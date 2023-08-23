package homework_23_r;

public class MainHW_23 {
    public static void main(String[] args) {
        BusDriver driver = new BusDriver("Bob", 33);
        System.out.println(driver.toString());

        driver.addCategories("C");
        driver.addCategories("D1");
        System.out.println(driver.toString());

        System.out.println();
        System.out.println("==========REMOVE===========");

        System.out.println(driver.removeCategory("D2"));
        System.out.println(driver.toString());

        System.out.println(driver.removeCategory("B"));
        System.out.println(driver.removeCategory("C"));
//        System.out.println(driver.removeCategory("D1"));
//        driver.removeAllCategories();
        System.out.println(driver.toString());

        System.out.println();
        System.out.println("====================");
        driver.addCategories("a");
        driver.addCategories("v");
        driver.addCategories("f");
        driver.addCategories("sdf");
        System.out.println(driver.toString());
        driver.testArrayCopy(4);



    }
    }

