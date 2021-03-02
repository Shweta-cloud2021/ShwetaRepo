package day2;

/*Exercice 3
        Write a program that allows user to enter number of grades(out of 100) and provide them with their
        average, highest & lowest score
        Example: Number of grades : 4 User enters: 50, 78, 69,55 Average : 63
        Highest: 78
        Lowest : 50*/

import java.util.Scanner;

public class Array_Grades_Average_Highest_Lowest {
    public static void main(String[] args) {
        Array_Grades_Average_Highest_Lowest a=new Array_Grades_Average_Highest_Lowest();
        a.calculateGrades();

    }

    public void calculateGrades(){
    int[] arrScores=new int[4];
        System.out.println("Please enter your grades");
        for(int i=0;i<arrScores.length;i++){
            System.out.println("Grade "+(i+1)+": ");
            Scanner sc=new Scanner(System.in);
            int score=sc.nextInt();
            if(score>0 && score<=100){
                arrScores[i]=score;
            }
            else {
                System.out.println("Last entered grade is wrong.");
                calculateGrades();
            }
        }
        calAverage(arrScores);

    }
    public void calAverage(int[] arrScores){
        int total=0;
        double average;
        for(int i=0;i<arrScores.length;i++){
            total=total+arrScores[i];
        }
        average=total/arrScores.length;
        System.out.println("Average is: "+average+"%");

        findHighestScore(arrScores);
    }
    public void findHighestScore(int[] arrScores){
        int max,n;
        max = arrScores[0];
        for(int i = 0; i < arrScores.length; i++)
        {
            if(max < arrScores[i])
            {
                max = arrScores[i];
            }
        }
        System.out.println("Highest score is: "+max);

        findLowestScore(arrScores);
    }
    public void findLowestScore(int[] arrScores){
        int min,n;
        min = arrScores[0];
        for(int i = 0; i < arrScores.length; i++)
        {
            if(min > arrScores[i])
            {
                min = arrScores[i];
            }
        }
        System.out.println("Lowest score is: "+min);

    }

}

