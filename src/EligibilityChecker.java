
import java.util.ArrayList;
import java.util.List;

public class EligibilityChecker {

    private final List<EligibilityRule> rules;

    public EligibilityChecker() {
        rules = new ArrayList<>();

        rules.add(new PercentageRule());
        rules.add(new BacklogRule());
        rules.add(new GraduationYearRule());
    }

    public boolean checkEligibility(Candidate candidate, Job job) {
        boolean eligible = true;

        System.out.println("\n--- Eligibility Rule Results ---");

        for (EligibilityRule rule : rules) {
            boolean passed = rule.check(candidate, job);

            System.out.println(rule.getRuleName() + ": "
                    + (passed ? "PASS" : "FAIL"));

            if (!passed) {
                eligible = false;
            }
        }

        return eligible;
    }
}
