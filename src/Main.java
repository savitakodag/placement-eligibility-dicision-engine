
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();

        System.out.print("Enter percentage: ");
        double percentage = scanner.nextDouble();

        System.out.print("Enter number of backlogs: ");
        int backlogs = scanner.nextInt();

        System.out.print("Enter graduation year: ");
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(
                name, percentage, backlogs, graduationYear
        );

        Job job = new Job(
                "Infosys",
                "Java Developer",
                65.0,
                0,
                2025
        );

        System.out.println("\n--- Placement Eligibility Result ---");
        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());

        EligibilityChecker checker = new EligibilityChecker();

        boolean eligible = checker.evaluate(candidate, job);

        System.out.println("\nFinal Result: "
                + (eligible ? "ELIGIBLE" : "NOT ELIGIBLE"));

        scanner.close();
    }
}
