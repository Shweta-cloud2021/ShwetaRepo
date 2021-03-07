package javaAssignments.dataTypes;
//7.
//        Write a program to add an integer variable having value 5
//        and a double variable having value 6.2.
public class AddIntAndDoubleVars {
    public static void main(String[] args) {
        AddIntAndDoubleVars a=new AddIntAndDoubleVars();
        a.addIntAndDoubleVars(5,6.2);
    }
    public void addIntAndDoubleVars(int i, double d){
        double sum=i+d;
        System.out.println("The sum of int "+5+ " and double "+d+" is "+sum);
    }
    //Output: The sum of int 5 and double 6.2 is 11.2
}
