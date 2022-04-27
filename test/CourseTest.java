import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
//Test
public class CourseTest {
    ArrayList studentsInCourse= new ArrayList();
    @Test
    public void numberOfStudentsInCourseTest(){
        Course aep = new Course("aep", studentsInCourse);
        ArrayList chosenCourses = new ArrayList<>();
        chosenCourses.add(aep);
        Student Jan = new Student("BusinessInformatics", "visitingResearcher",chosenCourses,null );
        Student Robert = new Student("BusinessInformatics", "visitingResearcher",chosenCourses,null );
        Student Rae = new Student("BusinessInformatics", "visitingResearcher",chosenCourses,null );
        aep.addStudentsToCourse(Jan);
        aep.addStudentsToCourse(Robert);
        aep.addStudentsToCourse(Rae);

        assertEquals(3, aep.numberOfStudentsInCourse());
    }
}
