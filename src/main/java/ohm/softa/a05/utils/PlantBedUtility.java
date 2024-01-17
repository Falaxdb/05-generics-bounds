package ohm.softa.a05.utils;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;

public abstract class PlantBedUtility {

    private PlantBedUtility(){}

    public static <T extends Plant> void repot(PlantBed<T> input, PlantColor color, PlantBed<? super T> output){

        SimpleList<? extends T> toExtract = input.getPlantsByColor(color);

        for(T plant: toExtract){
            input.remove(plant);
            output.add(plant);
        }
    }

}
