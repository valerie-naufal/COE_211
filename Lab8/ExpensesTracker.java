import java.io.*;
import java.util.Scanner;

public class ExpensesTracker {
    public static void main(String[]args) throws Exception {
        Scanner scan = new Scanner(System.in);
        File file1 = new File("expenses.txt");
        FileWriter fw = new FileWriter(file1,true);
        String answer,name,purchase,yn;
        Scanner scanfile = new Scanner(file1);
        double amount;

        do {
            System.out.print("Enter your name: ");
            name = scan.next();

            System.out.print("What did u purchase? ");
            purchase = scan.next();

            System.out.print("How much did you pay? ");
            amount = scan.nextDouble();

            System.out.print("Would you like to log another purchase? ");
            answer=scan.next();

            fw.write(name+" purchased "+ purchase+" for "+ amount +" US dollars. \n");

        } while (answer.equalsIgnoreCase("y"));

        fw.close();

        System.out.print("Would you like to view your purchases? ");
        yn=scan.next();

        if (yn.equals("y")){
            while (scanfile.hasNext()){
                String fileline=scanfile.nextLine();
            System.out.println(fileline);
            }
        }
        
    }
}