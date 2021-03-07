package javaAssignments.conditionalStatements;

import java.util.Scanner;

//2.
//        Take two int values from user and print greatest among them.
public class PrintGreatestValue {
    public static void main(String[] args) {
        PrintGreatestValue p=new PrintGreatestValue();
        Scanner s=new Scanner(System.in);
        System.out.println("Please input 1st number: ");
        int a=s.nextInt();
        System.out.println("Please input 2nd number: ");
        int b=s.nextInt();
        s.close();

        p.printGreatestValue(a,b);
    }
    public void printGreatestValue(int a,int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(a<b){
            System.out.println(b+" is greater than "+a);
        }
        else if(a==b){
            System.out.println(a+" is equal to "+b);
        }
    }
}
