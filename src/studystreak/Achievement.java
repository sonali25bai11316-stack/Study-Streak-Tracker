package studystreak;

public class Achievement {

    // Check achievement based on total study time
    public static String checkStudyTimeAchievement(int totalMinutes) {

        if (totalMinutes >= 600) {
            return "Study Master - 10 hours completed!";
        } else if (totalMinutes >= 300) {
            return "Dedicated Learner - 5 hours completed!";
        } else if (totalMinutes >= 100) {
            return "Getting Started - 100 minutes completed!";
        } else {
            return "Keep studying to unlock your first achievement!";
        }
    }

    // Check achievement based on study streak
    public static String checkStreakAchievement(int streak) {

        if (streak >= 7) {
            return "7-Day Streak Achievement unlocked!";
        } else if (streak >= 3) {
            return "3-Day Streak Achievement unlocked!";
        } else {
            return "Continue studying to build your streak!";
        }
    }

    // Display achievements
    public static void displayAchievements(int totalMinutes, int streak) {

        System.out.println("\n===== ACHIEVEMENTS =====");

        System.out.println("Study Time: "
                + checkStudyTimeAchievement(totalMinutes));

        System.out.println("Study Streak: "
                + checkStreakAchievement(streak));
    }
}