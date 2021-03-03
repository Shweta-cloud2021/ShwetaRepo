package day3;
//1. Create a class named 'PrintNumber' to print various numbers of different
//  datatypes by creating different methods with the same name 'println' having a parameter for each data type.
public class PrintNumber {
    public static void main(String[] args) {
        PrintNumber p=new PrintNumber();
        p.println("Happy");
        p.println(45);
        p.println("Joyful",100);

    }

    public void println(String printStr){
        System.out.println("Overloaded Method with String Arg: "+printStr);
    }
    public void println(int printInt){
        System.out.println("Overloaded Method with Integer Arg: "+printInt);
    }
    public void println(String printStr, int printInt){
        System.out.println("Overloaded Method with both Args - String: "+printStr+" and Integer: "+printInt);
    }
}
