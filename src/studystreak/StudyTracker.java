package studystreak;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudyTracker {

    private ArrayList<StudySession> sessions;
    private int weeklyGoal;

    // Constructor
    public StudyTracker() {
        sessions = new ArrayList<>();
        weeklyGoal = 300;
    }

    // Add a study session
    public void addSession(StudySession session) {
        sessions.add(session);
    }

    // Set weekly study goal
    public void setWeeklyGoal(int minutes) {
        weeklyGoal = minutes;
    }

    // Get weekly study goal
    public int getWeeklyGoal() {
        return weeklyGoal;
    }

    // Calculate total study time
    public int getTotalStudyTime() {

        int total = 0;

        for (StudySession session : sessions) {
            total = total + session.getDuration();
        }

        return total;
    }

    // Calculate current study streak
    public int getStreak() {

        if (sessions.isEmpty()) {
            return 0;
        }

        ArrayList<LocalDate> dates = new ArrayList<>();

        for (StudySession session : sessions) {

            if (!dates.contains(session.getDate())) {
                dates.add(session.getDate());
            }
        }

        LocalDate currentDate = LocalDate.now();
        int streak = 0;

        while (dates.contains(currentDate)) {
            streak++;
            currentDate = currentDate.minusDays(1);
        }

        return streak;
    }

    // Display all study sessions
    public void displaySessions() {

        if (sessions.isEmpty()) {
            System.out.println("No study sessions recorded.");
            return;
        }

        System.out.println("\n===== STUDY SESSIONS =====");

        for (StudySession session : sessions) {
            System.out.println(session);
        }
    }

    // Display statistics
    public void displayStatistics() {

        System.out.println("\n===== STUDY STATISTICS =====");

        System.out.println("Total study time: "
                + getTotalStudyTime() + " minutes");

        System.out.println("Current streak: "
                + getStreak() + " day(s)");

        System.out.println("Weekly goal: "
                + weeklyGoal + " minutes");
    }
}