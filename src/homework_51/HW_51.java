package homework_51;
import java.io.FileInputStream;
import java.io.IOException;
public class HW_51 {

        public static void main(String[] args) throws IOException {
            String fileName1 = "first.txt";
            String fileName2 = "second.txt";

            FileInputStream file1 = new FileInputStream(fileName1);
            FileInputStream file2 = new FileInputStream(fileName2);

            boolean result = true;
            int i;
            int j;

            do {
                i = file1.read();
                j = file2.read();

                if (i != j) {
                    result = false;
                    break;
                }
            } while (i != -1 && j != -1);

            if (result && i == -1 && j == -1) {
                System.out.println("the files  same");
            } else {
                System.out.println("the files are not same");
            }

            System.out.print("first.txt:  " + ""+ (char) i);
            System.out.println();
            System.out.print("second.txt:  " + ""+ (char) j);
            file1.close();
            file2.close();
        }
    }


