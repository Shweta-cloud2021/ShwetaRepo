package javaAssignments.conditionalStatements;
//8.
//        A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//        Take following input from user-
//        Number of classes held
//        Number of classes attended.
//        And print percentage of class attended and Is student is allowed to sit in exam or not.

import java.util.Scanner;

public class AttendancePercentage {
    public static void main(String[] args) {
        AttendancePercentage a=new AttendancePercentage();
        Scanner s=new Scanner(System.in);
        System.out.println("Number of classes held: ");
        double numberOfClassesHeld=s.nextDouble();
        System.out.println("Number of classes attended: ");
        double numberOfClassesAttended=s.nextDouble();
        s.close();

        double percentage= a.calculatePercentage(numberOfClassesHeld,numberOfClassesAttended);
        boolean isAllowed= a.isAllowed(percentage);
        if(isAllowed==true){
            System.out.println("Allowed to sit for the exam");
        }
        else {
            System.out.println("Not allowed to sit for the exam");
        }
    }
    public double calculatePercentage(double numberOfClassesHeld,double numberOfClassesAttended){
        if(numberOfClassesAttended!=numberOfClassesHeld && numberOfClassesHeld!=0) {
            double percentage = (numberOfClassesAttended / numberOfClassesHeld) * 100;
            System.out.println("Percentage is " + percentage);
            return percentage;
        }
        else {
                 return 0.0;
        }
    }
    public boolean isAllowed(double percentage){
        if(percentage>=75){
            return true;
        }
        else {
            return false;
        }

    }
}
