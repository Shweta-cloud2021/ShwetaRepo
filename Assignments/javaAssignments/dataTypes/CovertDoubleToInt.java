package javaAssignments.dataTypes;
//5.
//        Write a program to assign a value of 100.235 to a double variable
//        and then convert it to int.
// Output: Double: 100.235 is converted to int: 100
public class CovertDoubleToInt {
    public static void main(String[] args) {
        double d=100.235;
        CovertDoubleToInt c=new CovertDoubleToInt();
        c.covertDoubleToInt(d);
    }
    public void covertDoubleToInt(double d){
        int i= (int) d;
        System.out.println("Double: "+d+" is converted to int: "+i);
    }
}
