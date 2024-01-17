package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class ModelClassTests {

    private Flower flower1;
    private Flower flower2;
    private Flower flower3;
    private Flower flower4;

    private Shrub shrub1;
    private Shrub shrub2;

    @BeforeEach
    void setup() {
        flower1 = new Flower(10, "Rose", "Paula", PlantColor.RED);
        flower4 = new Flower(10, "Rose", "Paula", PlantColor.RED);
        flower2 = new Flower(12, "Rose", "Luise", PlantColor.RED);
        flower3 = new Flower(10, "Rose", "Max", PlantColor.YELLOW);

        shrub1 = new Shrub(5, "Busch", "Karl");
        shrub2 = new Shrub(6, "Busch", "Theodor");
    }

    @Test
    void testFlowerCreation(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Flower(10, "Rose", "Paula", PlantColor.GREEN);
        });
    }

    @Test
    void testEquals(){
        assertEquals(flower1, flower4);
        assertNotEquals(flower1, flower2);
    }

    @Test
    void testCompareTo(){
        assertEquals(0, flower1.compareTo(flower3));
    }

}
