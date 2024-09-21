package pagamento;

public class CreditCardFactory extends PaymentFactory {

    @Override
    public IPayment createPayment() {
        return new CreditCardPayment();
    }
}
