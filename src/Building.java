//Understands the name and the access status of a building
public class Building {
    private String buildingName;
    private BuildingRestrictionStatus buildingRestrictionStatus;

    public Building(String buildingName, BuildingRestrictionStatus buildingRestrictionStatus) {
        this.buildingName = buildingName;
        this.buildingRestrictionStatus = buildingRestrictionStatus;
    }

    public BuildingRestrictionStatus getBuildingRestrictionStatus() {
        return buildingRestrictionStatus;
    }
}
