package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleFilter;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;

public class PlantBed<T extends Plant> {

    SimpleList<T> plants;

    public PlantBed(){
        this.plants = new SimpleListImpl<T>();
    }

    public void add (T plant){
        plants.add(plant);
    }

    public int size (){
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color){
        // Filter alle Objekte, die folgende Bedingung erfüllen: O wird gegeben an bedingung
        return plants.filter(o -> (o.getColor() == color) );
    }

    public void remove(T plant){
        plants = plants.filter(o -> (!o.equals(plant)));
    }

}
