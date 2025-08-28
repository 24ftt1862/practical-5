import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the 5 letters word: ");
        String word = input.nextLine();

        if (word.length() != 5){ //!= is not equal to
            System.out.print("Error! words must have 5 letters");
        } else {
            String reverse = "";
            for (int i= word.length() -1; i >=0; i--){
            reverse += word.charAt(i);
            }
         
        System.out.println("The reverse of the word "+word+ " is "+reverse);
        }

    }
}
// done