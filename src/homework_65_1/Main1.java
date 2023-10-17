package homework_65_1;

public class Main1 {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("Main begin");
        ThreadChar1 threadChar= new ThreadChar1('*');
        threadChar.start();
        ThreadChar1 threadChar1=new ThreadChar1('#');
        threadChar1.start();

        threadChar1.join();
        threadChar.join();

        System.out.println("Main end");


    }
}
