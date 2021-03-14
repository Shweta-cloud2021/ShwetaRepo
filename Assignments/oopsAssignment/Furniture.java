package oopsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Furniture{

    public String type;
    public String material;
    public static List<Furniture> furnitureList=new ArrayList<>();
    public static int chairsCount;

    public Furniture() {
        this.type = "chair";
        this.material = "Iron";
        furnitureList.add(this);
    }
    public Furniture(String type, String material) {
        this.type = type;
        this.material = material;
        furnitureList.add(this);
    }


}
