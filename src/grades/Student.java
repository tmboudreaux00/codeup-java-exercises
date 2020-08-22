package grades;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private static DecimalFormat df = new DecimalFormat("0.00");
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> courses = new ArrayList<>();
    private String listName;
    public static String name;
    public static String year;
    private ArrayList<String> firstLast = new ArrayList<>();
    private ArrayList<String> lastFirst = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();
    private HashMap<String, String> courseGrade = new HashMap<>();
    private ArrayList<String> studentDetails = new ArrayList<>(); //includes student name, average, courses/grades

    //Sets firstLast, lastFirst, name, nameList
    public void setName(String firstName, String lastName){
        firstLast.add(firstName + " " + lastName);
        lastFirst.add(lastName + ", " + firstName);
        name = String.valueOf(firstLast);
        listName = String.valueOf(lastFirst);
    }

    public static String getName(){
        return name;
    }

    private String DOB;
    private String setDOB(int month, int day, int year){
        DOB = month + "/" + day + "/" + year;
        return DOB;
    }
    public String dobYear(){
        String[] DOBArr = DOB.split("/");
        year = DOBArr[2];
        return year;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public void setCourses(){
        String defaultCourses = "Algebra Biology English Phys_Ed Swahili US_History";
        String[] defaultCoursesArr = defaultCourses.split(" ");
        for (int i = 0; i < defaultCoursesArr.length; i++){
            courses.add(defaultCoursesArr[i]);
        }
    }
    public void setGrades() {
        String setCourse;
        int setGrade;
        for (int i = 0; i < courses.size(); i++) {
            setCourse = courses.get(i);
            setGrade = grades.get(i);
            courseGrade.put("\n" + setCourse + " ", " " + setGrade);
        }
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        double average;
        for (int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        average = total/grades.size();
        return average;
    }
    //includes student name, average, courses/grades - arraylist string studentdetails
    public void setDetails() {
        String[] studentDetailsArr = {listName + "\nDOB: " + DOB + "\nAverage Grade: " + getGradeAverage() + "\n" + courseGrade};
        studentDetails.add(studentDetailsArr[0]);
        System.out.println(studentDetails);
    }

    public static void main(String[] args) {
        Student cletusMack = new Student();
        cletusMack.setName("Cletus", "Mack");
        cletusMack.setDOB(01, 01, 1991);
        cletusMack.addGrade(80);
        cletusMack.addGrade(82);
        cletusMack.addGrade(84);
        cletusMack.addGrade(86);
        cletusMack.addGrade(88);
        cletusMack.addGrade(90);
        cletusMack.setCourses();
        cletusMack.setGrades();
        cletusMack.setDetails();
        System.out.println();
        Student hayseedWilliams = new Student();
        hayseedWilliams.setName("Hayseed", "Williams");
        hayseedWilliams.setDOB(02, 02, 1992);
        hayseedWilliams.addGrade(90);
        hayseedWilliams.addGrade(92);
        hayseedWilliams.addGrade(94);
        hayseedWilliams.addGrade(96);
        hayseedWilliams.addGrade(98);
        hayseedWilliams.addGrade(100);
        hayseedWilliams.setCourses();
        hayseedWilliams.setGrades();
        hayseedWilliams.setDetails();
        System.out.println();
        Student martha_jeanAnderson = new Student();
        martha_jeanAnderson.setName("Martha Jean", "Anderson");
        martha_jeanAnderson.setDOB(03, 03, 1993);
        martha_jeanAnderson.addGrade(70);
        martha_jeanAnderson.addGrade(72);
        martha_jeanAnderson.addGrade(74);
        martha_jeanAnderson.addGrade(76);
        martha_jeanAnderson.addGrade(78);
        martha_jeanAnderson.addGrade(80);
        martha_jeanAnderson.setCourses();
        martha_jeanAnderson.setGrades();
        martha_jeanAnderson.setDetails();
    }
}
