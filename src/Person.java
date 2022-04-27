//Understands person as an abstract class
//Test
public abstract class Person {
    private String name;
    private String school;

    public String accessBuilding(Building building) {
        if ( building.getBuildingRestrictionStatus().equals(BuildingRestrictionStatus.OPENTOTHEPUBLIC))
        {return "Success";}
        return "Denied";
    }
}
