package javaAssignments.dataTypes;
//8.
//        Write a program to find the square of the number 3.9.

public class FindSquareOfANumber {
    public static void main(String[] args) {
        FindSquareOfANumber f=new FindSquareOfANumber();
        f.findSquareOfNum(3.9);
    }
    public void findSquareOfNum(double d){
        double squareValue=d*d;
        System.out.println("The square of the number 3.9 is "+squareValue);
    }
    //Output: The square of the number 3.9 is 15.209999999999999
}
