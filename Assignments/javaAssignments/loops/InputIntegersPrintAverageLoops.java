package javaAssignments.loops;

import java.util.Scanner;

//1.
//        Take 10 integers from keyboard using loop and print their average value on the screen.
public class InputIntegersPrintAverageLoops {
    public static void main(String[] args) {
        int inputNumber=0;
        InputIntegersPrintAverageLoops i=new InputIntegersPrintAverageLoops();
        double average=i.takeIntegersAsInput(10);
        System.out.println("The average is "+average);
    }
    public double takeIntegersAsInput(int inputNumber){
        double newNumber,sum=0;
        System.out.println("Input "+inputNumber+" numbers: ");
        for(int i=0;i<inputNumber;i++){
            Scanner scanner=new Scanner(System.in);
            newNumber=scanner.nextInt();
            sum=sum+newNumber;
        }
        double average=sum/10;
        return average;
    }
}
