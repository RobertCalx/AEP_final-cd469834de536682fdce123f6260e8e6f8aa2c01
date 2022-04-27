import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//Test
//Understands a student with its charecteristics and attendedClasses
public class Student extends Person{
    private String major;
    private String status;
    private ArrayList chosenCourses;
    public ArrayList attendedLectures; //How should I make attendedLectures accessible? Making the attribute public or via a getter
    private HashMap<Course, Double> grades;

//Constructor
public Student(String major,StudentStatus  status, ArrayList chosenCourses, ArrayList attendedLectures, HashMap grades) {
    super();
    //Use super constructor here
    this.chosenCourses = chosenCourses;
    this.attendedLectures = attendedLectures;
    this.grades = new HashMap<>();
}


    //add Lecture to list of attended Lectures
    public void attendLecture(Lecture lecture) {
        attendedLectures.add(lecture);
    }

    public void signUpForCourse(Course course) {
        chosenCourses.add(course);
        course.addStudentsToCourse(this);
    }

    public void receiveGrade (Course course, double grade) {
        grades.put(course, grade);
    }

    public double calculateGPA(){
        double size = Double.valueOf(grades.size());
        double sum = grades.values().stream().mapToDouble(i-> i).sum();
        return sum/size;
    }
}
