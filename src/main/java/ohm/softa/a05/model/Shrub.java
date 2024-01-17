package ohm.softa.a05.model;

import java.util.Objects;

public class Shrub extends Plant{

    PlantColor color;

    public Shrub(double height, String family, String name){
        color = PlantColor.GREEN;

        this.height = height;
        this.family = family;
        this.name = name;
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }
}
