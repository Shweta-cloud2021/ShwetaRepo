package javaAssignments.conditionalStatements;

import java.util.Scanner;

//3.
//        A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//        Ask user for quantity
//        Suppose, one unit will cost 100. Judge and print total cost for user.
public class PrintTotalCostAfterDiscount {
    public static void main(String[] args) {
        PrintTotalCostAfterDiscount p=new PrintTotalCostAfterDiscount();
        Scanner s=new Scanner(System.in);
        System.out.println("Please input quantity: ");
        int i=s.nextInt();
        s.close();

        p.printTotalCostAfterDiscount(i);
    }
    public void printTotalCostAfterDiscount(int quantity){
        int oneUnitCost=100;
        int cost=quantity*oneUnitCost;
        if(cost>1000){
            double discount=0.10*cost;
            double totalCostAfterDiscount=cost-discount;
            System.out.println("Your total purchase cost after 10% discount is "+totalCostAfterDiscount);
        }
        else {
            System.out.println("Your total purchase cost is "+cost);
        }
    }

}
