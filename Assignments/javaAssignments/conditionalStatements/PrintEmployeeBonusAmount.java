package javaAssignments.conditionalStatements;

import java.util.Scanner;
import java.util.SortedMap;

//4.
//        A company decided to give bonus of 5% to employee if his/her years of service
//        is more than 5 years.
//        Ask user for their salary and year of service and print the net bonus amount.
public class PrintEmployeeBonusAmount {
    public static void main(String[] args) {
        PrintEmployeeBonusAmount p=new PrintEmployeeBonusAmount();
        Scanner s=new Scanner(System.in);
        System.out.println("Please input salary: ");
        int salary=s.nextInt();
        System.out.println("Please input years of service: ");
        int serviceYears=s.nextInt();
        s.close();

        p.printEmployeeBonusAmount(salary,serviceYears);
    }
    public void printEmployeeBonusAmount(int salary, int serviceYears){
        double yearlyPackage=12*salary;
        double bonus=0;
        if(serviceYears>5){
            bonus=0.05*yearlyPackage;
            System.out.println("Your net bonus on annual salary of "+yearlyPackage+" is "+bonus);
        }
        else {
            System.out.println("So, Your net bonus is "+bonus);
        }
    }
}
