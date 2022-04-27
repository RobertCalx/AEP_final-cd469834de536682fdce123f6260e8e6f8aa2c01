import java.util.ArrayList;
import java.util.List;
//Test
//Understands a student with its charecteristics and attendedClasses
public class Student extends Person{
    private String major;
    private String status;
    private ArrayList chosenCourses;
    public ArrayList attendedLectures; //How should I make attendedLectures accessible? Making the attribute public or via a getter

//Constructor
    public Student(String major, String status, ArrayList chosenCourses, ArrayList attendedLectures) {
        this.major = major;
        this.status = status;
        this.chosenCourses = chosenCourses;
        this.attendedLectures = attendedLectures;
    }

    //add Lecture to list of attended Lectures
    public void attendLecture(Lecture lecture) {
        attendedLectures.add(lecture);
    }

    public void signUpForCourse(Course course) {
        chosenCourses.add(course);
        course.addStudentsToCourse(this);
    }
}
