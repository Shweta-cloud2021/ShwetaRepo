package day2;

/*Exercise 1
        Random car digit number

        Write a program to print random & unique car digit number
        ● Take input from user to generate a unique car number
        ● Take format of card number to be MH{Random4digits}: MH3459
        ● Make sure number generated are not duplicate*/

import java.util.Scanner;

public class Array_Unique_Car_Number {

    public static void main(String[] args) {
         Array_Unique_Car_Number a=new Array_Unique_Car_Number();
         a.carNumber();
    }
    public void carNumber(){
        int[] carNumber=new int[4];
        System.out.println("Enter a 4 digit car number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        if(numbers.length==4){
            for (int i = 0; i < temp.length(); i++) {
                numbers[i] = temp.charAt(i) - '0';
                //System.out.println(numbers[i]);
            }
        }
        else{
            carNumber();

        }
        int i=0,j=0,k=0,l=0;
        for( i = 0; i <numbers.length; i++){
            for( j = 0; j < numbers.length; j++){
                for( k = 0; k < numbers.length; k++){
                    for( l=0;l<numbers.length;l++)
                    /*if(numbers[k] != numbers[i] && numbers[k] != numbers[j] && numbers[i] != numbers[j] && numbers[l] != numbers[k] && numbers[l] != numbers[j] && numbers[l] != numbers[i]){
                       // System.out.println("MH-"+i+j+k+l);
                    }*/
                    /*else {
                        System.out.println("Number is not unique");
                        carNumber();
                    }*/
                        if(numbers[k] == numbers[i] && numbers[k] == numbers[j] && numbers[i] == numbers[j] && numbers[l] == numbers[k] && numbers[l] == numbers[j] && numbers[l] == numbers[i]){
                            System.out.println("Number is not unique");
                            carNumber();
                        }
                }
            }
        }
        System.out.println("The number is unique. MH-" +number);
    }

}
