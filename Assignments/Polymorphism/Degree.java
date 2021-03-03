package day3;
//3. Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
//        It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name
//        that prints "I am an Undergraduate" and "I am a Postgraduate" respectively.
//        Call the method by creating an object of each of the three classes

public class Degree {
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getDegree();
        Degree d1=new Undergraduate();
        d1.getDegree();
        Degree d2=new PostGraduate();
        d2.getDegree();
    }
    public void getDegree(){
        System.out.println("I got a degree");
    }
}
