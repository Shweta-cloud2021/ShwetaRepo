package oopsAssignment;

public class Library {

    public Library(){
        Books b1=new Books();
        Furniture f1=new Furniture();
        Staff s1=new Staff();
    }
    public Library(String department,String isbn,boolean isRented,String author, String type,String material,int age,String fName,String lName){
        Books b2=new Books(department,isbn,isRented,author);
        Furniture f2=new Furniture(type,material);
        Staff s2=new Staff(age,fName,lName);
    }
    public static int numberOfBooksAvailable(){
        int numberOfBooksAvailable=Books.bookList.size();
        return numberOfBooksAvailable;
    }
    public static int numberOfBooksRented(){

        for(int i=0;i<Books.bookList.size();i++){
            if(Books.bookList.get(i).isRented==true){
                Books.countOfRentedBooks++;
            }
        }
        return Books.countOfRentedBooks;
    }
    public static int numberOfChairs(){
        for(int i=0;i<Furniture.furnitureList.size();i++){
            if(Furniture.furnitureList.get(i).type=="chair"){
                Furniture.chairsCount++;
            }
        }
        return Furniture.chairsCount;
    }
    public static int totalStaff(){
        int totalNumberOfStaff=Staff.staffList.size();
        return totalNumberOfStaff;
    }
    public static int eldestMemberInLibrary(){
        int maxAge=Staff.staffList.get(0).age;
        String name = "";
        for(int i=1;i<Staff.staffList.size();i++){
            if(Staff.staffList.get(i).age>maxAge){
                maxAge=Staff.staffList.get(i).age;
                name=Staff.staffList.get(i).fName +" "+Staff.staffList.get(i).lName;
            }
        }
        System.out.print("Eldest member in library is "+name);
        return maxAge;
    }
}
