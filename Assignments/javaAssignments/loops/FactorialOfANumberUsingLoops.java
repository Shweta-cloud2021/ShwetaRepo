package javaAssignments.loops;
//5.
//        Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//        4! = 1*2*3*4 = 24 3! = 3*2*1 = 6
//        2! = 2*1 = 2
//        Also,
//        1! = 1
//        0! = 0
//Write a Java program to calculate factorial of a number.

public class FactorialOfANumberUsingLoops {
    public static void main(String[] args) {
        FactorialOfANumberUsingLoops f=new FactorialOfANumberUsingLoops();
        f.factorialOfANumber(6);
    }
   public void factorialOfANumber(int number){
        int product=1;
        for(int i=number;i>=1;i--){
            product=i*product;
        }
       System.out.println("Factorial of the number "+number+" is "+product);
   }

}
