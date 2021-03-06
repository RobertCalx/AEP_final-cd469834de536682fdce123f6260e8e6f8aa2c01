import java.util.ArrayList;

//Understands a lecturer and his/her taught courses
public class Lecturer {
    private ArrayList taughtCourses;

    public Lecturer(ArrayList taughtCourses) {
        super();
        this.taughtCourses = taughtCourses;
    }

    public void gradeStudent(Course course, Student student, Double grade){ //Is this method correct
        student.receiveGrade(course, grade);
    }

    public String accessBuilding(Building building) {
        if ( building.getBuildingRestrictionStatus().equals(BuildingRestrictionStatus.OPENTOTHEPUBLIC))
            return "Success";
        else if ( building.getBuildingRestrictionStatus().equals(BuildingRestrictionStatus.RESTRICTEDTOUNIVERSITYMEMBERS))
            return "Success";
        else if ( building.getBuildingRestrictionStatus().equals(BuildingRestrictionStatus.RESTRICTEDTOTEACHERS))
            return "Success";
        return "Denied";
    }

    public ArrayList getTaughtCourses() {
        return taughtCourses;
    }

    public void teachNewCourse(Course course) {
        taughtCourses.add(course);
    }
}
