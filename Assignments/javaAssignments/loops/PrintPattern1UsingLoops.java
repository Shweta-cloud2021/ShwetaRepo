package javaAssignments.loops;
//2.
//        Print the following patterns using loop :
//        a.
//        *
//        **
//        ***
//        ****
public class PrintPattern1UsingLoops {
    public static void main(String[] args) {
        PrintPattern1UsingLoops p=new PrintPattern1UsingLoops();
        p.printPattern();
    }
    public void printPattern(){
        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
