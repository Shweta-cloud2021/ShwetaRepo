package day3;
//2. Create a class to print the area of a square and a rectangle.
//        The class has two methods with the same name but different number of parameters.
//        The method for printing area of rectangle has two parameters which are length and breadth respectively
//        while the other method for printing area of square has one parameter which is side of square.

public class Area_Square_Rectangle {
    public static void main(String[] args) {
        Area_Square_Rectangle a=new Area_Square_Rectangle();
        double areaOfRectangle=a.printArea(10,3);
        System.out.println("The area of rectangle is "+areaOfRectangle);
        double areaOfSquare=a.printArea(12);
        System.out.println("The area of square is "+areaOfSquare);
    }
    public double printArea(double length, double breadth){

        double areaOfRectangle=0;
        areaOfRectangle=length*breadth;
        return areaOfRectangle;
    }
    public double printArea(double side){

        double areaOfSquare=0;
        areaOfSquare=side*side;
        return areaOfSquare;
    }
}
