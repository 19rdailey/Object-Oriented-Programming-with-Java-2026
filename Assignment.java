import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {

    private String assignmentName;                      // Name of the assignment
    private double assignmentScore;                     // Grade received on the assignment
    private String className;                           // Name of the class

    // Constructor used to initialize the assignment name, grade, and class.
    public Assignment(String assignmentName, double assignmentScore, String className) {

        this.assignmentName = assignmentName;
        this.assignmentScore = assignmentScore;
        this.className = className;

    }

    // Getters used to retrieve the assignment name, grade, and class.
    public String getAssignmentName() {
        return assignmentName;
    }

    public double getAssignmentScore() {
        return assignmentScore;
    }

    public String getClassName() {
        return className;
    }

    // Setters used to update the assignment name, grade, and class.
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public void setAssignmentScore(double assignmentScore) {
        this.assignmentScore = assignmentScore;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // Prints the class name, assignment name, and assignment score back to the user.
    public void displayAssignment() {

        System.out.println("Class: " + className);
        System.out.println("Assignment: " + assignmentName);
        System.out.println("Score: " + assignmentScore + "%");

    }

    public boolean isValidScore() {

        return assignmentScore >= 0 && assignmentScore <= 100; // Checks if the assignment score is between 0 and 100.

    }

}
