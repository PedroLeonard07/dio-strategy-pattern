import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(new BigDecimal("250.00"));
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy pixPayment = new PixPayment("pix@email.com");

        order.setPaymentStrategy(creditCardPayment);
        order.processOrder();

        order.setPaymentStrategy(pixPayment);
        order.processOrder();
    }
}
