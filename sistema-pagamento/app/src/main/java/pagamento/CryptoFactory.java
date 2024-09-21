package pagamento;

public class CryptoFactory extends PaymentFactory {

    @Override
    public IPayment createPayment() {
        return new CryptoPayment();
    }
}
