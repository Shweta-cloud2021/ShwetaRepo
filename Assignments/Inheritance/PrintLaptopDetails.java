package day2;

public class PrintLaptopDetails extends Laptop{
    public PrintLaptopDetails(String name, double price, String processor, String ram, String harddrive) {
        super(name, price, processor, ram, harddrive);
    }

    public static void main(String[] args) {

        PrintLaptopDetails l1=new PrintLaptopDetails("Lenovo",50500,"Intel","1GB","HDD");
        Laptop l2=new Laptop("MACBook",99999,"2.0GHz quad-core","8GB","1TB SSD");


    }
}
