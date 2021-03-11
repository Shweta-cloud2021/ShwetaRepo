package javaAssignments.loops;
//4.
//        Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255.
public class PrintASCIIValuesAndCharactersUsingLoops {
    public static void main(String[] args) {
        PrintASCIIValuesAndCharactersUsingLoops p=new PrintASCIIValuesAndCharactersUsingLoops();
        p.printASCIIValuesAndTheirCharacters();
    }
    public void printASCIIValuesAndTheirCharacters(){
        System.out.println("The ASCII values and their equivalent charcters ->");
        for(int i=0;i<=255;i++){
            System.out.print((char)i);
        }
    }
}
