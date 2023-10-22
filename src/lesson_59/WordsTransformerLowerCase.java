package lesson_59;

public class WordsTransformerLowerCase extends WordsTransformerLowerCase{
    @Override
    public boolean check(String input) {
        return input.length() == 4;
    }

    @Override
    public String transform(String string) {
        return string.toLowerCase();
    }
}
