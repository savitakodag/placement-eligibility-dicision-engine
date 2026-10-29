
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Placement Eligibility Decision Engine ===");

        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();

        System.out.print("Enter percentage: ");
        double percentage = scanner.nextDouble();

        System.out.print("Enter number of backlogs: ");
        int backlogs = scanner.nextInt();

        System.out.print("Enter graduation year: ");
        int graduationYear = scanner.nextInt();

        // Create Candidate object
        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear
        );

        // Create Job object
        Job job = new Job(
                "Infosys",
                "Java Developer",
                65.0,
                0,
                2026
        );

        // Display candidate details
        System.out.println("\n--- Candidate Details ---");
        System.out.println("Name: " + candidate.getName());
        System.out.println("Percentage: " + candidate.getPercentage());
        System.out.println("Backlogs: " + candidate.getBacklogs());
        System.out.println("Graduation Year: "
                + candidate.getGraduationYear());

        // Display job requirements
        System.out.println("\n--- Job Details ---");
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println("Minimum Percentage: "
                + job.getMinimumPercentage());
        System.out.println("Maximum Backlogs: "
                + job.getMaximumBacklogs());
        System.out.println("Required Graduation Year: "
                + job.getRequiredGraduationYear());

        // Check eligibility
        boolean eligible
                = candidate.getPercentage() >= job.getMinimumPercentage()
                && candidate.getBacklogs() <= job.getMaximumBacklogs()
                && candidate.getGraduationYear()
                == job.getRequiredGraduationYear();

        System.out.println("\n--- Eligibility Result ---");

        if (eligible) {
            System.out.println("Eligible for placement!");
        } else {
            System.out.println("Not eligible for placement.");
        }

        scanner.close();
    }
}
