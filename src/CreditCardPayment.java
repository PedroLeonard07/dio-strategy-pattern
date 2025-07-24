import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Pagando R$" + amount + " com cartão de crédito: " + cardNumber);
    }
}
