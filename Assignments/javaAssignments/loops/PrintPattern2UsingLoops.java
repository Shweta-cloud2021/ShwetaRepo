package javaAssignments.loops;
//b.
//        *
//        ***
//        *****
//        ***
//        *
public class PrintPattern2UsingLoops {
    public static void main(String[] args) {
        PrintPattern2UsingLoops p=new PrintPattern2UsingLoops();
        p.printPattern();
    }
    public void printPattern(){
        for (int i = 1; i <= 3; i++){
            int n = 4;
            for(int j = 1; j<= n - i; j++){
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--){
            System.out.print("*");
            }
            for(int l = 2; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2; i >= 1; i--){
            int n = 3;
            for(int j = 0; j<= n - i; j++){
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--){
            System.out.print("*");
            }
            for(int l = 2; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
