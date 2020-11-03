import Observable.Product;
import Observers.Customer;

public class Test {

    public static void main(String[] args) {
Product product= new Product("Iphone 11 bro");
        Customer ahmed=new Customer("ahmed");
        Customer mohamed=new Customer("mohamed");
        Customer ali=new Customer("ali");
        product.addobserver(ahmed);
        product.addobserver(mohamed);
        product.addobserver(ali);
        product.deleteobserver(ahmed);
        product.setAvailability(false);
    }}
