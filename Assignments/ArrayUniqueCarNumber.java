package day2;

import java.util.Random;
import java.util.Scanner;

/*Exercise 1
        Random car digit number

        Write a program to print random & unique car digit number
        ● Take input from user to generate a unique car number
        ● Take format of card number to be MH{Random4digits}: MH3459
        ● Make sure number generated are not duplicate*/
//Problemoo : 1
//        1. Take number of car numbers to be generated
//        2. Generate those many unqiue car numbers in the following format
//        MH{4digits}
//        i/p: 3
//        o/p:
//        MH1234
//        MH1123
//        MH1112
public class ArrayUniqueCarNumber {

    public static void main(String[] args) {
        ArrayUniqueCarNumber a=new ArrayUniqueCarNumber();
        int numberOfUniqueCarNumbersToBeGenerated= a.numberOfCarNumbersToBeGenerated();
        a.generateUniqueCarNumbers(numberOfUniqueCarNumbersToBeGenerated);
    }
    public int numberOfCarNumbersToBeGenerated(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of car numbers to be generated: ");
        int numberOfUniqueCarNumbersToBeGenerated=scanner.nextInt();
        return numberOfUniqueCarNumbersToBeGenerated;
    }
    public void generateUniqueCarNumbers(int number){
        Random random = new Random();
        while(number>0){
            System.out.println("MH"+random.nextInt(10000));
            number--;
        }
    }
}
