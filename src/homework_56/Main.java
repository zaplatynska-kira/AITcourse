package homework_56;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        /*
         1. Конкатинировть числа  a  и  b
           пример  1 и 2 -> 12
           Integer.toString(a + b)
         */

        Concatable concatable = (a, b) -> Integer.toString(a) + b;
        String result = concatable.concat(1, 2);
        System.out.println(result);

        /*
        2. Если длина строки  = 3  вернуть true  иначе false

         */
        Checkable checkable = str -> str.length() == 3;
        System.out.println(checkable.check("abc"));// true
        System.out.println(checkable.check("abcd"));// false
    /*
    Если длина строки четная  вернуть true  иначе false
     */
        Checkable checkable1 = str -> str.length() % 2 == 0;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

      /*
Вернуть строку в верхнем регистре
 */
        Transformable transformable = str -> str.toUpperCase(Locale.ROOT);
        System.out.println(transformable.modify("abcd"));

          /*
Если длина строки = 4 вернуть четыре звездочки **** иначе вернуть строку без изменений
 */
        Transformable transformable1 = str -> str.length() == 4 ? "*****" : str;
        System.out.println(transformable1.modify("abcd"));
        System.out.println(transformable1.modify("abc"));

          /*

 Распечатать строку в виде !строка!
 */

        Transformable transformable2 = str -> "!" + str + "!";

        String result1 = transformable2.modify("строка");
        System.out.println("Результат: " + result1);

      /*

 возвращает  "Hello World"
 */

        Producable producable = () -> "Hello world";
        System.out.println(producable.produce());

    }

}
