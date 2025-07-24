import java.math.BigDecimal;

public class PixPayment implements PaymentStrategy{
    private final String pixKey;

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Pagando R$" + amount + " com a chave pix: " + pixKey);
    }
}
