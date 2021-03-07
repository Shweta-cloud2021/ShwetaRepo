package javaAssignments.dataTypes;

//1.
//        Write a Java program to print an int, a double and a char on screen.
// Output: Integer : 10
//Double : 99.5
//Char : a
public class PrintIntDoubleChar {
    public static void main(String[] args) {

        PrintIntDoubleChar p=new PrintIntDoubleChar();
        p.printInt(10);
        p.printDouble(99.5);
        p.printChar('a');
    }
    public void printInt(int n){
        System.out.println("Integer : "+n);

    }
    public void printDouble(double d){
        System.out.println("Double : "+d);
    }
    public void printChar(char c){
        System.out.println("Char : "+c);
    }
}
