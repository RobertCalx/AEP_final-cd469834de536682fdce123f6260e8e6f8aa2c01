//Understands person as an abstract class
//Test
public  class Person {
    private String name;

    public Person (){
    }

    public String accessBuilding(Building building) {
        if ( building.getBuildingRestrictionStatus().equals(BuildingRestrictionStatus.OPENTOTHEPUBLIC))
        {return "Success";}
        return "Denied";
    }
}
