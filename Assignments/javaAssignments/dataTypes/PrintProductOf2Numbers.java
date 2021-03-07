package javaAssignments.dataTypes;
//3.
//        Write a program to print the product of the numbers 8.2 and 6.
// Output: Product of the numbers 8.2 & 6 is 49.199999999999996
public class PrintProductOf2Numbers {
    public static void main(String[] args) {
        PrintProductOf2Numbers p=new PrintProductOf2Numbers();
        p.productOf2Numbers(8.2,6);
    }
    public void productOf2Numbers(double d, int i){
        double product=0;
        product=d*i;
        System.out.println("Product of the numbers 8.2 & 6 is "+product);
    }
}
