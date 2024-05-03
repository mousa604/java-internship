import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream inputFile = new FileInputStream("Lincoln.txt.txt");
            Scanner fileScanner = new Scanner(inputFile);
            int wordCount = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Word count: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}