import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class EcommerceSystem {
    public static void main(String[] args) {

        Product product = new Product(101, "Laptop", 50000);
        Customer customer = new Customer(201, "Sakshi Patil", "123 Kolhapur,Maharashtra");


        product.displayProduct();
        customer.displayCustomer();

        Order order = new Order(product.getProductId(), customer.getCustomerId(), 2, product.getPrice());
        order.placeOrder();
    }
}
