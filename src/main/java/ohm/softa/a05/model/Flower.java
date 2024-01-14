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

    //implement equals hashCode und toString
    @Override
    public boolean equals(Object obj) {
        // prüfe ob obj er selbst ist (genau gleiche Speicheradresse)
        if (this == obj) return true;

        // Muss gleicher Typ sein
        if (!(obj instanceof Flower)) return false;

        Flower temp = (Flower) obj;

        return temp.getHeight() == this.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, family, name, color);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "height=" + height +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
