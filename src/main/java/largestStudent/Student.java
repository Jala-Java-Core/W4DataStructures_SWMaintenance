package largestStudent;

import largest.v2.Address;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student {
    //Code W4-5
    private String studentID;
    private int graduationYear;
    private double gradePointAverage = 4.0;
    // (String) course name, (Double) grade point
    private Map<String, Double> coursesTaken = new HashMap<String, Double>();
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private Date birthdate;

    public Student(String firstName, String lastName, String email, Address address, Date bithdate, String studentID, int graduationYear) {

    }

    public void completedCourse(String course, double courseGradePoint) {
        coursesTaken.put(course, courseGradePoint);
        updateGradePointAverage();
    }

    private void updateGradePointAverage() {}

    // getters and setters specific to student information
    public String getSudentID() {
        return this.studentID;
    }

    public void setSStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getGraduationYear() {
        return this.graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public double getGradePointAverage() {
        return this.gradePointAverage;
    }

    public void setGradePointAverage(int gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    // getters and setters for basic information-that is,
    // people in general, not just students, have this information
    public String getFullName() {
        return this.firstName + ' ' + this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateEmail(String email) {
        this.email = email;
    }
}
