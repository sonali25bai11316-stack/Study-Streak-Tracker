package studystreak;

import java.time.LocalDate;

public class StudySession {

private String subject;
private int duration;
private LocalDate date;

// Constructor
public StudySession(String subject, int duration, LocalDate date) {
this.subject = subject;
this.duration = duration;
this.date = date;
}

// Getter for subject
public String getSubject() {
return subject;
}

// Setter for subject
public void setSubject(String subject) {
this.subject = subject;
}

// Getter for duration
public int getDuration() {
return duration;
}

// Setter for duration
public void setDuration(int duration) {
this.duration = duration;
}

// Getter for date
public LocalDate getDate() {
return date;
}

// Setter for date
public void setDate(LocalDate date) {
this.date = date;
}

// Display session details
@Override
public String toString() {
return "Subject: " + subject
+ " | Duration: " + duration + " minutes"
+ " | Date: " + date;
}
}