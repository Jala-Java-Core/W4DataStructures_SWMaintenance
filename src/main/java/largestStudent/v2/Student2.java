package largestStudent.v2;

import largest.v2.Address;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student2 extends Person {
    //Code W4-5
    private String studentID;
    private int graduationYear;
    private double gradePointAverage = 4.0;
    // (String) course name, (Double) grade point
    private Map<String, Double> coursesTaken = new HashMap<String, Double>();


    public Student2(String firstName, String lastName, String email, Address address, Date birthdate, String studentID, int graduationYear) {
        super(firstName, lastName, email, address, birthdate);
        this.studentID = studentID;
        this.graduationYear = graduationYear;
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

    public void setStudentID(String studentID) {
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

}
