package javaAssignments.conditionalStatements;

import java.util.Scanner;

//6.
//        Take input of age of 3 people by user and determine oldest and youngest among them.
public class OldestAndYoungestByAge {
    public static void main(String[] args) {
        OldestAndYoungestByAge o=new OldestAndYoungestByAge();
        Scanner s=new Scanner(System.in);
        System.out.println("Input age1: ");
        int age1=s.nextInt();
        System.out.println("Input age2: ");
        int age2=s.nextInt();
        System.out.println("Input age3: ");
        int age3=s.nextInt();
        s.close();
        o.determineOldestAndYoungest(age1,age2,age3);
    }
    public void determineOldestAndYoungest(int age1,int age2,int age3){
        if(age1>0 && age2>0 && age3>0){
            if(age1>age2 && age1>age3){
                System.out.println(age1+" is the oldest");
            }
            else if(age2>age3){
                System.out.println(age2+" is the oldest");
            }
            else {
                System.out.println(age3+" is the oldest");
            }

            if(age1<age2 && age1<age3){
                System.out.println(age1+" is the youngest");
            }
            else if(age2<age3){
                System.out.println(age2+" is the youngest");
            }
            else {
                System.out.println(age3+" is the youngest");
            }
        }
    else
        {
            System.out.println("One of the ages input is 0 so cannot calculate further");
        }
    }
}
