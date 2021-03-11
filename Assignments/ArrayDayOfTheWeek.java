package day2;

/*Exercise 2
        Day of the Week
        1. Make array that holds textual value of days like “Monday, Tuesday etc
        2. Let user input corresponding day
        3. Program should output String that represent day and you can assume week start Monday
        Example: User input 1: Output: Monday*/

import java.util.Scanner;

public class ArrayDayOfTheWeek {

    public static void main(String[] args) {

        ArrayDayOfTheWeek a=new ArrayDayOfTheWeek();
        a.dayOfTheWeek();

    }
    public void dayOfTheWeek(){
        String[] arrDaysOfWeek={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Please select a number for day of the week between 1 & 7: ");
        Scanner s=new Scanner(System.in);
        int dayNum=s.nextInt();
        if(dayNum>1 && dayNum<=7){
            String dayName=arrDaysOfWeek[dayNum-1];
            System.out.println("The corresponding day of the week is "+dayName);
        }
        else {
            dayOfTheWeek();
        }
    }



}
