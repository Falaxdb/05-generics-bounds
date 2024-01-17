package ohm.softa.a05.model;

import java.util.Objects;

public class Flower extends Plant{

    PlantColor color;

    public Flower(double height, String family, String name, PlantColor color){

        if (color == PlantColor.GREEN){
            throw new IllegalArgumentException("Flowers must not be green.");
        }
        else {
            this.color = color;
        }

        this.height = height;
        this.family = family;
        this.name = name;
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }

}
