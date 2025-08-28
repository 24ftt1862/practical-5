import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        FileWriter writer = new FileWriter("C:\\Practical 5/ QReceipt.txt");

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Receipt generated. Thank you ");


        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter FormatLdt = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
        String FormattedLdt = ldt.format(FormatLdt);

        int queue = (int)(Math.random()*100);

        writer.write("\n" +FormattedLdt);
        writer.write("\n"+"Hi, " +name.toUpperCase());
        writer.write("\n"+"Your queue No is : "+ queue);

        writer.close();
    }
}
//done