package oopsAssignment;

public class CollegeMain {
    public static void main(String[] args) {
        Library l1=new Library();
        Library l2=new Library("Arts","mn90",true,"Harry","table","wood",65,"Nila","Ji");
        Library l3=new Library("Engineering","po",true,"Mary","chair","iron",50,"Hira","Ji");
        int totalBooksAvailable=Library.numberOfBooksAvailable();
        System.out.println("Total number of books available: "+totalBooksAvailable);
        int totalBooksRented=Library.numberOfBooksRented();
        System.out.println("Total number of books rented: "+totalBooksRented);
        int totalNumberOfChairs=Library.numberOfChairs();
        System.out.println("Total number of chairs: "+totalNumberOfChairs);
        int totalNumberOfStaff=Library.totalStaff();
        System.out.println("Total number of staff: "+totalNumberOfStaff);
        int eldestMemberInLibrary=Library.eldestMemberInLibrary();
        System.out.println(" and age: "+eldestMemberInLibrary);
    }
}
