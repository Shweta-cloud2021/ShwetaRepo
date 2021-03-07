package javaAssignments.dataTypes;
//2.
//        Write a program to print the area of a rectangle of sides 2 and 3 units respectively.
// Output: Area of rectangle with length 2 & breadth 3 is : 6
public class PrintAreaOfRectangle {
    public static void main(String[] args) {
        PrintAreaOfRectangle p=new PrintAreaOfRectangle();
        p.printAreaOfRectangle(2,3);
    }
    public void printAreaOfRectangle(int length, int breadth){
        int area=0;
        area=length*breadth;
        System.out.println("Area of rectangle with length 2 & breadth 3 is : "+area);
    }
}
