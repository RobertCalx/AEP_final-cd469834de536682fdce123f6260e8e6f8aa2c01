import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class Course_Test {
    ArrayList studentsInCourse= new ArrayList();
    private HashMap grades = new HashMap();

    @Test
    public void numberOfStudentsInCourseTest(){
        Course aep = new Course("aep", studentsInCourse);
        ArrayList chosenCourses = new ArrayList<>();
        chosenCourses.add(aep);
        Student Jan = new Student("BusinessInformatics", StudentStatus.VISITINGSTUDENTRESEARCHER,chosenCourses,null, grades );
        Student Robert = new Student("BusinessInformatics", StudentStatus.FULLTIME.VISITINGSTUDENTRESEARCHER,chosenCourses,null, grades );
        Student Rae = new Student("BusinessInformatics", StudentStatus.FULLTIME,chosenCourses,null, grades );
        aep.addStudentsToCourse(Jan);
        aep.addStudentsToCourse(Robert);
        aep.addStudentsToCourse(Rae);

        assertEquals(3, aep.numberOfStudentsInCourse());
    }




}
