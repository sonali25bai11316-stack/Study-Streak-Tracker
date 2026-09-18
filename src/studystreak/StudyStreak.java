package studystreak;

import java.time.LocalDate;
import java.util.Scanner;

public class StudyStreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudyTracker tracker = new StudyTracker();

        int choice;

        do {

            System.out.println();
            System.out.println("==============================");
            System.out.println("     STUDY STREAK TRACKER");
            System.out.println("==============================");
            System.out.println("1. Add Study Session");
            System.out.println("2. View Study Sessions");
            System.out.println("3. View Statistics");
            System.out.println("4. Set Weekly Goal");
            System.out.println("5. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter subject: ");
                    String subject = scanner.nextLine();

                    System.out.print("Enter study duration in minutes: ");
                    int duration = scanner.nextInt();

                    LocalDate date = LocalDate.now();

                    StudySession session =
                            new StudySession(subject, duration, date);

                    tracker.addSession(session);

                    System.out.println("Study session added successfully!");

                    break;

                case 2:

                    tracker.displaySessions();

                    break;

                case 3:

                    tracker.displayStatistics();

                    break;

                case 4:

                    System.out.print("Enter weekly goal in minutes: ");
                    int goal = scanner.nextInt();

                    tracker.setWeeklyGoal(goal);

                    System.out.println("Weekly goal updated successfully!");

                    break;

                case 5:

                    System.out.println();
                    System.out.println("Thank you for using Study Streak Tracker!");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}