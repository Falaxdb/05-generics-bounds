package ohm.softa.a05.model;

public abstract class Plant {
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
}
