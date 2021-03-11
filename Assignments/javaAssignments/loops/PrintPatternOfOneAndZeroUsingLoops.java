package javaAssignments.loops;
//       1010101
//        10101
//         101
//          1

public class PrintPatternOfOneAndZeroUsingLoops {
    public static void main(String[] args) {
        PrintPatternOfOneAndZeroUsingLoops p=new PrintPatternOfOneAndZeroUsingLoops();
        p.printPattern();
    }
    public void printPattern(){
        int rows = 4;
        for (int i= 0; i< rows ; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<rows-i; k++)
            {
                System.out.print("10");
            }
            System.out.println();
        }

    }

}
