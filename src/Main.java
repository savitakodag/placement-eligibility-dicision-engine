
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        if (!scanner.hasNext()) {
            System.out.println("No input received. Run the program in the terminal and enter your values.");
            scanner.close();
            return;
        }
        String name = scanner.next();

        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        System.out.print("Enter number of backlogs: ");
        int backlogs = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Backlogs: " + backlogs);

        scanner.close();
    }
}
