package javaAssignments.conditionalStatements;
//8.
//        A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//        Take following input from user-
//        Number of classes held
//        Number of classes attended.
//        And print percentage of class attended and Is student is allowed to sit in exam or not.
//9.
//        Modify the above question to allow student to sit if he/she has medical cause.
//        Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

import java.util.Scanner;

public class AttendancePercentageMedicalIssue {
    public static void main(String[] args) {
        AttendancePercentageMedicalIssue a=new AttendancePercentageMedicalIssue();
        Scanner s=new Scanner(System.in);
        System.out.println("Number of classes held: ");
        double numberOfClassesHeld=s.nextDouble();
        System.out.println("Number of classes attended: ");
        double numberOfClassesAttended=s.nextDouble();
        System.out.println("Do you have medical any issue?");
        String yesOrNo=s.next();
        s.close();

        double percentage= a.calculatePercentage(numberOfClassesHeld,numberOfClassesAttended);
        boolean isAllowed= a.isAllowed(percentage,yesOrNo);
        if(isAllowed==true){
            System.out.println("Allowed to sit for the exam");
        }
        else {
            System.out.println("Not allowed to sit for the exam");
        }
    }
    public double calculatePercentage(double numberOfClassesHeld,double numberOfClassesAttended){
    if(numberOfClassesHeld!=0){
    double percentage = (numberOfClassesAttended / numberOfClassesHeld) *100;
            System.out.println("Percentage is " + percentage);
        return percentage;
    }
    else {
            return 0.0;
            }
    }
    public boolean isAllowed(double percentage, String yesOrNo){
        if(percentage>=75 ){
        return true;
        }
        else if(yesOrNo.equals("Y") || yesOrNo.equals("y")){
            return true;
        }
        else {
        return false;
        }

    }
}
