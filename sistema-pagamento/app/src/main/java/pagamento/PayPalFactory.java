package pagamento;

public class PayPalFactory extends PaymentFactory {
    @Override
    public IPayment createPayment() {
        return new PayPalPayment();
    }
}
