import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

//Understands the name and the access status of a building
public class Building {
    private String buildingName;
    private BuildingRestrictionStatus buildingRestrictionStatus;
    private LocalTime openingTime;
    private LocalTime closingTime;

    public Building(String buildingName, BuildingRestrictionStatus buildingRestrictionStatus) {
        this.buildingName = buildingName;
        this.buildingRestrictionStatus = buildingRestrictionStatus;
    }

    public BuildingRestrictionStatus getBuildingRestrictionStatus() {
        return buildingRestrictionStatus;
    }


    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public boolean isBuildingOpen(LocalTime timeToBeVerified) {
        if (timeToBeVerified.isAfter(openingTime)&&timeToBeVerified.isBefore(closingTime))
            return true;
        return false;
    }

}
