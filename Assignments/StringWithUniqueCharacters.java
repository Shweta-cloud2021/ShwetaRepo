package day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Problemoo : 2
//        1. Take a value from user
//        2. make sure no char in the input is repeating in the value provided by user
//        I/P 1: Dileep
//        O/P 1: Dilep
//        I/p 2: 21341231
//        o/p 2: 2134
public class StringWithUniqueCharacters {
    public static void main(String[] args) {
        StringWithUniqueCharacters s=new StringWithUniqueCharacters();
        String inputString= s.inputString();
        s.verifyStringIsUnique(inputString);
    }
    public String inputString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString=scanner.next();
        return inputString;
    }
    public void verifyStringIsUnique(String inputString){
        Set<Character> originalInputString=new HashSet<>();
        StringBuilder concatUniqueCharactersFromInputString=new StringBuilder();
        for(int i=0;i<inputString.length();i++){
            if(originalInputString.add(inputString.charAt(i))){
                concatUniqueCharactersFromInputString.append(inputString.charAt(i));
            }
        }
        System.out.println(concatUniqueCharactersFromInputString);
        //System.out.println(originalInputString);
    }
}
