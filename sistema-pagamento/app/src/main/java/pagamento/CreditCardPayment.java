package pagamento;

public class CreditCardPayment implements IPayment {
    @Override
    public void processPayment(double amount) {
        System.out.println(
                "Pagamento realizado com sucesso, pago com cartão de crédito");
    }
}
