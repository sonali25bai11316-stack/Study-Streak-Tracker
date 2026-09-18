package studystreak;

import java.util.ArrayList;

public class StudyStatistics {

    private ArrayList<StudySession> sessions;

    // Constructor
    public StudyStatistics(ArrayList<StudySession> sessions) {
        this.sessions = sessions;
    }

    // Calculate total study time
    public int getTotalStudyTime() {
        int total = 0;

        for (StudySession session : sessions) {
            total += session.getDuration();
        }

        return total;
    }

    // Calculate number of study sessions
    public int getSessionCount() {
        return sessions.size();
    }

    // Calculate average study duration
    public double getAverageStudyTime() {
        if (sessions.isEmpty()) {
            return 0;
        }

        return (double) getTotalStudyTime() / sessions.size();
    }

    // Display statistics
    public void displayStatistics() {
        System.out.println("\n===== STUDY STATISTICS =====");
        System.out.println("Total sessions: " + getSessionCount());
        System.out.println("Total study time: " + getTotalStudyTime() + " minutes");
        System.out.println("Average session: "
                + String.format("%.2f", getAverageStudyTime())
                + " minutes");
    }
}