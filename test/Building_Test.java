import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Building_Test {
    @Test
    public void buildingReturnsCorrectRestrictionStatus(){
        Building doe = new Building("doe", BuildingRestrictionStatus.RESTRICTEDTOUNIVERSITYMEMBERS);
        assertEquals(BuildingRestrictionStatus.RESTRICTEDTOUNIVERSITYMEMBERS, doe.getBuildingRestrictionStatus());
    }
}
