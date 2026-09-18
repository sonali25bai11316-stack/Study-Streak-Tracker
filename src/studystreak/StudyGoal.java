package studystreak;

public class StudyGoal {

    private int targetMinutes;
    private int completedMinutes;

    // Constructor
    public StudyGoal(int targetMinutes) {
        this.targetMinutes = targetMinutes;
        this.completedMinutes = 0;
    }

    // Get target minutes
    public int getTargetMinutes() {
        return targetMinutes;
    }

    // Set target minutes
    public void setTargetMinutes(int targetMinutes) {
        this.targetMinutes = targetMinutes;
    }

    // Get completed minutes
    public int getCompletedMinutes() {
        return completedMinutes;
    }

    // Add completed study time
    public void addStudyTime(int minutes) {
        if (minutes > 0) {
            completedMinutes += minutes;
        }
    }

    // Calculate remaining minutes
    public int getRemainingMinutes() {
        int remaining = targetMinutes - completedMinutes;

        if (remaining < 0) {
            return 0;
        }

        return remaining;
    }

    // Check whether goal is completed
    public boolean isGoalCompleted() {
        return completedMinutes >= targetMinutes;
    }

    // Display goal progress
    public void displayGoalProgress() {
        System.out.println("\n===== WEEKLY GOAL =====");
        System.out.println("Target: " + targetMinutes + " minutes");
        System.out.println("Completed: " + completedMinutes + " minutes");
        System.out.println("Remaining: " + getRemainingMinutes() + " minutes");

        if (isGoalCompleted()) {
            System.out.println("Goal Status: COMPLETED!");
        } else {
            System.out.println("Goal Status: In Progress");
        }
    }
}