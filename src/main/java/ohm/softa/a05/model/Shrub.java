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

    //implement equals hashCode und toString
    @Override
    public boolean equals(Object obj) {
        // prüfe ob obj er selbst ist (genau gleiche Speicheradresse)
        if (this == obj) return true;

        // Muss gleicher Typ sein
        if (!(obj instanceof Shrub)) return false;

        Shrub temp = (Shrub) obj;

        return temp.getName().equals(this.getName());
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
