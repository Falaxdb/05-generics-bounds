package ohm.softa.a05.model;

import java.util.Objects;

public abstract class Plant implements Comparable<Plant>{
    double height;
    String family;
    String name;

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public int compareTo(Plant plant) {
        return Double.compare(this.height, plant.height);
    }

    //implement equals hashCode und toString
    @Override
    public boolean equals(Object obj) {
        // prüfe ob obj er selbst ist (genau gleiche Speicheradresse)
        if (this == obj) return true;

        // Muss gleicher Typ sein
        if (!(obj instanceof Plant)) return false;

        Plant temp = (Plant) obj;

        return temp.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, family, name, this.getColor());
    }

    @Override
    public String toString() {
        return "Flower{" +
                "height=" + height +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", color=" + this.getColor() +
                '}';
    }
}
