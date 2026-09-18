**Study Streak Tracker**

A beginner-friendly console-based Java application designed to help students track their study sessions, monitor study streaks, set weekly study goals, view statistics, and unlock achievements.

**Project Overview:**\- 

Students often study regularly but may not keep track of their study time and consistency.

**Study Streak Tracker** provides a simple way to:

\- Record study sessions  
\- Track study duration  
\- Record study dates  
\- Calculate the current study streak  
\- Track weekly study time  
\- Set weekly study goals  
\- Monitor weekly goal progress  
\- View study statistics  
\- Unlock achievements  
\- Save study data locally

The project is developed using core Java and Object-Oriented Programming concepts.

**Features:**\- 

1\.  Add Study Session  
Users can enter:

\- Subject name  
\- Study duration in minutes  
\- Study date

The application also allows the user to press Enter to automatically use the current date.

 2\.  View Study Sessions  
Displays all recorded study sessions along with:

\- Subject  
\- Duration  
\- Date

3\.  View Statistics  
The application calculates:

\- Total study time  
\- Current week's study time  
\- Current study streak  
\- Weekly study goal  
\- Weekly goal progress percentage  
\- Weekly goal completion status

 4\.  Weekly Study Goal  
Users can set a target number of study minutes for the week.

Example:

Weekly Goal: 500 minutes

**Technologies Used:**\-   
\- Java  
\- Java Collections Framework  
\- Java Date and Time API  
\- Java File I/O

 **Project Structure:**\- 

STUDY-STREAK-TRACKER/  
│  
├── src/  
│   └── studystreak/  
│       ├── StudyStreak.java  
│       ├── StudySession.java  
│       └── StudyTracker.java  
│  
├── README.md  
├── PROJECT\_REPORT.md  
└── .gitignore

## 

## 

## **How to Run the Project**

### **Compile**

javac \-d out src/studystreak/\*.java

### **Run**

java \-cp out studystreak.StudyStreak

## 

## 

## **Example**

\========== STUDY STREAK TRACKER \==========

1\. Add Study Session  
2\. View Study Sessions  
3\. View Statistics  
4\. Set Weekly Goal  
5\. View Achievements  
6\. Exit

Enter your choice: 1

Enter subject: Java  
Enter study duration: 60  
Enter date: 2026-09-18

Study session added successfully\!

## 

## 

## **How It Works**

The user records study sessions by entering the subject, duration, and date. The application stores the sessions locally and uses them to calculate study time, weekly progress, and consecutive study-day streaks.

## 

## **Author**

**Sonali**  
 B.Tech CSE (AI & ML)  
 VIT Bhopal

## **Future Improvements**

* GUI using Java Swing  
* Subject-wise study analysis  
* Monthly study reports  
* Progress charts  
* Study reminders

