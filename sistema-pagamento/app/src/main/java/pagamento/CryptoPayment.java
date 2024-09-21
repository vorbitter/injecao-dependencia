package pagamento;

public class CryptoPayment implements IPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println(
                "Pagamento realizado com sucesso, pago com crypto");
    }

}
