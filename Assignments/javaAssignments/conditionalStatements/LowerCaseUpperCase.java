package javaAssignments.conditionalStatements;

import java.util.Scanner;

//11.
//        Write a program to check
//        whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
public class LowerCaseUpperCase {
    public static void main(String[] args) {
        LowerCaseUpperCase l=new LowerCaseUpperCase();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a char: ");
        String charString=s.next();
        char c=charString.charAt(0);

        l.lowerCaseOrUpperCase(c);
    }
    public void lowerCaseOrUpperCase(char c){
        if(c>='A' && c<='Z'){
            System.out.println("Entered char "+c+" is in uppercase");
        }
        else if(c>='a' && c<='z'){
            System.out.println("Entered char "+c+" is in lowercase");
        }
        else {
            System.out.println("Wrong input. Try Again");
        }
    }
}
