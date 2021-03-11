package javaAssignments.loops;
//3.
//        Print multiplication table of 24, 50 and 29 using loop
public class PrintMultiplicationTablesUsingLoops {
    public static void main(String[] args) {
        PrintMultiplicationTablesUsingLoops p=new PrintMultiplicationTablesUsingLoops();
        p.printTables();
    }
    public void printTables(){
        int[] tables={24,50,29};
        int multiplyNumber=0;
        for(int num=0;num<tables.length;num++){
            System.out.println("The table of "+tables[num]+" :");
            for(int i=1;i<=10;i++){
                multiplyNumber=i*tables[num];
                System.out.print(" "+multiplyNumber);
            }
            System.out.println();
        }

    }

}
