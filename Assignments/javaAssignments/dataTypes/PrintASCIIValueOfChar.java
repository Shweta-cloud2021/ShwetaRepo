package javaAssignments.dataTypes;
//4.
//        Print the ASCII value of the character 'h'
// Output: The ASCII value of the character 'h' is 104
public class PrintASCIIValueOfChar {
    public static void main(String[] args) {
        PrintASCIIValueOfChar p=new PrintASCIIValueOfChar();
        p.printASCIIValueOfChar('h');
    }
    public void printASCIIValueOfChar(char c){
        int charValue=c;
        System.out.println("The ASCII value of the character 'h' is "+charValue);
    }
}
