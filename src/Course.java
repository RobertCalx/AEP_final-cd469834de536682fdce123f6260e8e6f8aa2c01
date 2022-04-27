import java.util.ArrayList;
import java.util.List;
//Test
//Understands the name of a course
public class Course {
    private String name;
    private List  studentsInCourse = new ArrayList();

    public Course(String name, List studentsInCourse) {
        this.name = name;
        this.studentsInCourse = studentsInCourse;
    }

    public void addStudentsToCourse(Student student){
        studentsInCourse.add(student);
    }

    public  int numberOfStudentsInCourse(){
        return studentsInCourse.size();
    }
}
