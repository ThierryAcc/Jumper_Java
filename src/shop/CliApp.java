package shop;

import java.math.BigDecimal;

import shop.account.Account;
import shop.account.BankPaymentMethod;
import shop.account.Customer;
import shop.account.CustomerAddress;
import shop.cart.CartManager;
import shop.order.Order;
import shop.product.Product;
import shop.product.ProductManager;

public class CliApp {

	public static void main(String[] args) {
		ProductManager productmanager = ProductManager.getInstance();

		CustomerAddress customeraddress = new CustomerAddress("Oberdorfstrasse 2", "5222", "Aargau", "Switzerland");
		BankPaymentMethod bankpaymentmethod = new BankPaymentMethod("CH800000000000000000", "700", "ZKB");
		Customer customer = new Customer(1, customeraddress, "thierry.bitz@gmail.com", bankpaymentmethod);
		Account account1 = new Account("Thierry", "1234", customer);
		CartManager cartmanager = new CartManager();

		Product product1 = new Product("Henniez", BigDecimal.valueOf(0.60), 123123);
		Product product2 = new Product("Bananen", BigDecimal.valueOf(0.90), 31233);
		Product product3 = new Product("Salat", BigDecimal.valueOf(1.90), 444);

		product1.addProperty("verpackt", "1");
		product3.addProperty("verpackt", "1");
		product3.addProperty("gewaschen", "2");

		productmanager.addProduct(product1);
		productmanager.addProduct(product2);
		productmanager.addProduct(product3);

		cartmanager.create(account1);
		cartmanager.addItem(10, product1);
		cartmanager.addItem(2, product2);
		cartmanager.addItem(5, product3);
		cartmanager.removeItem(product2);
		
		Order order1 = cartmanager.checkout2();
		System.out.println(order1);
		
	}

}
