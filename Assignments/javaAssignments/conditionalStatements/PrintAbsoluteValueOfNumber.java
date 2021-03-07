package javaAssignments.conditionalStatements;

import java.util.Scanner;

//7.
//        Write a program to print absolute value of a number entered by user. E.g.-
//        INPUT: 1 OUTPUT: 1 INPUT: -1 OUTPUT: 1
public class PrintAbsoluteValueOfNumber {
    public static void main(String[] args) {
        PrintAbsoluteValueOfNumber p=new PrintAbsoluteValueOfNumber();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=s.nextInt();
        s.close();

        p.printAbsoluteValue(number);
    }
    public void printAbsoluteValue(int number){
        number=Math.abs(number);
        System.out.println("The absolute value is: "+number);
    }
}
