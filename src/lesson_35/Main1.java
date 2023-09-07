package lesson_35;

public class Main1 {
    public static void main(String[] args) {

        SomeInterface someInterface = new SomeInterface(){
            @Override
            public void doSomething(String str){
                System.out.println(str.toLowerCase());
            }
        };

        someInterface.doSomething("HELLO");
    }
}
