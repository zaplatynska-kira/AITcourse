package lesson_48;

public class Main2 {
    public static void main(String[] args) {
        try{
            throw new OurException("This is our error message");
        }
        catch (OurException e){
            System.out.println(e);
        }
    }
}
