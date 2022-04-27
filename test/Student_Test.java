import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
//Test
public class Student_Test {
    private HashMap grades = new HashMap();
    ArrayList coursesChosen = new ArrayList<>();
    ArrayList attendedLectures = new ArrayList<>();
    ArrayList studentsInCourse = new ArrayList<>();
    ArrayList taughtCourses = new ArrayList<>();
    ArrayList taughtCourses2 = new ArrayList<>();
    Lecturer jez = new Lecturer(taughtCourses);
    Course aep = new Course("aep", studentsInCourse);
    Lecturer kurt = new Lecturer(taughtCourses2);
    Course entrepreneurship = new Course("aep", studentsInCourse);
    Student jan = new Student("businessInformatics", StudentStatus.VISITINGSTUDENTRESEARCHER, coursesChosen, attendedLectures, grades);

    @Test
    public void studentShouldBeABusinessInformaticsMajor(){
        Lecture aep20220422 = new Lecture(LocalTime.of(12,30), LocalDate.of(2022,04,22),aep);
        Student jan = new Student("businessInformatics", StudentStatus.VISITINGSTUDENTRESEARCHER, coursesChosen, attendedLectures, grades);
        jan.attendLecture(aep20220422);
        assertEquals(aep20220422, jan.attendedLectures.get(0));
    }

    @Test
    public void studentGPAShouldBeTHREE(){
        taughtCourses.add(aep); //Why can taught courses only be added inside a test method?
        taughtCourses2.add(entrepreneurship);
        jez.gradeStudent(aep,jan,4.0);
        kurt.gradeStudent(entrepreneurship,jan,2.0);
        assertEquals(3.0, jan.calculateGPA(), 0);
    }

    @Test
    public  void studentAccessToLibraryShouldBeSuccesful(){
        Building doe = new Building("doe", BuildingRestrictionStatus.RESTRICTEDTOUNIVERSITYMEMBERS);
        assertEquals("Success", jan.accessBuilding(doe));
    }
}
