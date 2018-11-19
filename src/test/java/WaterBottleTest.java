import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasStartVolume100(){
//    Create a water bottle class with a volume property.
//        The volume should start at 100.
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void hasDrinkFunction(){
//        Add a drink function that takes 10 from the volume each time it is called.
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void hasEmptyFunction(){
//        Create an empty function that brings the volume down to 0.
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void hasFillFunction(){
        assertEquals(100, waterBottle.fill());
    }

}



//        Create a fill function that fills the volume back to 100.