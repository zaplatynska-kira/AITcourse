package homework_53;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;


public class File {
    /*
      /*Написать метод, читающий текстовый файл и возвращающий строку,
       состоящую из строчек этого файла
     */

    public static String readFile(String fileName) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        StringWriter writer = new StringWriter()){

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.write(line + "\n");
                System.out.println(line);
            }

            return writer.toString();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            return null;
    }
    }

    public static void main(String[] args) {
        String fileName= "text.txt";
        try {
            String fileEnd= readFile(fileName);
            if (fileEnd!=null){
                System.out.println("File end:\n" + fileEnd);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());

        }
    }
}



