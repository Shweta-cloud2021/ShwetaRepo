package oopsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Staff{
    public int age;
    public String fName;
    public String lName;
    public static List<Staff> staffList=new ArrayList<>();

    public Staff() {
        this.age=30;
        this.fName="Sita";
        this.lName="Vanshi";
        staffList.add(this);
    }

    public Staff(int age, String fName, String lName) {
        this.age = age;
        this.fName = fName;
        this.lName = lName;
        staffList.add(this);
    }


}
