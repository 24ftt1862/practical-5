import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ModulusQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            new File("C:\\Practical 5").mkdir();

            String filename = "C:\\Practical 5\\Modulus Questions.txt";

            FileWriter writer = new FileWriter(filename, true);

            int no1 = (int)(Math.random() * 100);
            int no2 = (int)(Math.random() * 100);

            writer.write(no1 + " % " + no2 + " = ?\n");
            writer.close();

            System.out.println("A new question added to " + filename);

        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }

        input.close();
    }
}
