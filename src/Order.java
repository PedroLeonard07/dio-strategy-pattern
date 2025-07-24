import java.math.BigDecimal;

public class Order {
    private final BigDecimal total;
    private PaymentStrategy paymentStrategy;

    public Order(BigDecimal total) {
        this.total = total;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        if (paymentStrategy == null) {
            System.out.println("Nenhuma forma de pagamento selecionada");
        } else {
            paymentStrategy.pay(total);
        }
    }
}
