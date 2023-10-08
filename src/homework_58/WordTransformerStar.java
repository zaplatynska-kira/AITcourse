package homework_58;

public class WordTransformerStar extends WordsTransformer {

    public boolean check(String input) {
        return input.length() == 5;
    }


    public String transform(String string) {
        return "*****";
    }
}
