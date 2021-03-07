package javaAssignments.dataTypes;
//6.
//        Write a program to add 3 to the ASCII value of the character 'd'
//        and print the equivalent character.
//Output: The ASCII value after adding 3 to char 'd' is 103
public class Add3ToASCIIValueOfChar {
    public static void main(String[] args) {
        Add3ToASCIIValueOfChar a=new Add3ToASCIIValueOfChar();
        a.add3ToASCIIValueOfChar('d');
    }
    public void add3ToASCIIValueOfChar(char c){
        int asciiValue=c;
        int sum=asciiValue+3;
        System.out.println("The ASCII value after adding 3 to char 'd' is "+sum);
    }
}
