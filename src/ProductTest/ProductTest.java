package ProductTest;

class Product{
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    public Product() {}
}

public class ProductTest {
    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("P1 serial # = " + p1.serialNo);
        System.out.println("P2 serial # = " + p2.serialNo);
        System.out.println("P3 serial # = " + p3.serialNo);
        System.out.println("Total count = " + Product.count);
    }
}
