import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
//Test
public class Student_Test {
    @Test
    public void studentShouldBeABusinessInformaticsMajor(){
        ArrayList coursesChosen = new ArrayList<>();
        ArrayList attendedLectures = new ArrayList<>();
        ArrayList studentsInCourse = new ArrayList<>();
        Course aep = new Course("aep", studentsInCourse);
        Lecture aep20220422 = new Lecture(LocalTime.of(12,30), LocalDate.of(2022,04,22),aep);
        Student jan = new Student("businessInformatics", "VisitingResearcher", coursesChosen, attendedLectures);
        jan.attendLecture(aep20220422);
        assertEquals(aep20220422, jan.attendedLectures.get(0));
    }
}
