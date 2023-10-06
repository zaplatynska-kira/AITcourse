package practica_06_10_23;
import java.util.function.Function;
import java.util.function.Predicate;


    public class Main {
        /*
         /*
    Написать метод, принимающий строку, состоящую из слов разделенных пробелом и два функциональных интерфейса
     - function  и predicate.
     Метод должен предоставлять возможность реализации следующих действий:
     1. При длине слова = 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> "AAA BBBB DEF vbghR BBB"
     2. При длине слова = 4 изменить все буквы этого слова на строчные(маленькие) и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa bbbb deF vbghR bbb
     3. При длине слова = 5 изменить все буквы слова на звездочки  и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa BBBB deF ***** bbb
      Слова состоят только из букв латинского алфавита
      Протестировать.
         */

        public static void main(String[] args) {
            Main main = new Main();
            Predicate<String> predicate1 = word -> word.length() == 3;
            Function<String, String> function1 = String::toUpperCase;
            String str1 = "aaa BBBB deF vbghR bbb";
            System.out.println(main.transformString(str1, predicate1, function1));

            System.out.println();

            Predicate<String> predicate2 = word -> word.length() == 4;
            Function<String, String> function2 = String::toLowerCase;
            String str2 = "aaa BBBB deF vbghR bbb";
            System.out.println(main.transformString(str2, predicate2, function2));


            System.out.println();
            Predicate<String> predicate3 = word -> word.length() == 5;
            Function<String, String> function3= word -> "*****";
            String str3 = "aaa BBBB deF vbghR bbb";
            System.out.println(main.transformString(str3, predicate3, function3));
        }

        public String transformString(String input, Predicate<String> predicate, Function<String, String> function) {
            StringBuilder res = new StringBuilder();
            String[] parts = input.split(" ");
            for (String word : parts) {
                if (predicate.test(word)) {
                    word = function.apply(word);
                }
                res.append(word).append(" ");
            }
            return res.toString();
        }

    }



