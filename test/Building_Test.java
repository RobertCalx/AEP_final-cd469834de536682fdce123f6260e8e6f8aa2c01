import org.junit.Test;

import java.sql.Time;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Building_Test {
    Building doe = new Building("doe", BuildingRestrictionStatus.RESTRICTEDTOUNIVERSITYMEMBERS);

    @Test
    public void buildingReturnsCorrectRestrictionStatus(){
        assertEquals(BuildingRestrictionStatus.RESTRICTEDTOUNIVERSITYMEMBERS, doe.getBuildingRestrictionStatus());
    }

    @Test
    public void isBuildingOpenOnFridayAtNoon(){
        doe.setOpeningTime(LocalTime.of(6,0));
        doe.setClosingTime(LocalTime.of(23,0));
        LocalTime timeTobeChecked = LocalTime.of(12,0);
        assertTrue(doe.isBuildingOpen(timeTobeChecked));
    }
}
