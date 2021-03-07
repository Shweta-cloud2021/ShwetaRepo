package javaAssignments.conditionalStatements;

import java.util.Scanner;

//1.
//        Take values of length and breadth of a rectangle from user
//        and check if it is square or not.
public class CheckSquareOrNot {
    public static void main(String[] args) {
        CheckSquareOrNot c= new CheckSquareOrNot();
        System.out.println("Checking whether its a square or not");
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter length: ");
        int length=s.nextInt();
        System.out.println("Please enter breadth: ");
        int breadth=s.nextInt();
        s.close();

        c.checkSquareOrNot(length,breadth);

    }
    public void checkSquareOrNot(int length, int breadth){

        if(length==breadth){
            System.out.println("It's a square with length: "+length+" and breadth: "+breadth);
        }
        else {
            System.out.println("It's not a square with length: "+length+" and breadth: "+breadth);
        }
    }

}
