package day2;

public class Print_Laptop_Details extends Laptop{
    public Print_Laptop_Details(String name, double price, String processor, String ram, String harddrive) {
        super(name, price, processor, ram, harddrive);
    }

    public static void main(String[] args) {

        Print_Laptop_Details l1=new Print_Laptop_Details("Lenovo",50500,"Intel","1GB","HDD");
        Laptop l2=new Laptop("MACBook",99999,"2.0GHz quad-core","8GB","1TB SSD");


    }
}
